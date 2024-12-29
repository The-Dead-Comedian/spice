package com.deadcomedian.spice.entity.client.renderer;


import com.deadcomedian.spice.Spice;
import com.deadcomedian.spice.entity.EntombedEntity;
import com.deadcomedian.spice.entity.KeeperEntity;
import com.deadcomedian.spice.entity.client.SpiceModelLayers;
import com.deadcomedian.spice.entity.client.model.EntombedModel;
import com.deadcomedian.spice.entity.client.model.KeeperModel;
import com.deadcomedian.spice.entity.client.renderer.feature.KeeperGlowRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class EntombedRenderer extends MobEntityRenderer<EntombedEntity, EntombedModel<EntombedEntity>> {
    private static final Identifier TEXTURE =  Identifier.of(Spice.MOD_ID, "textures/entity/entombed/entombed.png");

    public EntombedRenderer(EntityRendererFactory.Context context) {
        super(context, new EntombedModel(context.getPart(SpiceModelLayers.ENTOMBED)), 0.6f);

    }

    @Override
    public Identifier getTexture(EntombedEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(EntombedEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}