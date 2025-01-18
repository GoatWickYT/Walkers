// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class space_boots<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "space_boots"), "main");
	private final ModelPart armorLeftBoot;
	private final ModelPart armorRightBoot;

	public space_boots(ModelPart root) {
		this.armorLeftBoot = root.getChild("armorLeftBoot");
		this.armorRightBoot = root.getChild("armorRightBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition armorLeftBoot = partdefinition.addOrReplaceChild("armorLeftBoot", CubeListBuilder.create().texOffs(0, 9).addBox(-2.1F, 8.0F, -3.85F, 4.2F, 3.1F, 5.95F, new CubeDeformation(0.0F))
		.texOffs(20, 12).addBox(-1.85F, 8.5F, -4.6F, 3.7F, 2.6F, 0.75F, new CubeDeformation(0.0F))
		.texOffs(20, 0).addBox(-2.25F, 7.5F, -2.6F, 4.5F, 2.6F, 4.75F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 14.0F, 0.0F));

		PartDefinition armorRightBoot = partdefinition.addOrReplaceChild("armorRightBoot", CubeListBuilder.create().texOffs(0, 0).addBox(-2.1F, 8.0F, -3.85F, 4.2F, 3.1F, 5.95F, new CubeDeformation(0.0F))
		.texOffs(21, 8).addBox(-1.85F, 8.5F, -4.6F, 3.7F, 2.6F, 0.75F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-2.25F, 7.5F, -2.6F, 4.5F, 2.6F, 4.75F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 14.0F, 0.0F));

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