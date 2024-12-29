package com.deadcomedian.spice;

import com.deadcomedian.spice.entity.EntombedEntity;
import com.deadcomedian.spice.entity.KeeperEntity;
import com.deadcomedian.spice.entity.WeeperEntity;
import com.deadcomedian.spice.registries.SpiceBlocks;
import com.deadcomedian.spice.registries.SpiceEntities;
import com.deadcomedian.spice.registries.SpiceItemGroup;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Spice implements ModInitializer {
	public static final String MOD_ID = "spice";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		SpiceBlocks.registerModBlocks();
		SpiceItemGroup.registerItemGroups();
		SpiceEntities.registerModEntities();

		FabricDefaultAttributeRegistry.register(SpiceEntities.KEEPER, KeeperEntity.createKeeperAttributes());
		FabricDefaultAttributeRegistry.register(SpiceEntities.WEEPER, WeeperEntity.createKeeperAttributes());
		FabricDefaultAttributeRegistry.register(SpiceEntities.BEAST, KeeperEntity.createKeeperAttributes());
		FabricDefaultAttributeRegistry.register(SpiceEntities.BRIAN, WeeperEntity.createKeeperAttributes());
		FabricDefaultAttributeRegistry.register(SpiceEntities.GRIEVER, KeeperEntity.createKeeperAttributes());
		FabricDefaultAttributeRegistry.register(SpiceEntities.DEPTH_SPIDER, WeeperEntity.createKeeperAttributes());
		FabricDefaultAttributeRegistry.register(SpiceEntities.ENTOMBED, EntombedEntity.createKeeperAttributes());
		LOGGER.info("Hello Fabric world!");
	}
}