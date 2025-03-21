package com.deadcomedian.spice.datagen;

import com.deadcomedian.spice.registries.SpiceBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class SpiceLootTableProvider extends FabricBlockLootTableProvider {
    public SpiceLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        //RED NETHER
        addDrop(SpiceBlocks.POLISHED_SMOOTH_STONE);

        //RED NETHER
        addDrop(SpiceBlocks.POLISHED_BRICKS);

        //PACKED MUD
        addDrop(SpiceBlocks.POLISHED_PACKED_MUD);

        //ENDSTONE
        addDrop(SpiceBlocks.POLISHED_ENDSTONE);

        //RED NETHER
        addDrop(SpiceBlocks.POLISHED_RED_NETHER_BRICKS);
        addDrop(SpiceBlocks.CRACKED_RED_NETHER_BRICKS);
        addDrop(SpiceBlocks.CHISELED_RED_NETHER_BRICKS);

        //WARPED NETHER
        addDrop(SpiceBlocks.POLISHED_WARPED_NETHER_BRICKS);
        addDrop(SpiceBlocks.WARPED_NETHER_BRICKS);
        addDrop(SpiceBlocks.CHISELED_WARPED_NETHER_BRICKS);
        addDrop(SpiceBlocks.CRACKED_WARPED_NETHER_BRICKS);

        //CALCITE
        addDrop(SpiceBlocks.POLISHED_CALCITE);
        addDrop(SpiceBlocks.CALCITE_BRICKS);
        addDrop(SpiceBlocks.CALCITE_PILLAR);
        addDrop(SpiceBlocks.CHISELED_CALCITE_PILLAR);

        //PRISMARINE
        addDrop(SpiceBlocks.CHISELED_PRISMARINE_BRICKS);
        addDrop(SpiceBlocks.CRACKED_PRISMARINE_BRICKS);
        addDrop(SpiceBlocks.POLISHED_PRISMARINE);
        addDrop(SpiceBlocks.PRISMARINE_SCALLOP);
        addDrop(SpiceBlocks.PRISMARINE_TILES);

        //DARK PRISMARINE
        addDrop(SpiceBlocks.DARK_PRISMARINE_BRICKS);
        addDrop(SpiceBlocks.CRACKED_DARK_PRISMARINE_BRICKS);
        addDrop(SpiceBlocks.POLISHED_DARK_PRISMARINE);
        addDrop(SpiceBlocks.DARK_PRISMARINE_SCALLOP);
        addDrop(SpiceBlocks.DARK_PRISMARINE_TILES);

        //DRIPSTONE
        addDrop(SpiceBlocks.POLISHED_DRIPSTONE);
        addDrop(SpiceBlocks.DRIPSTONE_BRICKS);
        addDrop(SpiceBlocks.CRACKED_DRIPSTONE_BRICKS);
        addDrop(SpiceBlocks.CHISELED_DRIPSTONE);

        //BLACKSTONE
        addDrop(SpiceBlocks.POLISHED_GILDED_BLACKSTONE);
        addDrop(SpiceBlocks.GILDED_BLACKSTONE_BRICKS);
        addDrop(SpiceBlocks.CRACKED_GILDED_BLACKSTONE_BRICKS);
        addDrop(SpiceBlocks.CHISELED_GILDED_BLACKSTONE);
    }
}
