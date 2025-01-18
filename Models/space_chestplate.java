// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class space_chestplate<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "space_chestplate"), "main");
	private final ModelPart armorBody;
	private final ModelPart armorRightArm;
	private final ModelPart armorLeftArm;

	public space_chestplate(ModelPart root) {
		this.armorBody = root.getChild("armorBody");
		this.armorRightArm = root.getChild("armorRightArm");
		this.armorLeftArm = root.getChild("armorLeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition armorBody = partdefinition.addOrReplaceChild("armorBody", CubeListBuilder.create().texOffs(0, 0).addBox(-4.1F, -0.1F, -2.2F, 8.2F, 12.2F, 4.3F, new CubeDeformation(0.0F))
		.texOffs(17, 34).addBox(0.8F, 10.9F, -2.25F, 3.4F, 1.0F, 4.4F, new CubeDeformation(0.0F))
		.texOffs(34, 20).addBox(0.8F, 9.65F, -2.25F, 3.4F, 1.0F, 4.4F, new CubeDeformation(0.0F))
		.texOffs(32, 34).addBox(0.8F, 7.15F, -2.25F, 3.4F, 1.0F, 4.4F, new CubeDeformation(0.0F))
		.texOffs(34, 26).addBox(0.8F, 8.4F, -2.25F, 3.4F, 1.0F, 4.4F, new CubeDeformation(0.0F))
		.texOffs(15, 40).addBox(-4.2F, 10.9F, -2.25F, 3.4F, 1.0F, 4.4F, new CubeDeformation(0.0F))
		.texOffs(0, 40).addBox(-4.2F, 9.65F, -2.25F, 3.4F, 1.0F, 4.4F, new CubeDeformation(0.0F))
		.texOffs(36, 6).addBox(-4.2F, 8.4F, -2.25F, 3.4F, 1.0F, 4.4F, new CubeDeformation(0.0F))
		.texOffs(36, 0).addBox(-4.2F, 7.15F, -2.25F, 3.4F, 1.0F, 4.4F, new CubeDeformation(0.0F))
		.texOffs(0, 52).addBox(-4.1F, 3.6F, -2.35F, 8.2F, 1.0F, 0.25F, new CubeDeformation(0.0F))
		.texOffs(51, 18).addBox(-4.1F, 4.75F, -2.35F, 8.2F, 1.0F, 0.25F, new CubeDeformation(0.0F))
		.texOffs(47, 38).addBox(-4.1F, 5.9F, -2.35F, 8.2F, 1.0F, 0.25F, new CubeDeformation(0.0F))
		.texOffs(25, 0).addBox(-2.1F, -0.1F, 1.35F, 4.2F, 12.2F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 40).addBox(2.1F, -0.1F, 1.35F, 1.75F, 7.2F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 49).addBox(-3.85F, -0.1F, 1.35F, 1.75F, 7.2F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 15.0F, 0.0F));

		PartDefinition cube_r1 = armorBody.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(25, 14).addBox(-1.45F, 5.1F, -0.5F, 1.35F, 1.0F, 1.35F, new CubeDeformation(0.0F))
		.texOffs(10, 58).addBox(-1.6F, 4.1F, -0.5F, 1.5F, 1.0F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(39, 56).addBox(-1.85F, 3.1F, -0.5F, 1.75F, 1.0F, 1.75F, new CubeDeformation(0.0F))
		.texOffs(30, 40).addBox(-2.1F, -6.1F, -0.5F, 2.0F, 9.2F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 6.0F, 0.85F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r2 = armorBody.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(5, 54).addBox(-3.1F, -2.5F, -0.125F, 0.2F, 3.0F, 2.25F, new CubeDeformation(0.0F))
		.texOffs(0, 54).addBox(-9.1F, -2.5F, -0.125F, 0.2F, 3.0F, 2.25F, new CubeDeformation(0.0F))
		.texOffs(39, 52).addBox(-9.1F, -2.5F, -0.125F, 6.2F, 3.0F, 0.25F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 4.1F, -2.225F, 0.6545F, 0.0F, 0.0F));

		PartDefinition armorRightArm = partdefinition.addOrReplaceChild("armorRightArm", CubeListBuilder.create().texOffs(0, 17).addBox(-2.1F, -3.1F, -2.1F, 4.2F, 12.2F, 4.2F, new CubeDeformation(0.0F))
		.texOffs(0, 46).addBox(-2.2F, -2.45F, -2.2F, 2.4F, 1.2F, 4.4F, new CubeDeformation(0.0F))
		.texOffs(13, 46).addBox(-2.2F, -0.45F, -2.2F, 2.4F, 1.2F, 4.4F, new CubeDeformation(0.0F))
		.texOffs(47, 32).addBox(-2.2F, 1.55F, -2.2F, 2.4F, 1.2F, 4.4F, new CubeDeformation(0.0F))
		.texOffs(51, 6).addBox(-2.2F, 5.55F, -2.2F, 2.4F, 1.2F, 4.4F, new CubeDeformation(0.0F))
		.texOffs(34, 14).addBox(-2.2F, 8.55F, -2.2F, 4.4F, 1.2F, 4.4F, new CubeDeformation(0.0F))
		.texOffs(51, 0).addBox(-2.2F, 3.55F, -2.2F, 2.4F, 1.2F, 4.4F, new CubeDeformation(0.0F))
		.texOffs(28, 52).addBox(0.8F, -3.2F, -2.15F, 1.4F, 1.2F, 4.4F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 18.0F, 0.0F));

		PartDefinition armorLeftArm = partdefinition.addOrReplaceChild("armorLeftArm", CubeListBuilder.create().texOffs(17, 17).addBox(-2.1F, -3.1F, -2.1F, 4.2F, 12.2F, 4.2F, new CubeDeformation(0.0F))
		.texOffs(17, 52).addBox(-2.2F, -3.2F, -2.15F, 1.4F, 1.2F, 4.4F, new CubeDeformation(0.0F))
		.texOffs(39, 40).addBox(-0.2F, -2.45F, -2.2F, 2.4F, 1.2F, 4.4F, new CubeDeformation(0.0F))
		.texOffs(39, 46).addBox(-0.2F, -0.45F, -2.2F, 2.4F, 1.2F, 4.4F, new CubeDeformation(0.0F))
		.texOffs(49, 20).addBox(-0.2F, 1.55F, -2.2F, 2.4F, 1.2F, 4.4F, new CubeDeformation(0.0F))
		.texOffs(51, 12).addBox(-0.2F, 5.55F, -2.2F, 2.4F, 1.2F, 4.4F, new CubeDeformation(0.0F))
		.texOffs(0, 34).addBox(-2.2F, 8.55F, -2.2F, 4.4F, 1.2F, 4.4F, new CubeDeformation(0.0F))
		.texOffs(49, 26).addBox(-0.2F, 3.55F, -2.2F, 2.4F, 1.2F, 4.4F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 18.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		armorBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorRightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorLeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}