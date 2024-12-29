
package com.deadcomedian.spice.entity.client.renderer;


import com.deadcomedian.spice.Spice;
import com.deadcomedian.spice.entity.DepthSpiderEntity;
import com.deadcomedian.spice.entity.GrieverEntity;
import com.deadcomedian.spice.entity.client.SpiceModelLayers;
import com.deadcomedian.spice.entity.client.model.DepthSpiderModel;
import com.deadcomedian.spice.entity.client.model.GrieverModel;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class GrieverRenderer extends MobEntityRenderer<GrieverEntity, GrieverModel<GrieverEntity>> {
    private static final Identifier TEXTURE =  Identifier.of(Spice.MOD_ID, "textures/entity/griever.png");

    public GrieverRenderer(EntityRendererFactory.Context context) {
        super(context, new GrieverModel(context.getPart(SpiceModelLayers.GRIEVER)), 0.6f);

    }

    @Override
    public Identifier getTexture(GrieverEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(GrieverEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}