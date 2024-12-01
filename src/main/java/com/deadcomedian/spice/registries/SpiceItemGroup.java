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

                        entries.add(SpiceBlocks.CHISELED_RED_NETHER_BRICKS);
                        entries.add(SpiceBlocks.CRACKED_RED_NETHER_BRICKS);

                        entries.add(SpiceBlocks.WARPED_NETHER_BRICKS);
                        entries.add(SpiceBlocks.CRACKED_WARPED_NETHER_BRICKS);
                        entries.add(SpiceBlocks.CHISELED_WARPED_NETHER_BRICKS);

                        entries.add(SpiceBlocks.POLISHED_CALCITE);
                        entries.add(SpiceBlocks.CALCITE_BRICKS);
                        entries.add(SpiceBlocks.CALCITE_PILLAR);
                        entries.add(SpiceBlocks.CHISELED_CALCITE_PILLAR);




                    }).build());

    public static void registerItemGroups() {
        Spice.LOGGER.info("Registering Item Groups for " + Spice.MOD_ID);
    }

}

