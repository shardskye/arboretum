package net.shardskye.arboretum.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.shardskye.arboretum.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.CHESTNUT_LOG.asItem())
                .add(ModBlocks.CHESTNUT_WOOD.asItem())
                .add(ModBlocks.STRIPPED_CHESTNUT_LOG.asItem())
                .add(ModBlocks.STRIPPED_CHESTNUT_WOOD.asItem())
                .add(ModBlocks.CEDAR_LOG.asItem())
                .add(ModBlocks.CEDAR_WOOD.asItem())
                .add(ModBlocks.STRIPPED_CEDAR_LOG.asItem())
                .add(ModBlocks.STRIPPED_CEDAR_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.CHESTNUT_PLANKS.asItem())
                .add(ModBlocks.CEDAR_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(ModBlocks.CHESTNUT_SAPLING.asItem())
                .add(ModBlocks.CEDAR_SAPLING.asItem());

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(ModBlocks.CEDAR_LEAVES.asItem())
                .add(ModBlocks.CHESTNUT_LEAVES.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(ModBlocks.CHESTNUT_BUTTON.asItem())
                .add(ModBlocks.CEDAR_BUTTON.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(ModBlocks.CEDAR_DOOR.asItem())
                .add(ModBlocks.CHESTNUT_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(ModBlocks.CEDAR_FENCE.asItem())
                .add(ModBlocks.CHESTNUT_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(ModBlocks.CEDAR_FENCE_GATE.asItem())
                .add(ModBlocks.CHESTNUT_FENCE_GATE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(ModBlocks.CEDAR_SLAB.asItem())
                .add(ModBlocks.CHESTNUT_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(ModBlocks.CEDAR_STAIRS.asItem())
                .add(ModBlocks.CHESTNUT_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.CEDAR_PRESSURE_PLATE.asItem())
                .add(ModBlocks.CHESTNUT_PRESSURE_PLATE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.CHESTNUT_TRAPDOOR.asItem())
                .add(ModBlocks.CEDAR_TRAPDOOR.asItem());
    }
}
