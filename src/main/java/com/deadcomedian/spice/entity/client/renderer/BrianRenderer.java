package com.deadcomedian.spice.entity.client.renderer;


import com.deadcomedian.spice.Spice;
import com.deadcomedian.spice.entity.BrianEntity;
import com.deadcomedian.spice.entity.DepthSpiderEntity;
import com.deadcomedian.spice.entity.client.SpiceModelLayers;
import com.deadcomedian.spice.entity.client.model.BrianModel;
import com.deadcomedian.spice.entity.client.model.DepthSpiderModel;
import com.deadcomedian.spice.entity.client.renderer.feature.BrianGlowRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class BrianRenderer extends MobEntityRenderer<BrianEntity, BrianModel<BrianEntity>> {
    private static final Identifier TEXTURE = Identifier.of(Spice.MOD_ID, "textures/entity/brian/brian.png");

    public BrianRenderer(EntityRendererFactory.Context context) {
        super(context, new BrianModel(context.getPart(SpiceModelLayers.BRIAN)), 0.6f);
        this.addFeature(new BrianGlowRenderer(this));
    }

    @Override
    public Identifier getTexture(BrianEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(BrianEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if (mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}