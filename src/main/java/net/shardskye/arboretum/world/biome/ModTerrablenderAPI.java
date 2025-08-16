package net.shardskye.arboretum.world.biome;

import net.minecraft.util.Identifier;
import net.shardskye.arboretum.Arboretum;
import net.shardskye.arboretum.world.biome.surface.ModSurfaceMaterialRules;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(Identifier.of(Arboretum.MOD_ID, "overworld"), 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, Arboretum.MOD_ID, ModSurfaceMaterialRules.makeRules());
    }
}
