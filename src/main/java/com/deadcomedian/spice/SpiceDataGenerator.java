package com.deadcomedian.spice;

import com.deadcomedian.spice.datagen.SpiceBlockTagProvider;
import com.deadcomedian.spice.datagen.SpiceLootTableProvider;
import com.deadcomedian.spice.datagen.SpiceModelProvider;
import com.deadcomedian.spice.datagen.SpiceRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class SpiceDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(SpiceBlockTagProvider::new);
		pack.addProvider(SpiceLootTableProvider::new);
		pack.addProvider(SpiceModelProvider::new);
		pack.addProvider(SpiceRecipeProvider::new);
	}
}
