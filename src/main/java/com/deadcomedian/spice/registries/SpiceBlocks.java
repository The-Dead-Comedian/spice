package com.deadcomedian.spice.registries;

import com.deadcomedian.spice.Spice;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class SpiceBlocks {


    public static final Block CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));



    public static final Block WARPED_NETHER_BRICKS = registerBlock("warped_nether_bricks",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRACKED_WARPED_NETHER_BRICKS = registerBlock("cracked_warped_nether_bricks",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CHISELED_WARPED_NETHER_BRICKS = registerBlock("chiseled_warped_nether_bricks",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));



    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block CALCITE_PILLAR = registerBlock("calcite_pillar",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CHISELED_CALCITE_PILLAR = registerBlock("chiseled_calcite_pillar",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));



    public static final Block CRACKED_PRISMARINE_BRICKS = registerBlock("cracked_prismarine_bricks",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool()));

    public static final Block POLISHED_PRISMARINE = registerBlock("polished_prismarine",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool()));

    public static final Block PRISMARINE_SCALLOP = registerBlock("prismarine_scallop",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool()));

    public static final Block PRISMARINE_TILES = registerBlock("prismarine_tiles",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool()));

    public static final Block DARK_PRISMARINE_BRICKS = registerBlock("dark_prismarine_bricks",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool()));

    public static final Block DARK_CRACKED_PRISMARINE_BRICKS = registerBlock("dark_cracked_prismarine_bricks",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool()));

    public static final Block DARK_POLISHED_PRISMARINE = registerBlock("dark_polished_prismarine",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool()));

    public static final Block DARK_PRISMARINE_SCALLOP = registerBlock("dark_prismarine_scallop",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool()));

    public static final Block DARK_PRISMARINE_TILES = registerBlock("dark_prismarine_tiles",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool()));



    public static final Block POLISHED_DRIPSTONE = registerBlock("polished_dripstone",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool()));

    public static final Block DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool()));

    public static final Block CRACKED_DRIPSTONE_BRICKS = registerBlock("cracked_dripstone_bricks",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool()));

    public static final Block CHISELED_DRIPSTONE = registerBlock("chiseled_dripstone",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Spice.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Spice.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Spice.LOGGER.info("Registering Mod Blocks for " + Spice.MOD_ID);


    }
}