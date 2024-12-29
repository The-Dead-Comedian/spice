package com.deadcomedian.spice.registries;

import com.deadcomedian.spice.Spice;
import com.deadcomedian.spice.entity.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SpiceEntities {

    public static final EntityType<KeeperEntity> KEEPER = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Spice.MOD_ID, "keeper"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, KeeperEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 2.2f )).build());

    public static final EntityType<WeeperEntity> WEEPER = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Spice.MOD_ID, "weeper"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, WeeperEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 2.2f)).build());

    public static final EntityType<BeastEntity> BEAST = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Spice.MOD_ID, "beast"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, BeastEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 3f)).build());

    public static final EntityType<BrianEntity> BRIAN = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Spice.MOD_ID, "brian"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, BrianEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 2f)).build());

    public static final EntityType<GrieverEntity> GRIEVER = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Spice.MOD_ID, "griever"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GrieverEntity::new)
                    .dimensions(EntityDimensions.fixed(0.8f, 2.8f)).build());

    public static final EntityType<DepthSpiderEntity> DEPTH_SPIDER = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Spice.MOD_ID, "depth_spider"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, DepthSpiderEntity::new)
                    .dimensions(EntityDimensions.fixed(2f, 1f)).build());

    public static final EntityType<EntombedEntity> ENTOMBED = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Spice.MOD_ID, "entombed"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, EntombedEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 2f)).build());

    public static void registerModEntities() {
        Spice.LOGGER.info("Registering Entities for " + Spice.MOD_ID);
    }
}
