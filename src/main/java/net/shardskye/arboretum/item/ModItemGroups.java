package net.shardskye.arboretum.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.shardskye.arboretum.Arboretum;
import net.shardskye.arboretum.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup ARBORETUM_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Arboretum.MOD_ID, "arboretum_item_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.CHESTNUT_PLANKS))
                    .displayName(Text.translatable("itemgroup.arboretum.arboretum_item_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CEDAR_LOG);
                        entries.add(ModBlocks.STRIPPED_CEDAR_LOG);
                        entries.add(ModBlocks.CEDAR_WOOD);
                        entries.add(ModBlocks.STRIPPED_CEDAR_WOOD);
                        entries.add(ModBlocks.CEDAR_SAPLING);
                        entries.add(ModBlocks.CEDAR_PLANKS);
                        entries.add(ModBlocks.CEDAR_STAIRS);
                        entries.add(ModBlocks.CEDAR_SLAB);
                        entries.add(ModBlocks.CEDAR_FENCE);
                        entries.add(ModBlocks.CEDAR_FENCE_GATE);
                        entries.add(ModBlocks.CEDAR_DOOR);
                        entries.add(ModBlocks.CEDAR_TRAPDOOR);
                        entries.add(ModBlocks.CEDAR_BUTTON);
                        entries.add(ModBlocks.CEDAR_PRESSURE_PLATE);
                        entries.add(ModBlocks.CHESTNUT_LOG);
                        entries.add(ModBlocks.STRIPPED_CHESTNUT_LOG);
                        entries.add(ModBlocks.CHESTNUT_WOOD);
                        entries.add(ModBlocks.STRIPPED_CHESTNUT_WOOD);
                        entries.add(ModBlocks.CHESTNUT_SAPLING);
                        entries.add(ModBlocks.CHESTNUT_PLANKS);
                        entries.add(ModBlocks.CHESTNUT_STAIRS);
                        entries.add(ModBlocks.CHESTNUT_SLAB);
                        entries.add(ModBlocks.CHESTNUT_FENCE);
                        entries.add(ModBlocks.CHESTNUT_FENCE_GATE);
                        entries.add(ModBlocks.CHESTNUT_DOOR);
                        entries.add(ModBlocks.CHESTNUT_TRAPDOOR);
                        entries.add(ModBlocks.CHESTNUT_BUTTON);
                        entries.add(ModBlocks.CHESTNUT_PRESSURE_PLATE);
                    }).build());



    public static void registerItemGroups() {
        Arboretum.LOGGER.info("Registering Item Groups for " + Arboretum.MOD_ID);
    }
}
