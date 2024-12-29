// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package com.deadcomedian.spice.entity.client.model;

import com.deadcomedian.spice.entity.BeastEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class BeastModel<T extends BeastEntity> extends SinglePartEntityModel<T> {
	private final ModelPart bone;

	public BeastModel(ModelPart root) {
		this.bone = root.getChild("bone");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -8.6F, -5.8F));

		ModelPartData all = bone.addChild("all", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body = all.addChild("body", ModelPartBuilder.create().uv(0, 70).cuboid(-11.0F, -12.0F, 7.0F, 8.0F, 20.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, 0.0F, -3.0F));

		ModelPartData upperbody = body.addChild("upperbody", ModelPartBuilder.create(), ModelTransform.pivot(-7.0F, -8.0F, 9.0F));

		ModelPartData head = upperbody.addChild("head", ModelPartBuilder.create(), ModelTransform.of(0.0F, 4.5F, -14.0F, 0.0F, 0.0436F, 0.0F));

		ModelPartData lefthorn_r1 = head.addChild("lefthorn_r1", ModelPartBuilder.create().uv(0, 98).mirrored().cuboid(-1.5F, -7.0F, -7.0F, 3.0F, 8.0F, 8.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-2.7F, -1.5F, -2.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData righthorn_r1 = head.addChild("righthorn_r1", ModelPartBuilder.create().uv(0, 98).cuboid(-1.5F, -7.0F, -7.0F, 3.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(2.7F, -1.5F, -2.0F, 0.0F, -0.3927F, 0.0F));

		ModelPartData head_r1 = head.addChild("head_r1", ModelPartBuilder.create().uv(10, 49).cuboid(-2.5F, -3.0F, -14.0F, 5.0F, 7.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.7F, 0.3F, 0.9599F, 0.0F, 0.0F));

		ModelPartData rightear = head.addChild("rightear", ModelPartBuilder.create().uv(62, 36).cuboid(0.0F, -1.0F, -0.5F, 5.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(2.5F, 0.5F, -1.5F));

		ModelPartData leftear = head.addChild("leftear", ModelPartBuilder.create().uv(62, 36).mirrored().cuboid(-5.0F, -1.0F, -0.5F, 5.0F, 2.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-2.5F, 0.5F, -1.5F));

		ModelPartData chest = upperbody.addChild("chest", ModelPartBuilder.create().uv(0, 0).cuboid(-15.0F, -19.0F, -1.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(60, 16).cuboid(-7.0F, -23.0F, -1.0F, 0.0F, 4.0F, 16.0F, new Dilation(0.0F))
		.uv(64, 0).cuboid(-15.0F, -3.0F, -1.0F, 16.0F, 3.0F, 16.0F, new Dilation(0.0F))
		.uv(40, 22).cuboid(-7.0F, -3.0F, -2.0F, 0.0F, 11.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, 11.0F, -13.0F));

		ModelPartData leftarm = upperbody.addChild("leftarm", ModelPartBuilder.create().uv(64, 19).mirrored().cuboid(-2.0F, -3.0F, -3.0F, 3.0F, 6.0F, 6.0F, new Dilation(0.0F)).mirrored(false)
		.uv(24, 32).mirrored().cuboid(-2.0F, 3.0F, -3.0F, 3.0F, 14.0F, 0.0F, new Dilation(0.0F)).mirrored(false)
		.uv(12, 47).mirrored().cuboid(-1.0F, 3.0F, -3.0F, 1.0F, 14.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
		.uv(0, 32).mirrored().cuboid(-2.0F, 17.0F, -21.0F, 3.0F, 0.0F, 18.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-8.0F, 3.0F, -3.0F, 0.5996F, -0.1245F, 0.1796F));

		ModelPartData rightarm = upperbody.addChild("rightarm", ModelPartBuilder.create().uv(64, 19).cuboid(-1.0F, -3.0F, -3.0F, 3.0F, 6.0F, 6.0F, new Dilation(0.0F))
		.uv(24, 32).cuboid(-1.0F, 3.0F, -3.0F, 3.0F, 14.0F, 0.0F, new Dilation(0.0F))
		.uv(12, 47).cuboid(0.0F, 3.0F, -3.0F, 1.0F, 14.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 32).cuboid(-1.0F, 17.0F, -21.0F, 3.0F, 0.0F, 18.0F, new Dilation(0.0F)), ModelTransform.of(8.0F, 3.0F, -3.0F, 0.5996F, 0.1245F, -0.1796F));

		ModelPartData tail = body.addChild("tail", ModelPartBuilder.create().uv(-22, 50).cuboid(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 22.0F, new Dilation(0.0F))
		.uv(6, 46).cuboid(-1.5F, -16.0F, 22.0F, 3.0F, 16.0F, 0.0F, new Dilation(0.0F))
		.uv(14, 32).cuboid(-2.5F, -16.0F, 6.0F, 5.0F, 0.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 8.0F, 15.0F, -0.9599F, 0.0F, 0.0F));

		ModelPartData leftleg = all.addChild("leftleg", ModelPartBuilder.create(), ModelTransform.of(-2.5F, 8.0F, 8.0F, 0.0F, 0.3491F, 0.0F));

		ModelPartData lefthoof_r1 = leftleg.addChild("lefthoof_r1", ModelPartBuilder.create().uv(12, 32).mirrored().cuboid(-1.5F, 14.0F, 17.0F, 3.0F, 4.0F, 0.0F, new Dilation(0.0F)).mirrored(false)
		.uv(-18, 32).mirrored().cuboid(-1.5F, 14.0F, -1.0F, 3.0F, 0.0F, 18.0F, new Dilation(0.0F)).mirrored(false)
		.uv(39, 47).mirrored().cuboid(-0.5F, 0.0F, -1.0F, 1.0F, 14.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
		.uv(6, 32).mirrored().cuboid(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.8727F, 0.0F, 0.0F));

		ModelPartData rightleg = all.addChild("rightleg", ModelPartBuilder.create(), ModelTransform.of(2.5F, 8.0F, 8.0F, 0.0F, -0.3491F, 0.0F));

		ModelPartData righthoof_r1 = rightleg.addChild("righthoof_r1", ModelPartBuilder.create().uv(12, 32).cuboid(-1.5F, 14.0F, 17.0F, 3.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(-18, 32).cuboid(-1.5F, 14.0F, -1.0F, 3.0F, 0.0F, 18.0F, new Dilation(0.0F))
		.uv(39, 47).cuboid(-0.5F, 0.0F, -1.0F, 1.0F, 14.0F, 2.0F, new Dilation(0.0F))
		.uv(6, 32).cuboid(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.8727F, 0.0F, 0.0F));
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