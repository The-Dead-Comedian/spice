package com.deadcomedian.spice.entity.client;

import com.deadcomedian.spice.Spice;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class SpiceModelLayers {
    public static final EntityModelLayer KEEPER =
            new EntityModelLayer( Identifier.of(Spice.MOD_ID, "keeper"),"main");

    public static final EntityModelLayer WEEPER =
            new EntityModelLayer( Identifier.of(Spice.MOD_ID, "weeper"),"main");

    public static final EntityModelLayer DEPTH_SPIDER =
            new EntityModelLayer( Identifier.of(Spice.MOD_ID, "depth_spider"),"main");

    public static final EntityModelLayer BRIAN =
            new EntityModelLayer( Identifier.of(Spice.MOD_ID, "brian"),"main");

    public static final EntityModelLayer BEAST =
            new EntityModelLayer( Identifier.of(Spice.MOD_ID, "beast"),"main");

    public static final EntityModelLayer GRIEVER =
            new EntityModelLayer( Identifier.of(Spice.MOD_ID, "griever"),"main");

    public static final EntityModelLayer ENTOMBED =
            new EntityModelLayer( Identifier.of(Spice.MOD_ID, "entombed"),"main");
}

