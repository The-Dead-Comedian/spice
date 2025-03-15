package com.deadcomedian.spice.datagen;

import com.deadcomedian.spice.registries.SpiceBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class SpiceBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public SpiceBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
    getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)

             //BRICKS
            .add(SpiceBlocks.POLISHED_BRICKS)

            //PACKED MUD
            .add(SpiceBlocks.POLISHED_PACKED_MUD)

            //ENDSTONE
            .add(SpiceBlocks.POLISHED_ENDSTONE)

            //RED NETHER
            .add(SpiceBlocks.POLISHED_RED_NETHER_BRICKS)
            .add(SpiceBlocks.CHISELED_RED_NETHER_BRICKS)
            .add(SpiceBlocks.CRACKED_RED_NETHER_BRICKS)

            //WARPED NETHER
            .add(SpiceBlocks.POLISHED_WARPED_NETHER_BRICKS)
            .add(SpiceBlocks.WARPED_NETHER_BRICKS)
            .add(SpiceBlocks.CRACKED_WARPED_NETHER_BRICKS)
            .add(SpiceBlocks.CHISELED_WARPED_NETHER_BRICKS)

            //CALCITE
            .add(SpiceBlocks.POLISHED_CALCITE)
            .add(SpiceBlocks.CALCITE_BRICKS)
            .add(SpiceBlocks.CALCITE_PILLAR)
            .add(SpiceBlocks.CHISELED_CALCITE_PILLAR)

            //PRISMARINE
            .add(SpiceBlocks.CHISELED_PRISMARINE_BRICKS)
            .add(SpiceBlocks.CRACKED_PRISMARINE_BRICKS)
            .add(SpiceBlocks.POLISHED_PRISMARINE)
            .add(SpiceBlocks.PRISMARINE_SCALLOP)
            .add(SpiceBlocks.PRISMARINE_TILES)

            //DARK PRISMARINE
            .add(SpiceBlocks.DARK_PRISMARINE_BRICKS)
            .add(SpiceBlocks.DARK_CRACKED_PRISMARINE_BRICKS)
            .add(SpiceBlocks.DARK_POLISHED_PRISMARINE)
            .add(SpiceBlocks.DARK_PRISMARINE_SCALLOP)
            .add(SpiceBlocks.DARK_PRISMARINE_TILES)

            //DRIPSTONE
            .add(SpiceBlocks.POLISHED_DRIPSTONE)
            .add(SpiceBlocks.DRIPSTONE_BRICKS)
            .add(SpiceBlocks.CRACKED_DRIPSTONE_BRICKS)
            .add(SpiceBlocks.CHISELED_DRIPSTONE)

            //BLACKSTONE
            .add(SpiceBlocks.GILDED_POLISHED_BLACKSTONE)
            .add(SpiceBlocks.GILDED_BLACKSTONE_BRICKS)
            .add(SpiceBlocks.GILDED_CRACKED_BLACKSTONE_BRICKS)
            .add(SpiceBlocks.GILDED_CHISELED_BLACKSTONE)


    ;



    }
}
