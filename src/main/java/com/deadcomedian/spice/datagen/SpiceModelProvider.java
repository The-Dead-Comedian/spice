package com.deadcomedian.spice.datagen;

import com.deadcomedian.spice.registries.SpiceBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class SpiceModelProvider extends FabricModelProvider {
    public SpiceModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CHISELED_RED_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CRACKED_RED_NETHER_BRICKS);

        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.WARPED_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CHISELED_WARPED_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CRACKED_WARPED_NETHER_BRICKS);

        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.POLISHED_CALCITE);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CALCITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CALCITE_PILLAR);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CHISELED_CALCITE_PILLAR);

        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CRACKED_PRISMARINE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.POLISHED_PRISMARINE);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.PRISMARINE_SCALLOP);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.PRISMARINE_TILES);

        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.DARK_PRISMARINE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.DARK_CRACKED_PRISMARINE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.DARK_POLISHED_PRISMARINE);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.DARK_PRISMARINE_SCALLOP);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.DARK_PRISMARINE_TILES);

        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.POLISHED_DRIPSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.DRIPSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CRACKED_DRIPSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CHISELED_DRIPSTONE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {


    }
}
