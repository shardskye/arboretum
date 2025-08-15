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

        addDrop(ModBlocks.CHESTNUT_LEAVES, leavesDrops(ModBlocks.CHESTNUT_LEAVES, ModBlocks.CHESTNUT_SAPLING, 0.0625f));
        addDrop(ModBlocks.CHESTNUT_SAPLING);

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

        addDrop(ModBlocks.CEDAR_LOG);
        addDrop(ModBlocks.STRIPPED_CEDAR_LOG);
        addDrop(ModBlocks.CEDAR_WOOD);
        addDrop(ModBlocks.STRIPPED_CEDAR_WOOD);

        addDrop(ModBlocks.CEDAR_LEAVES, leavesDrops(ModBlocks.CEDAR_LEAVES, ModBlocks.CEDAR_SAPLING, 0.0625f));
        addDrop(ModBlocks.CEDAR_SAPLING);

        addDrop(ModBlocks.CEDAR_PLANKS);
        addDrop(ModBlocks.CEDAR_STAIRS);
        addDrop(ModBlocks.CEDAR_SLAB, slabDrops(ModBlocks.CEDAR_SLAB));

        addDrop(ModBlocks.CEDAR_FENCE);
        addDrop(ModBlocks.CEDAR_FENCE_GATE);

        addDrop(ModBlocks.CEDAR_PRESSURE_PLATE);
        addDrop(ModBlocks.CEDAR_BUTTON);

        addDrop(ModBlocks.CEDAR_DOOR, doorDrops(ModBlocks.CEDAR_DOOR));
        addDrop(ModBlocks.CEDAR_TRAPDOOR);
    }
}
