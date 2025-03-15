package com.deadcomedian.spice.registries;

import com.deadcomedian.spice.Spice;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class SpiceItemGroup {
    public static final ItemGroup spice = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Spice.MOD_ID, "spiceitems"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.spice.items"))
                    .icon(() -> new ItemStack(SpiceBlocks.CHISELED_RED_NETHER_BRICKS)).entries((displayContext, entries) -> {

                        entries.add(SpiceBlocks.POLISHED_SMOOTH_STONE);

                        entries.add(SpiceBlocks.POLISHED_BRICKS);

                        entries.add(SpiceBlocks.POLISHED_PACKED_MUD);

                        entries.add(SpiceBlocks.POLISHED_ENDSTONE);

                        entries.add(SpiceBlocks.POLISHED_RED_NETHER_BRICKS);
                        entries.add(SpiceBlocks.CHISELED_RED_NETHER_BRICKS);
                        entries.add(SpiceBlocks.CRACKED_RED_NETHER_BRICKS);

                        entries.add(SpiceBlocks.POLISHED_WARPED_NETHER_BRICKS);
                        entries.add(SpiceBlocks.WARPED_NETHER_BRICKS);
                        entries.add(SpiceBlocks.CRACKED_WARPED_NETHER_BRICKS);
                        entries.add(SpiceBlocks.CHISELED_WARPED_NETHER_BRICKS);

                        entries.add(SpiceBlocks.POLISHED_CALCITE);
                        entries.add(SpiceBlocks.CALCITE_BRICKS);
                        entries.add(SpiceBlocks.CALCITE_PILLAR);
                        entries.add(SpiceBlocks.CHISELED_CALCITE_PILLAR);

                        entries.add(SpiceBlocks.CHISELED_PRISMARINE_BRICKS);
                        entries.add(SpiceBlocks.CRACKED_PRISMARINE_BRICKS);
                        entries.add(SpiceBlocks.POLISHED_PRISMARINE);
                        entries.add(SpiceBlocks.PRISMARINE_SCALLOP);
                        entries.add(SpiceBlocks.PRISMARINE_TILES);

                        entries.add(SpiceBlocks.CHISELD_DARK_PRISMARINE_BRICKS);
                        entries.add(SpiceBlocks.DARK_PRISMARINE_BRICKS);
                        entries.add(SpiceBlocks.CRACKED_DARK_PRISMARINE_BRICKS);
                        entries.add(SpiceBlocks.POLISHED_DARK_PRISMARINE);
                        entries.add(SpiceBlocks.DARK_PRISMARINE_SCALLOP);
                        entries.add(SpiceBlocks.DARK_PRISMARINE_TILES);

                        entries.add(SpiceBlocks.POLISHED_DRIPSTONE);
                        entries.add(SpiceBlocks.DRIPSTONE_BRICKS);
                        entries.add(SpiceBlocks.CRACKED_DRIPSTONE_BRICKS);
                        entries.add(SpiceBlocks.CHISELED_DRIPSTONE);

                        entries.add(SpiceBlocks.POLISHED_GILDED_BLACKSTONE);
                        entries.add(SpiceBlocks.GILDED_BLACKSTONE_BRICKS);
                        entries.add(SpiceBlocks.CRACKED_GILDED_BLACKSTONE_BRICKS);
                        entries.add(SpiceBlocks.CHISELED_GILDED_BLACKSTONE);


                    }).build());

    public static void registerItemGroups() {
        Spice.LOGGER.info("Registering Item Groups for " + Spice.MOD_ID);
    }

}

