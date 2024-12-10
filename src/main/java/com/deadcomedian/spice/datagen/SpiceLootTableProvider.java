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
        addDrop(SpiceBlocks.CRACKED_RED_NETHER_BRICKS);
        addDrop(SpiceBlocks.CHISELED_RED_NETHER_BRICKS);

        addDrop(SpiceBlocks.WARPED_NETHER_BRICKS);
        addDrop(SpiceBlocks.CHISELED_WARPED_NETHER_BRICKS);
        addDrop(SpiceBlocks.CRACKED_WARPED_NETHER_BRICKS);

        addDrop(SpiceBlocks.POLISHED_CALCITE);
        addDrop(SpiceBlocks.CALCITE_BRICKS);
        addDrop(SpiceBlocks.CALCITE_PILLAR);
        addDrop(SpiceBlocks.CHISELED_CALCITE_PILLAR);

        addDrop(SpiceBlocks.CRACKED_PRISMARINE_BRICKS);
        addDrop(SpiceBlocks.POLISHED_PRISMARINE);
        addDrop(SpiceBlocks.PRISMARINE_SCALLOP);
        addDrop(SpiceBlocks.PRISMARINE_TILES);

        addDrop(SpiceBlocks.DARK_PRISMARINE_BRICKS);
        addDrop(SpiceBlocks.DARK_CRACKED_PRISMARINE_BRICKS);
        addDrop(SpiceBlocks.DARK_POLISHED_PRISMARINE);
        addDrop(SpiceBlocks.DARK_PRISMARINE_SCALLOP);
        addDrop(SpiceBlocks.DARK_PRISMARINE_TILES);

    }
}
