package net.shardskye.arboretum;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.shardskye.arboretum.block.ModBlocks;
import net.shardskye.arboretum.client.colors.ModColor;

public class ArboretumClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        //colors
        ModColor.createBlockColors();
        ModColor.createItemColors();

    }
}
