package com.deadcomedian.spice.entity.client.renderer;


import com.deadcomedian.spice.Spice;
import com.deadcomedian.spice.entity.BeastEntity;
import com.deadcomedian.spice.entity.WeeperEntity;
import com.deadcomedian.spice.entity.client.SpiceModelLayers;
import com.deadcomedian.spice.entity.client.model.BeastModel;
import com.deadcomedian.spice.entity.client.model.WeeperModel;
import com.deadcomedian.spice.entity.client.renderer.feature.WeeperGlowRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class BeastRenderer extends MobEntityRenderer<BeastEntity, BeastModel<BeastEntity>> {
    private static final Identifier TEXTURE =  Identifier.of(Spice.MOD_ID, "textures/entity/beast.png");

    public BeastRenderer(EntityRendererFactory.Context context) {
        super(context, new BeastModel<>(context.getPart(SpiceModelLayers.BEAST)), 0.6f);


    }

    @Override
    public Identifier getTexture(BeastEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(BeastEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}