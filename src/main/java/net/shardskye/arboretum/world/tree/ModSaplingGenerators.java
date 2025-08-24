package net.shardskye.arboretum.world.tree;

import net.minecraft.block.SaplingGenerator;
import net.shardskye.arboretum.Arboretum;
import net.shardskye.arboretum.world.ModConfiguredFeatures;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator CEDAR = new SaplingGenerator(Arboretum.MOD_ID + ":cedar",
            Optional.of(ModConfiguredFeatures.MEGA_CEDAR_KEY), Optional.of(ModConfiguredFeatures.CEDAR_KEY), Optional.empty());

    public static final SaplingGenerator CHESTNUT = new SaplingGenerator(Arboretum.MOD_ID + ":chestnut",
            Optional.empty(), Optional.of(ModConfiguredFeatures.CHESTNUT_KEY), Optional.empty());
}
