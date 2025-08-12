package net.shardskye.arboretum.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.shardskye.arboretum.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // CHESTNUT

        addDrop(ModBlocks.CHESTNUT_LOG);
        addDrop(ModBlocks.STRIPPED_CHESTNUT_LOG);
        addDrop(ModBlocks.CHESTNUT_WOOD);
        addDrop(ModBlocks.STRIPPED_CHESTNUT_WOOD);

        addDrop(ModBlocks.CHESTNUT_PLANKS);
        addDrop(ModBlocks.CHESTNUT_STAIRS);
        addDrop(ModBlocks.CHESTNUT_SLAB, slabDrops(ModBlocks.CHESTNUT_SLAB));

        addDrop(ModBlocks.CHESTNUT_FENCE);
        addDrop(ModBlocks.CHESTNUT_FENCE_GATE);

        addDrop(ModBlocks.CHESTNUT_PRESSURE_PLATE);
        addDrop(ModBlocks.CHESTNUT_BUTTON);

        addDrop(ModBlocks.CHESTNUT_DOOR, doorDrops(ModBlocks.CHESTNUT_DOOR));
        addDrop(ModBlocks.CHESTNUT_TRAPDOOR);

        // CEDAR

        addDrop(ModBlocks.CEDAR_PLANKS);
    }
}
