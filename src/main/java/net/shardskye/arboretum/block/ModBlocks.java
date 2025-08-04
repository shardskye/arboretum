package net.shardskye.arboretum.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.shardskye.arboretum.Arboretum;

public class ModBlocks {
    public static final Block CHESTNUT_LOG = registerBlock("chestnut_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block CHESTNUT_WOOD = registerBlock("chestnut_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_CHESTNUT_LOG = registerBlock("stripped_chestnut_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STRIPPED_CHESTNUT_WOOD = registerBlock("stripped_chestnut_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block CHESTNUT_PLANKS = registerBlock("chestnut_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    public static final Block CHESTNUT_STAIRS = registerBlock("chestnut_stairs",
            new StairsBlock(ModBlocks.CHESTNUT_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));
    public static final Block CHESTNUT_SLAB = registerBlock("chestnut_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));

    public static final Block CHESTNUT_FENCE = registerBlock("chestnut_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));
    public static final Block CHESTNUT_FENCE_GATE = registerBlock("chestnut_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));

    public static final Block CHESTNUT_DOOR = registerBlock("chestnut_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_DOOR)));
    public static final Block CHESTNUT_TRAPDOOR = registerBlock("chestnut_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR)));

    public static final Block CHESTNUT_BUTTON = registerBlock("chestnut_button",
            new ButtonBlock(BlockSetType.OAK, 10, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)));
    public static final Block CHESTNUT_PRESSURE_PLATE = registerBlock("chestnut_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Arboretum.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Arboretum.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Arboretum.LOGGER.info("Registering Mod Blocks for " + Arboretum.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.CHESTNUT_LOG);
            fabricItemGroupEntries.add(ModBlocks.STRIPPED_CHESTNUT_LOG);
            fabricItemGroupEntries.add(ModBlocks.CHESTNUT_WOOD);
            fabricItemGroupEntries.add(ModBlocks.STRIPPED_CHESTNUT_WOOD);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.CHESTNUT_PLANKS);
            fabricItemGroupEntries.add(ModBlocks.CHESTNUT_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.CHESTNUT_SLAB);
            fabricItemGroupEntries.add(ModBlocks.CHESTNUT_FENCE);
            fabricItemGroupEntries.add(ModBlocks.CHESTNUT_FENCE_GATE);
            fabricItemGroupEntries.add(ModBlocks.CHESTNUT_DOOR);
            fabricItemGroupEntries.add(ModBlocks.CHESTNUT_TRAPDOOR);
            fabricItemGroupEntries.add(ModBlocks.CHESTNUT_PRESSURE_PLATE);
            fabricItemGroupEntries.add(ModBlocks.CHESTNUT_BUTTON);
        });
    }
}
