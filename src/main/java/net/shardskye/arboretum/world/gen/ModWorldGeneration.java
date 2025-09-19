package net.shardskye.arboretum.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.shardskye.arboretum.world.ModPlacedFeatures;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        ModWorldGeneration.generateTrees();
    }

    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WOODED_BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MPINGO_PLACED_KEY);

    }
}
