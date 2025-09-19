package net.shardskye.arboretum.world;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.intprovider.WeightedListIntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.chunk.BlockColumn;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.*;
import net.shardskye.arboretum.Arboretum;
import net.shardskye.arboretum.block.ModBlocks;

import java.util.OptionalInt;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> CEDAR_KEY = registerKey("cedar");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_CEDAR_KEY = registerKey("mega_cedar");

    public static final RegistryKey<ConfiguredFeature<?, ?>> CHESTNUT_KEY = registerKey("chestnut");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MPINGO_KEY = registerKey("mpingo");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, CEDAR_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.CEDAR_LOG),
                new StraightTrunkPlacer(5, 2, 1),

                BlockStateProvider.of(ModBlocks.CEDAR_LEAVES),
                new SpruceFoliagePlacer(UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)), new TwoLayersFeatureSize(2, 0, 2))
                .ignoreVines()
                .build());

        register(context, MEGA_CEDAR_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.CEDAR_LOG),
                new GiantTrunkPlacer(13, 2, 14),

                BlockStateProvider.of(ModBlocks.CEDAR_LEAVES),
                new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), UniformIntProvider.create(13, 17)),
                new TwoLayersFeatureSize(1, 1, 2))
                .build());

        register(context, CHESTNUT_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.CHESTNUT_LOG),
                new LargeOakTrunkPlacer(3, 9, 1),

                BlockStateProvider.of(ModBlocks.CHESTNUT_LEAVES),
                new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 3),

                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines()
                .build());

        register(context, MPINGO_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.MPINGO_LOG),
                new ForkingTrunkPlacer(4, 1, 3),

                BlockStateProvider.of(ModBlocks.MPINGO_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 1),

                new TwoLayersFeatureSize(1, 0,2)).ignoreVines()
                .build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Arboretum.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
