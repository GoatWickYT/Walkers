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


public class SpaceLeggings<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Walkers.MODID + ":textures/entity"), "space_leggings.png");
	public final ModelPart armorLeftLeg;
	public final ModelPart armorRightLeg;

	public SpaceLeggings(ModelPart root) {
		this.armorLeftLeg = root.getChild("armorLeftLeg");
		this.armorRightLeg = root.getChild("armorRightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition armorLeftLeg = partdefinition.addOrReplaceChild("armorLeftLeg",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.1F, 0.0F, -2.1F, 4.2F, 9.0F, 4.2F, new CubeDeformation(0.0F)).texOffs(18, 0).addBox(-2.35F, 1.0F, -2.35F, 4.7F, 2.0F, 4.7F, new CubeDeformation(0.0F)).texOffs(18, 14)
						.addBox(-2.35F, 3.25F, -2.35F, 4.7F, 2.0F, 4.7F, new CubeDeformation(0.0F)).texOffs(2, 28).addBox(-2.35F, 5.5F, -2.35F, 4.7F, 2.0F, 4.7F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 20.0F, 0.0F));
		PartDefinition armorRightLeg = partdefinition
				.addOrReplaceChild(
						"armorRightLeg", CubeListBuilder.create().texOffs(0, 13).addBox(-2.1F, 0.0F, -2.1F, 4.2F, 9.0F, 4.2F, new CubeDeformation(0.0F)).texOffs(18, 7).addBox(-2.35F, 1.0F, -2.35F, 4.7F, 2.0F, 4.7F, new CubeDeformation(0.0F))
								.texOffs(18, 21).addBox(-2.35F, 3.25F, -2.35F, 4.7F, 2.0F, 4.7F, new CubeDeformation(0.0F)).texOffs(22, 28).addBox(-2.35F, 5.5F, -2.35F, 4.7F, 2.0F, 4.7F, new CubeDeformation(0.0F)),
						PartPose.offset(-2.0F, 20.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		armorLeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorRightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}