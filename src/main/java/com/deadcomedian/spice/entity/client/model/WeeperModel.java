// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package com.deadcomedian.spice.entity.client.model;


import com.deadcomedian.spice.entity.WeeperEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;

import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
   
public class WeeperModel  <T extends WeeperEntity> extends SinglePartEntityModel<T> {
	private final ModelPart bone;

	public WeeperModel(ModelPart root) {
		this.bone = root.getChild("bone");

	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData all = bone.addChild("all", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body = all.addChild("body", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, -14.0F, -2.0F, 8.0F, 14.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.0F, 0.0F, 0.0F, -0.2618F, 0.0436F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.0F, 0.0F, 0.0893F, -0.3051F, -0.008F));

		ModelPartData mask = head.addChild("mask", ModelPartBuilder.create().uv(32, 0).cuboid(-4.0F, -6.0F, -2.9F, 8.0F, 12.0F, 3.0F, new Dilation(0.3F))
		.uv(25, 17).cuboid(-4.0F, -6.0F, -3.0F, 8.0F, 12.0F, 3.0F, new Dilation(0.3F)), ModelTransform.of(0.0F, -4.0F, -3.0F, 0.0F, 0.0F, 0.1309F));

		ModelPartData backright = all.addChild("backright", ModelPartBuilder.create().uv(32, 34).cuboid(-2.0F, 0.0F, 0.0F, 4.0F, 14.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, -14.0F, 2.0F, 0.2608F, 0.0226F, -0.0843F));

		ModelPartData backleft = all.addChild("backleft", ModelPartBuilder.create().uv(16, 34).cuboid(-2.0F, 0.0F, 0.0F, 4.0F, 14.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -14.0F, 2.0F, 0.0F, -0.3054F, 0.0F));

		ModelPartData frontright = all.addChild("frontright", ModelPartBuilder.create().uv(16, 34).cuboid(-2.0F, 0.0F, -4.0F, 4.0F, 14.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, -14.0F, -2.0F, 0.1262F, -0.1354F, 0.0265F));

		ModelPartData frontleft = all.addChild("frontleft", ModelPartBuilder.create().uv(0, 34).cuboid(-2.0F, 0.0F, -4.0F, 4.0F, 14.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -14.0F, -2.0F, -0.5711F, 0.1103F, -0.0706F));
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