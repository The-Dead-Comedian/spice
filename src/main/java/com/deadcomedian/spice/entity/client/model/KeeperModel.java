// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package com.deadcomedian.spice.entity.client.model;

import com.deadcomedian.spice.entity.KeeperEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
   
public class KeeperModel <T extends KeeperEntity> extends SinglePartEntityModel<T> {
	private final ModelPart bone;

	public KeeperModel(ModelPart root) {
		this.bone = root.getChild("bone");

	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData all = bone.addChild("all", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body = all.addChild("body", ModelPartBuilder.create().uv(0, 20).cuboid(-4.0F, -14.0F, -2.0F, 8.0F, 14.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 72).cuboid(-4.0F, -14.0F, -2.0F, 8.0F, 14.0F, 4.0F, new Dilation(0.1F)), ModelTransform.pivot(-1.0F, -10.0F, 0.0F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -12.0F, -4.0F, 8.0F, 12.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 52).cuboid(-4.0F, -12.0F, -4.0F, 8.0F, 12.0F, 8.0F, new Dilation(0.12F)), ModelTransform.pivot(0.0F, -14.0F, 0.0F));

		ModelPartData leftfront = all.addChild("leftfront", ModelPartBuilder.create().uv(32, 0).cuboid(-2.0F, 0.0F, -4.0F, 4.0F, 10.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -10.0F, -2.0F));

		ModelPartData rightfront = all.addChild("rightfront", ModelPartBuilder.create().uv(24, 20).cuboid(-2.0F, 0.0F, -4.0F, 4.0F, 10.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, -10.0F, -2.0F));

		ModelPartData leftback = all.addChild("leftback", ModelPartBuilder.create().uv(24, 20).cuboid(-2.0F, 0.0F, 0.0F, 4.0F, 10.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -10.0F, 2.0F));

		ModelPartData rightback = all.addChild("rightback", ModelPartBuilder.create().uv(32, 0).cuboid(-2.0F, 0.0F, 0.0F, 4.0F, 10.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, -10.0F, 2.0F));
		return TexturedModelData.of(modelData, 128, 128);
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