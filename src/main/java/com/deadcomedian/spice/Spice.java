package com.deadcomedian.spice;

import com.deadcomedian.spice.registries.SpiceBlocks;
import com.deadcomedian.spice.registries.SpiceItemGroup;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Spice implements ModInitializer {
	public static final String MOD_ID = "spice";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		SpiceBlocks.registerModBlocks();
		SpiceItemGroup.registerItemGroups();

		LOGGER.info("Hello Fabric world!");
	}
}