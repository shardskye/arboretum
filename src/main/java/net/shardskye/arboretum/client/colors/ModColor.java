package net.shardskye.arboretum.client.colors;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.world.biome.FoliageColors;
import net.shardskye.arboretum.block.ModBlocks;

public class ModColor {
    public static void createBlockColors() {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                    if (world == null || pos == null) {
                        return FoliageColors.getDefaultColor();
                    }
                    return BiomeColors.getFoliageColor(world, pos);
                }
                , ModBlocks.CEDAR_LEAVES);

    }

    public static void createItemColors() {
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor()
                , ModBlocks.CEDAR_LEAVES.asItem());

    }
}
