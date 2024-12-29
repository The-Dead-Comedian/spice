package com.deadcomedian.spice.entity.client.renderer;


import com.deadcomedian.spice.Spice;
import com.deadcomedian.spice.entity.KeeperEntity;
import com.deadcomedian.spice.entity.WeeperEntity;
import com.deadcomedian.spice.entity.client.SpiceModelLayers;
import com.deadcomedian.spice.entity.client.model.KeeperModel;
import com.deadcomedian.spice.entity.client.model.WeeperModel;
import com.deadcomedian.spice.entity.client.renderer.feature.KeeperGlowRenderer;
import com.deadcomedian.spice.entity.client.renderer.feature.WeeperGlowRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class WeeperRenderer extends MobEntityRenderer<WeeperEntity, WeeperModel<WeeperEntity>> {
    private static final Identifier TEXTURE =  Identifier.of(Spice.MOD_ID, "textures/entity/weeper/weeper.png");

    public WeeperRenderer(EntityRendererFactory.Context context) {
        super(context, new WeeperModel<>(context.getPart(SpiceModelLayers.WEEPER)), 0.6f);
        this.addFeature(new WeeperGlowRenderer(this));

    }

    @Override
    public Identifier getTexture(WeeperEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(WeeperEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}