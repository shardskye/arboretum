package net.shardskye.arboretum.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.shardskye.arboretum.Arboretum;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Arboretum.MOD_ID, name));
        }
    }

        public static class Items {
            public static final TagKey<Item> CHESTNUT_LOGS = createTag("chestnut_logs");

            private static TagKey<Item> createTag(String name) {
                return TagKey.of(RegistryKeys.ITEM, Identifier.of(Arboretum.MOD_ID, name));
            }
        }
    }
