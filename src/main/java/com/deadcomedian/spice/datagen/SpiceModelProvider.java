package com.deadcomedian.spice.datagen;

import com.deadcomedian.spice.registries.SpiceBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class SpiceModelProvider extends FabricModelProvider {
    public SpiceModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        //BRICKS
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.POLISHED_SMOOTH_STONE);

        //BRICKS
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.POLISHED_BRICKS);

        //PACKED MUD
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.POLISHED_PACKED_MUD);

        //ENDSTONE
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.POLISHED_ENDSTONE);

        //RED NETHER
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.POLISHED_RED_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CHISELED_RED_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CRACKED_RED_NETHER_BRICKS);

        //WARPED NETHER
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.POLISHED_WARPED_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.WARPED_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CHISELED_WARPED_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CRACKED_WARPED_NETHER_BRICKS);

        //CALCITE
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.POLISHED_CALCITE);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CALCITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CALCITE_PILLAR);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CHISELED_CALCITE_PILLAR);

        //PRISMARINE
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CHISELED_PRISMARINE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CRACKED_PRISMARINE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.POLISHED_PRISMARINE);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.PRISMARINE_SCALLOP);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.PRISMARINE_TILES);

        //DARK PRISMARINE
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CHISELD_DARK_PRISMARINE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.DARK_PRISMARINE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CRACKED_DARK_PRISMARINE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.POLISHED_DARK_PRISMARINE);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.DARK_PRISMARINE_SCALLOP);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.DARK_PRISMARINE_TILES);

        //DRIPSTONE
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.POLISHED_DRIPSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.DRIPSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CRACKED_DRIPSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CHISELED_DRIPSTONE);

        //BLACKSTONE
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.POLISHED_GILDED_BLACKSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.GILDED_BLACKSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CRACKED_GILDED_BLACKSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(SpiceBlocks.CHISELED_GILDED_BLACKSTONE);







    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {


    }
}
