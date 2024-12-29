// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package com.deadcomedian.spice.entity.client.model;

import com.deadcomedian.spice.entity.DepthSpiderEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;


public class DepthSpiderModel <T extends DepthSpiderEntity> extends SinglePartEntityModel<T> {
	private final ModelPart bone;

	public DepthSpiderModel(ModelPart root) {
		this.bone = root.getChild("bone");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData all = bone.addChild("all", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData leg7 = all.addChild("leg7", ModelPartBuilder.create().uv(0, 40).cuboid(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, -9.0F, -1.0F, 0.0F, 0.7854F, 0.7854F));

		ModelPartData leg6 = all.addChild("leg6", ModelPartBuilder.create().uv(0, 40).cuboid(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, -9.0F, -1.0F, 0.0F, -0.7854F, -0.7854F));

		ModelPartData leg5 = all.addChild("leg5", ModelPartBuilder.create().uv(0, 40).cuboid(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, -9.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));

		ModelPartData leg4 = all.addChild("leg4", ModelPartBuilder.create().uv(0, 40).cuboid(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, -9.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));

		ModelPartData leg3 = all.addChild("leg3", ModelPartBuilder.create().uv(0, 40).cuboid(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, -9.0F, 1.0F, 0.0F, -0.2618F, 0.6109F));

		ModelPartData leg2 = all.addChild("leg2", ModelPartBuilder.create().uv(0, 40).cuboid(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, -9.0F, 1.0F, 0.0F, 0.2618F, -0.6109F));

		ModelPartData leg1 = all.addChild("leg1", ModelPartBuilder.create().uv(0, 40).cuboid(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, -9.0F, 2.0F, 0.0F, -0.7854F, 0.7854F));

		ModelPartData leg0 = all.addChild("leg0", ModelPartBuilder.create().uv(0, 40).cuboid(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, -9.0F, 2.0F, 0.0F, 0.7854F, -0.7854F));

		ModelPartData body1 = all.addChild("body1", ModelPartBuilder.create().uv(0, 0).cuboid(-6.0F, -8.0F, -6.0F, 12.0F, 12.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -9.0F, 9.0F));

		ModelPartData body0 = all.addChild("body0", ModelPartBuilder.create().uv(32, 28).cuboid(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -9.0F, 0.0F));

		ModelPartData head = all.addChild("head", ModelPartBuilder.create().uv(0, 24).cuboid(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -9.0F, -3.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}

	@Override
	public ModelPart getPart() {
		return bone;
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
		bone.render(matrices, vertices, light, overlay);
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}
}