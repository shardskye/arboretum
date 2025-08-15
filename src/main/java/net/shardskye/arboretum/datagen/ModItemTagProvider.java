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
    }
}
