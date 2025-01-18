package com.goatwick.walkers.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.goatwick.walkers.Walkers;
import com.mojang.blaze3d.vertex.PoseStack;


public class SpaceBoots<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Walkers.MODID + "textures/entity"), "space_boots.png");
	public final ModelPart armorLeftBoot;
	public final ModelPart armorRightBoot;

	public SpaceBoots(ModelPart root) {
		this.armorLeftBoot = root.getChild("armorLeftBoot");
		this.armorRightBoot = root.getChild("armorRightBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition armorLeftBoot = partdefinition.addOrReplaceChild("armorLeftBoot", CubeListBuilder.create().texOffs(0, 9).addBox(-2.1F, 9.0F, -3.85F, 4.2F, 3.1F, 5.95F,
				new CubeDeformation(0.0F)).texOffs(20, 12).addBox(-1.85F, 9.5F, -4.6F, 3.7F, 2.6F, 0.75F,
				new CubeDeformation(0.0F)).texOffs(20, 0).addBox(-2.25F, 8.5F, -2.6F, 4.5F, 2.6F, 4.75F,
				new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 14.0F, 0.0F));

		PartDefinition armorRightBoot = partdefinition.addOrReplaceChild("armorRightBoot", CubeListBuilder.create().texOffs(0, 0).addBox(-2.1F, 9.0F, -3.85F, 4.2F, 3.1F, 5.95F,
				new CubeDeformation(0.0F)).texOffs(21, 8).addBox(-1.85F, 9.5F, -4.6F, 3.7F, 2.6F, 0.75F,
				new CubeDeformation(0.0F)).texOffs(0, 18).addBox(-2.25F, 8.5F, -2.6F, 4.5F, 2.6F, 4.75F,
				new CubeDeformation(0.0F)),
		PartPose.offset(-2.0F, 14.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		armorLeftBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorRightBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}