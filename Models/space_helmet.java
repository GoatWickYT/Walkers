// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class space_helmet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "space_helmet"), "main");
	private final ModelPart armorHead;

	public space_helmet(ModelPart root) {
		this.armorHead = root.getChild("armorHead");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition armorHead = partdefinition.addOrReplaceChild("armorHead", CubeListBuilder.create().texOffs(0, 41).addBox(-4.0F, -7.441F, -4.484F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(46, 37).addBox(-4.25F, -7.491F, -4.984F, 8.5F, 1.5F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(0, 13).addBox(-4.15F, -8.491F, -4.234F, 8.3F, 9.5F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.15F, -8.491F, -0.234F, 8.3F, 7.5F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(27, 0).addBox(-4.1F, -0.991F, -0.234F, 8.2F, 1.6F, 4.85F, new CubeDeformation(0.0F))
		.texOffs(27, 8).addBox(-4.25F, -0.916F, -4.984F, 8.5F, 1.5F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(17, 54).addBox(-1.75F, -1.166F, -5.234F, 0.5F, 1.75F, 0.75F, new CubeDeformation(0.0F))
		.texOffs(22, 54).addBox(-1.75F, -8.166F, -5.234F, 0.5F, 1.75F, 0.75F, new CubeDeformation(0.0F))
		.texOffs(52, 20).addBox(-1.75F, -3.341F, -5.234F, 0.5F, 0.75F, 0.75F, new CubeDeformation(0.0F))
		.texOffs(3, 55).addBox(-1.75F, -5.341F, -5.234F, 0.5F, 0.75F, 0.75F, new CubeDeformation(0.0F))
		.texOffs(32, 54).addBox(1.25F, -8.166F, -5.234F, 0.5F, 1.75F, 0.75F, new CubeDeformation(0.0F))
		.texOffs(0, 27).addBox(-1.75F, -8.666F, -4.734F, 0.5F, 2.5F, 9.75F, new CubeDeformation(0.0F))
		.texOffs(48, 33).addBox(-4.5F, -6.166F, -4.734F, 0.5F, 1.25F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(50, 8).addBox(-4.5F, -4.166F, -4.734F, 0.5F, 1.25F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(48, 26).addBox(-4.5F, -2.166F, -4.734F, 0.5F, 2.25F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(38, 48).addBox(4.0F, -2.166F, -4.734F, 0.5F, 2.25F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(25, 13).addBox(-4.5F, -6.166F, 1.516F, 9.0F, 5.25F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(19, 48).addBox(-2.5F, -6.166F, 1.516F, 5.0F, 1.0F, 3.5F, new CubeDeformation(0.0F))
		.texOffs(23, 37).addBox(-4.5F, -6.166F, -0.484F, 9.0F, 3.25F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(10, 51).addBox(4.0F, -4.166F, -4.734F, 0.5F, 1.25F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(3, 51).addBox(4.0F, -6.166F, -4.734F, 0.5F, 1.25F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(54, 4).addBox(4.0F, -2.666F, -3.234F, 0.5F, 0.5F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(52, 52).addBox(4.0F, -4.666F, -3.234F, 0.5F, 1.25F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(52, 48).addBox(4.0F, -6.666F, -3.234F, 0.5F, 1.25F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(54, 0).addBox(-4.5F, -2.666F, -3.234F, 0.5F, 0.5F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(52, 16).addBox(-4.5F, -4.666F, -3.234F, 0.5F, 1.25F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(52, 12).addBox(-4.5F, -6.666F, -3.234F, 0.5F, 1.25F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(25, 23).addBox(1.25F, -8.666F, -4.734F, 0.5F, 2.5F, 9.75F, new CubeDeformation(0.0F))
		.texOffs(0, 51).addBox(-1.75F, -6.166F, 5.016F, 0.5F, 6.0F, 0.25F, new CubeDeformation(0.0F))
		.texOffs(49, 48).addBox(1.25F, -6.166F, 5.016F, 0.5F, 6.0F, 0.25F, new CubeDeformation(0.0F))
		.texOffs(55, 33).addBox(1.25F, -5.341F, -5.234F, 0.5F, 0.75F, 0.75F, new CubeDeformation(0.0F))
		.texOffs(8, 55).addBox(1.25F, -3.341F, -5.234F, 0.5F, 0.75F, 0.75F, new CubeDeformation(0.0F))
		.texOffs(27, 54).addBox(1.25F, -1.166F, -5.234F, 0.5F, 1.75F, 0.75F, new CubeDeformation(0.0F))
		.texOffs(19, 43).addBox(-4.25F, -5.291F, -4.984F, 8.5F, 1.5F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(42, 43).addBox(-4.25F, -3.091F, -4.984F, 8.5F, 1.5F, 1.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 26.441F, -0.516F));

		PartDefinition cube_r1 = armorHead.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(48, 23).addBox(-3.5F, -0.25F, -0.25F, 7.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.916F, 4.766F, 0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		armorHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}