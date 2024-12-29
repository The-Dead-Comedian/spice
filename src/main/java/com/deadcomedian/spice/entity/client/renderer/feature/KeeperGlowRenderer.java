package com.deadcomedian.spice.entity.client.renderer.feature;

import com.deadcomedian.spice.Spice;
import com.deadcomedian.spice.entity.KeeperEntity;
import com.deadcomedian.spice.entity.client.model.KeeperModel;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.feature.EndermanEyesFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EndermanEntityModel;
import net.minecraft.util.Identifier;

public class KeeperGlowRenderer extends EndermanEyesFeatureRenderer {
    private static final RenderLayer SKIN = RenderLayer.getEyes(Identifier.of(Spice.MOD_ID,"textures/entity/keeper/keeperglow.png"));

    public KeeperGlowRenderer(FeatureRendererContext<KeeperEntity, KeeperModel<KeeperEntity>> featureRendererContext) {
        super(featureRendererContext);
    }

    public RenderLayer getEyesTexture() {
        return SKIN;
    }
}
