// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package com.deadcomedian.spice.entity.client.model;

import com.deadcomedian.spice.entity.BrianEntity;
import com.deadcomedian.spice.entity.GrieverEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
   
public class GrieverModel <T extends GrieverEntity> extends SinglePartEntityModel<T> {
	private final ModelPart bone;

	public GrieverModel(ModelPart root) {
		this.bone = root.getChild("bone");

	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData all = bone.addChild("all", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body = all.addChild("body", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, -1.0F, -2.0F, 8.0F, 10.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -23.0F, 0.0F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-5.5F, -8.0F, -4.0F, 11.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, 0.0F));

		ModelPartData nose = head.addChild("nose", ModelPartBuilder.create().uv(38, 0).cuboid(-2.5F, -2.0F, -1.0F, 5.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(16, 30).cuboid(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -4.0F, -4.0F));

		ModelPartData leftear = head.addChild("leftear", ModelPartBuilder.create().uv(33, 29).cuboid(-2.0F, -15.0F, 0.0F, 7.0F, 18.0F, 0.0F, new Dilation(0.01F)), ModelTransform.pivot(5.5F, -5.0F, 0.0F));

		ModelPartData rightear = head.addChild("rightear", ModelPartBuilder.create().uv(33, 29).mirrored().cuboid(-5.0F, -15.0F, 0.0F, 7.0F, 18.0F, 0.0F, new Dilation(0.01F)).mirrored(false), ModelTransform.pivot(-5.5F, -5.0F, 0.0F));

		ModelPartData leftleg = body.addChild("leftleg", ModelPartBuilder.create().uv(16, 33).mirrored().cuboid(-2.0F, 0.0F, 0.0F, 3.0F, 5.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(3.0F, 9.0F, 0.0F));

		ModelPartData rightleg = body.addChild("rightleg", ModelPartBuilder.create().uv(16, 33).cuboid(-1.0F, 0.0F, 0.0F, 3.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, 9.0F, 0.0F));

		ModelPartData rightarm = all.addChild("rightarm", ModelPartBuilder.create().uv(0, 30).cuboid(-1.0F, 13.0F, 1.0F, 0.0F, 8.0F, 8.0F, new Dilation(0.0F))
		.uv(24, 28).cuboid(-2.0F, -1.0F, -1.0F, 2.0F, 24.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 16).cuboid(-2.0F, 21.0F, 1.0F, 2.0F, 2.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, -23.0F, 0.0F));

		ModelPartData leftarm = all.addChild("leftarm", ModelPartBuilder.create().uv(0, 30).mirrored().cuboid(1.0F, 13.0F, 1.0F, 0.0F, 8.0F, 8.0F, new Dilation(0.0F)).mirrored(false)
		.uv(24, 28).mirrored().cuboid(0.0F, -1.0F, -1.0F, 2.0F, 24.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
		.uv(24, 16).mirrored().cuboid(0.0F, 21.0F, 1.0F, 2.0F, 2.0F, 10.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(4.0F, -23.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
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