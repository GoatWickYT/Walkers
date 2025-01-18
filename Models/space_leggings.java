// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class space_leggings<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "space_leggings"), "main");
	private final ModelPart armorLeftLeg;
	private final ModelPart armorRightLeg;

	public space_leggings(ModelPart root) {
		this.armorLeftLeg = root.getChild("armorLeftLeg");
		this.armorRightLeg = root.getChild("armorRightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition armorLeftLeg = partdefinition.addOrReplaceChild("armorLeftLeg", CubeListBuilder.create().texOffs(0, 0).addBox(-2.1F, 0.0F, -2.1F, 4.2F, 9.0F, 4.2F, new CubeDeformation(0.0F))
		.texOffs(18, 0).addBox(-2.35F, 1.0F, -2.35F, 4.7F, 2.0F, 4.7F, new CubeDeformation(0.0F))
		.texOffs(18, 14).addBox(-2.35F, 3.25F, -2.35F, 4.7F, 2.0F, 4.7F, new CubeDeformation(0.0F))
		.texOffs(2, 28).addBox(-2.35F, 5.5F, -2.35F, 4.7F, 2.0F, 4.7F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 20.0F, 0.0F));

		PartDefinition armorRightLeg = partdefinition.addOrReplaceChild("armorRightLeg", CubeListBuilder.create().texOffs(0, 13).addBox(-2.1F, 0.0F, -2.1F, 4.2F, 9.0F, 4.2F, new CubeDeformation(0.0F))
		.texOffs(18, 7).addBox(-2.35F, 1.0F, -2.35F, 4.7F, 2.0F, 4.7F, new CubeDeformation(0.0F))
		.texOffs(18, 21).addBox(-2.35F, 3.25F, -2.35F, 4.7F, 2.0F, 4.7F, new CubeDeformation(0.0F))
		.texOffs(22, 28).addBox(-2.35F, 5.5F, -2.35F, 4.7F, 2.0F, 4.7F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 20.0F, 0.0F));

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