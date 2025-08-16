package net.shardskye.arboretum.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.shardskye.arboretum.Arboretum;
import net.shardskye.arboretum.world.tree.ModSaplingGenerators;

public class ModBlocks {
    // CHESTNUT

    public static final Block CHESTNUT_LOG = registerBlock("chestnut_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BROWN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block CHESTNUT_WOOD = registerBlock("chestnut_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BROWN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block STRIPPED_CHESTNUT_LOG = registerBlock("stripped_chestnut_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BROWN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block STRIPPED_CHESTNUT_WOOD = registerBlock("stripped_chestnut_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BROWN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));

    public static final Block CHESTNUT_LEAVES = registerBlock("chestnut_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.SPRUCE_BROWN)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static final Block CHESTNUT_SAPLING = registerBlock("chestnut_sapling",
            new SaplingBlock(ModSaplingGenerators.CHESTNUT, AbstractBlock.Settings.create()
                    .mapColor(MapColor.SPRUCE_BROWN)
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CHESTNUT_PLANKS = registerBlock("chestnut_planks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BROWN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block CHESTNUT_STAIRS = registerBlock("chestnut_stairs",
            new StairsBlock(ModBlocks.CHESTNUT_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BROWN)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()));
    public static final Block CHESTNUT_SLAB = registerBlock("chestnut_slab",
            new SlabBlock((AbstractBlock.Settings.create()
                    .mapColor(MapColor.BROWN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable())));

    public static final Block CHESTNUT_FENCE = registerBlock("chestnut_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BROWN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block CHESTNUT_FENCE_GATE = registerBlock("chestnut_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create()
                    .mapColor(MapColor.BROWN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));

    public static final Block CHESTNUT_DOOR = registerBlock("chestnut_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create()
                    .mapColor(MapColor.BROWN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block CHESTNUT_TRAPDOOR = registerBlock("chestnut_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create()
                    .mapColor(MapColor.BROWN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));

    public static final Block CHESTNUT_BUTTON = registerBlock("chestnut_button",
            new ButtonBlock(BlockSetType.OAK, 10, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)));
    public static final Block CHESTNUT_PRESSURE_PLATE = registerBlock("chestnut_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));

    // CEDAR

    public static final Block CEDAR_LOG = registerBlock("cedar_log",
            new PillarBlock(AbstractBlock.Settings.create()
                            .mapColor(MapColor.ORANGE)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()));
    public static final Block CEDAR_WOOD = registerBlock("cedar_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block STRIPPED_CEDAR_LOG = registerBlock("stripped_cedar_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block STRIPPED_CEDAR_WOOD = registerBlock("stripped_cedar_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));

    public static final Block CEDAR_LEAVES = registerBlock("cedar_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_GREEN)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static final Block CEDAR_SAPLING = registerBlock("cedar_sapling",
            new SaplingBlock(ModSaplingGenerators.CEDAR, AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CEDAR_PLANKS = registerBlock("cedar_planks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block CEDAR_STAIRS = registerBlock("cedar_stairs",
            new StairsBlock(ModBlocks.CEDAR_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.ORANGE)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()));
    public static final Block CEDAR_SLAB = registerBlock("cedar_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));

    public static final Block CEDAR_FENCE = registerBlock("cedar_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block CEDAR_FENCE_GATE = registerBlock("cedar_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));

    public static final Block CEDAR_DOOR = registerBlock("cedar_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));
    public static final Block CEDAR_TRAPDOOR = registerBlock("cedar_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));

    public static final Block CEDAR_BUTTON = registerBlock("cedar_button",
            new ButtonBlock(BlockSetType.OAK, 10, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)));
    public static final Block CEDAR_PRESSURE_PLATE = registerBlock("cedar_pressure_plate",
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
            fabricItemGroupEntries.add(ModBlocks.CEDAR_LOG);
            fabricItemGroupEntries.add(ModBlocks.CEDAR_WOOD);
            fabricItemGroupEntries.add(ModBlocks.CHESTNUT_LOG);
            fabricItemGroupEntries.add(ModBlocks.CHESTNUT_WOOD);
            fabricItemGroupEntries.add(ModBlocks.CEDAR_LEAVES);
            fabricItemGroupEntries.add(ModBlocks.CHESTNUT_LEAVES);
            fabricItemGroupEntries.add(ModBlocks.CEDAR_LEAVES);
            fabricItemGroupEntries.add(ModBlocks.CEDAR_SAPLING);
            fabricItemGroupEntries.add(ModBlocks.CHESTNUT_SAPLING);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.CEDAR_LOG);
            fabricItemGroupEntries.add(ModBlocks.CEDAR_WOOD);
            fabricItemGroupEntries.add(ModBlocks.STRIPPED_CEDAR_LOG);
            fabricItemGroupEntries.add(ModBlocks.STRIPPED_CEDAR_WOOD);
            fabricItemGroupEntries.add(ModBlocks.CEDAR_PLANKS);
            fabricItemGroupEntries.add(ModBlocks.CEDAR_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.CEDAR_SLAB);
            fabricItemGroupEntries.add(ModBlocks.CEDAR_FENCE);
            fabricItemGroupEntries.add(ModBlocks.CEDAR_FENCE_GATE);
            fabricItemGroupEntries.add(ModBlocks.CEDAR_DOOR);
            fabricItemGroupEntries.add(ModBlocks.CEDAR_TRAPDOOR);
            fabricItemGroupEntries.add(ModBlocks.CEDAR_PRESSURE_PLATE);
            fabricItemGroupEntries.add(ModBlocks.CEDAR_BUTTON);
            fabricItemGroupEntries.add(ModBlocks.CHESTNUT_LOG);
            fabricItemGroupEntries.add(ModBlocks.CHESTNUT_WOOD);
            fabricItemGroupEntries.add(ModBlocks.STRIPPED_CHESTNUT_LOG);
            fabricItemGroupEntries.add(ModBlocks.STRIPPED_CHESTNUT_WOOD);
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
