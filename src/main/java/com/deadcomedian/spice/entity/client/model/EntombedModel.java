// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package com.deadcomedian.spice.entity.client.model;

import com.deadcomedian.spice.entity.DepthSpiderEntity;
import com.deadcomedian.spice.entity.EntombedEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class EntombedModel <T extends EntombedEntity> extends SinglePartEntityModel<T> {
	private final ModelPart bone;

	public EntombedModel(ModelPart root) {
		this.bone = root.getChild("bone");

	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData LeftLeg = bone.addChild("LeftLeg", ModelPartBuilder.create().uv(0, 32).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
				.uv(40, 48).cuboid(-2.0F, 0.2F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.1F)), ModelTransform.pivot(2.0F, -12.0F, 0.0F));

		ModelPartData RightLeg = bone.addChild("RightLeg", ModelPartBuilder.create().uv(0, 16).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
				.uv(24, 48).cuboid(-2.0F, 0.2F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.1F)), ModelTransform.pivot(-2.0F, -12.0F, 0.0F));

		ModelPartData LeftArm = bone.addChild("LeftArm", ModelPartBuilder.create().uv(40, 16).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
				.uv(32, 32).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.1F)), ModelTransform.pivot(5.0F, -22.0F, 0.0F));

		ModelPartData RightArm = bone.addChild("RightArm", ModelPartBuilder.create().uv(16, 32).cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
				.uv(48, 32).cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.1F)), ModelTransform.pivot(-5.0F, -22.0F, 0.0F));

		ModelPartData Head = bone.addChild("Head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
				.uv(32, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.5F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

		ModelPartData Body = bone.addChild("Body", ModelPartBuilder.create().uv(16, 16).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F))
				.uv(0, 48).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.1F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
		bone.render(matrices, vertices, light, overlay);
	}

	@Override
	public ModelPart getPart() {
		return bone;
	}
}