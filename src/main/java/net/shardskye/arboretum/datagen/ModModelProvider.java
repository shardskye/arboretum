package net.shardskye.arboretum.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.TexturedModel;
import net.shardskye.arboretum.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        // CHESTNUT

        BlockStateModelGenerator.BlockTexturePool chestnutPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHESTNUT_PLANKS);

        chestnutPlankPool.stairs(ModBlocks.CHESTNUT_STAIRS);
        chestnutPlankPool.slab(ModBlocks.CHESTNUT_SLAB);

        chestnutPlankPool.fence(ModBlocks.CHESTNUT_FENCE);
        chestnutPlankPool.fenceGate(ModBlocks.CHESTNUT_FENCE_GATE);

        chestnutPlankPool.pressurePlate(ModBlocks.CHESTNUT_PRESSURE_PLATE);
        chestnutPlankPool.button(ModBlocks.CHESTNUT_BUTTON);

        blockStateModelGenerator.registerDoor(ModBlocks.CHESTNUT_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CHESTNUT_TRAPDOOR);

        blockStateModelGenerator.registerLog(ModBlocks.CHESTNUT_LOG).log(ModBlocks.CHESTNUT_LOG).wood(ModBlocks.CHESTNUT_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_CHESTNUT_LOG).log(ModBlocks.STRIPPED_CHESTNUT_LOG).wood(ModBlocks.STRIPPED_CHESTNUT_WOOD);

        blockStateModelGenerator.registerSingleton(ModBlocks.CHESTNUT_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.CHESTNUT_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        // CEDAR

        BlockStateModelGenerator.BlockTexturePool cedarPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CEDAR_PLANKS);

        cedarPlankPool.stairs(ModBlocks.CEDAR_STAIRS);
        cedarPlankPool.slab(ModBlocks.CEDAR_SLAB);

        cedarPlankPool.fence(ModBlocks.CEDAR_FENCE);
        cedarPlankPool.fenceGate(ModBlocks.CEDAR_FENCE_GATE);

        cedarPlankPool.pressurePlate(ModBlocks.CEDAR_PRESSURE_PLATE);
        cedarPlankPool.button(ModBlocks.CEDAR_BUTTON);

        blockStateModelGenerator.registerDoor(ModBlocks.CEDAR_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CEDAR_TRAPDOOR);

        blockStateModelGenerator.registerLog(ModBlocks.CEDAR_LOG).log(ModBlocks.CEDAR_LOG).wood(ModBlocks.CEDAR_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_CEDAR_LOG).log(ModBlocks.STRIPPED_CEDAR_LOG).wood(ModBlocks.STRIPPED_CEDAR_WOOD);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
