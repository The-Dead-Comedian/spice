package com.deadcomedian.spice.entity.client.renderer.feature;

import com.deadcomedian.spice.Spice;
import com.deadcomedian.spice.entity.KeeperEntity;
import com.deadcomedian.spice.entity.WeeperEntity;
import com.deadcomedian.spice.entity.client.model.KeeperModel;
import com.deadcomedian.spice.entity.client.model.WeeperModel;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.feature.EndermanEyesFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.util.Identifier;

public class WeeperGlowRenderer extends EndermanEyesFeatureRenderer {
    private static final RenderLayer SKIN = RenderLayer.getEyes(Identifier.of(Spice.MOD_ID,"textures/entity/weeper/weepersad.png"));

    public WeeperGlowRenderer(FeatureRendererContext<WeeperEntity, WeeperModel<WeeperEntity>> featureRendererContext) {
        super(featureRendererContext);
    }

    public RenderLayer getEyesTexture() {
        return SKIN;
    }
}
