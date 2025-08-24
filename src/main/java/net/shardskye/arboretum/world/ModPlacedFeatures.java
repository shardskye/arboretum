package net.shardskye.arboretum.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.shardskye.arboretum.Arboretum;
import net.shardskye.arboretum.block.ModBlocks;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> CEDAR_PLACED_KEY = registerKey("cedar_placed");
    public static final RegistryKey<PlacedFeature> MEGA_CEDAR_PLACED_KEY = registerKey("mega_cedar_placed");
    public static final RegistryKey<PlacedFeature> CHESTNUT_PLACED_KEY = registerKey("chestnut_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, CEDAR_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CEDAR_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(4, 0.1f, 2), ModBlocks.CEDAR_SAPLING));
        register(context, MEGA_CEDAR_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MEGA_CEDAR_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(4, 0.1f, 2), ModBlocks.CEDAR_SAPLING));

        register(context, CHESTNUT_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHESTNUT_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(4, 0.1f, 2), ModBlocks.CHESTNUT_SAPLING));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Arboretum.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
