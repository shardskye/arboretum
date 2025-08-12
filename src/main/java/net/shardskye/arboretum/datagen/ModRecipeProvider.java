package net.shardskye.arboretum.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.shardskye.arboretum.block.ModBlocks;
import net.shardskye.arboretum.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        // CHESTNUT

        offerPlanksRecipe(recipeExporter, ModBlocks.CHESTNUT_PLANKS, ModTags.Items.CHESTNUT_LOGS, 4);
        offerPressurePlateRecipe(recipeExporter, ModBlocks.CHESTNUT_PRESSURE_PLATE, ModBlocks.CHESTNUT_PLANKS);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHESTNUT_SLAB, ModBlocks.CHESTNUT_PLANKS);
        createStairsRecipe(ModBlocks.CHESTNUT_STAIRS, Ingredient.ofItems(ModBlocks.CHESTNUT_PLANKS)).criterion(hasItem(ModBlocks.CHESTNUT_PLANKS), conditionsFromItem(ModBlocks.CHESTNUT_PLANKS)).offerTo(recipeExporter, Identifier.of("chestnut_stairs"));
        offerSingleOutputShapelessRecipe(recipeExporter, ModBlocks.CHESTNUT_BUTTON, ModBlocks.CHESTNUT_PLANKS, "button");
        createTrapdoorRecipe(ModBlocks.CHESTNUT_TRAPDOOR, Ingredient.ofItems(ModBlocks.CHESTNUT_PLANKS)).criterion(hasItem(ModBlocks.CHESTNUT_PLANKS), conditionsFromItem(ModBlocks.CHESTNUT_PLANKS)).offerTo(recipeExporter, Identifier.of("chestnut_trapdoor"));
        createDoorRecipe(ModBlocks.CHESTNUT_DOOR, Ingredient.ofItems(ModBlocks.CHESTNUT_PLANKS)).criterion(hasItem(ModBlocks.CHESTNUT_PLANKS), conditionsFromItem(ModBlocks.CHESTNUT_PLANKS)).offerTo(recipeExporter, Identifier.of("chestnut_door"));
        createFenceGateRecipe(ModBlocks.CHESTNUT_FENCE_GATE, Ingredient.ofItems(ModBlocks.CHESTNUT_PLANKS)).criterion(hasItem(ModBlocks.CHESTNUT_PLANKS), conditionsFromItem(ModBlocks.CHESTNUT_PLANKS)).offerTo(recipeExporter, Identifier.of("chestnut_fence_gate"));
        createFenceRecipe(ModBlocks.CHESTNUT_FENCE, Ingredient.ofItems(ModBlocks.CHESTNUT_PLANKS)).criterion(hasItem(ModBlocks.CHESTNUT_PLANKS), conditionsFromItem(ModBlocks.CHESTNUT_PLANKS)).offerTo(recipeExporter, Identifier.of("chestnut_fence"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_CHESTNUT_WOOD, 3)
                .pattern("RR")
                .pattern("RR")
                .input(Character.valueOf('R'), ModBlocks.STRIPPED_CHESTNUT_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_CHESTNUT_LOG), conditionsFromItem(ModBlocks.STRIPPED_CHESTNUT_LOG))
                .offerTo(recipeExporter, Identifier.of("stripped_chestnut_wood_craft"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHESTNUT_WOOD, 4)
                .pattern("RR")
                .pattern("RR")
                .input(Character.valueOf('R'), ModBlocks.CHESTNUT_LOG)
                .criterion(hasItem(ModBlocks.CHESTNUT_LOG), conditionsFromItem(ModBlocks.CHESTNUT_LOG))
                .offerTo(recipeExporter, Identifier.of("chestnut_wood_craft"));

        // CEDAR

        offerPressurePlateRecipe(recipeExporter, ModBlocks.CEDAR_PRESSURE_PLATE, ModBlocks.CEDAR_PLANKS);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CEDAR_SLAB, ModBlocks.CEDAR_PLANKS);
        createStairsRecipe(ModBlocks.CEDAR_STAIRS, Ingredient.ofItems(ModBlocks.CEDAR_PLANKS)).criterion(hasItem(ModBlocks.CEDAR_PLANKS), conditionsFromItem(ModBlocks.CEDAR_PLANKS)).offerTo(recipeExporter, Identifier.of("cedar_stairs"));
        offerSingleOutputShapelessRecipe(recipeExporter, ModBlocks.CEDAR_BUTTON, ModBlocks.CEDAR_PLANKS, "button");
        createTrapdoorRecipe(ModBlocks.CEDAR_TRAPDOOR, Ingredient.ofItems(ModBlocks.CEDAR_PLANKS)).criterion(hasItem(ModBlocks.CEDAR_PLANKS), conditionsFromItem(ModBlocks.CEDAR_PLANKS)).offerTo(recipeExporter, Identifier.of("cedar_trapdoor"));
        createDoorRecipe(ModBlocks.CEDAR_DOOR, Ingredient.ofItems(ModBlocks.CEDAR_PLANKS)).criterion(hasItem(ModBlocks.CEDAR_PLANKS), conditionsFromItem(ModBlocks.CEDAR_PLANKS)).offerTo(recipeExporter, Identifier.of("cedar_door"));
        createFenceGateRecipe(ModBlocks.CEDAR_FENCE_GATE, Ingredient.ofItems(ModBlocks.CEDAR_PLANKS)).criterion(hasItem(ModBlocks.CEDAR_PLANKS), conditionsFromItem(ModBlocks.CEDAR_PLANKS)).offerTo(recipeExporter, Identifier.of("cedar_fence_gate"));
        createFenceGateRecipe(ModBlocks.CEDAR_FENCE, Ingredient.ofItems(ModBlocks.CEDAR_PLANKS)).criterion(hasItem(ModBlocks.CEDAR_PLANKS), conditionsFromItem(ModBlocks.CEDAR_PLANKS)).offerTo(recipeExporter, Identifier.of("cedar_fence"));

    }
}
