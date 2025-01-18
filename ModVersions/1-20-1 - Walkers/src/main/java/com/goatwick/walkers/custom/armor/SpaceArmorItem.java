
package com.goatwick.walkers.custom.armor;

import net.minecraftforge.client.extensions.common.IClientItemExtensions;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.Minecraft;

import java.util.function.Consumer;
import java.util.Map;
import java.util.Collections;

import com.goatwick.walkers.Walkers;
import com.goatwick.walkers.client.model.SpaceBoots;
import com.goatwick.walkers.client.model.SpaceChestplate;
import com.goatwick.walkers.client.model.SpaceHelmet;
import com.goatwick.walkers.client.model.SpaceLeggings;

public abstract class SpaceArmorItem extends ArmorItem {
	public SpaceArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{30, 40, 45, 34}[type.getSlot().getIndex()] * 15;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{4, 8, 10, 4}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return SoundEvents.ARMOR_EQUIP_CHAIN;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}

			@Override
			public String getName() {
				return "space";
			}

			@Override
			public float getToughness() {
				return 1f;
			}

			@Override
			public float getKnockbackResistance() {
				return 3f;
			}
		}, type, properties);
	}

	public static class Helmet extends SpaceArmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public void initializeClient(Consumer<IClientItemExtensions> consumer) {
			consumer.accept(new IClientItemExtensions() {
				@Override
				public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of(
								"head", new SpaceHelmet(Minecraft.getInstance().getEntityModels().bakeLayer(SpaceHelmet.LAYER_LOCATION)).armorHead,
								"hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
								"body", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
								"right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
								"left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
								"right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
								"left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap())
							)));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return Walkers.MODID + ":textures/entity/space_helmet.png";
		}
	}
	
	public static class Chestplate extends SpaceArmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}
		
		@Override
		public void initializeClient(Consumer<IClientItemExtensions> consumer) {
			consumer.accept(new IClientItemExtensions() {
				@Override
				public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of(
								"body",new SpaceChestplate(Minecraft.getInstance().getEntityModels().bakeLayer(SpaceChestplate.LAYER_LOCATION)).armorBody,
								"left_arm", new SpaceChestplate(Minecraft.getInstance().getEntityModels().bakeLayer(SpaceChestplate.LAYER_LOCATION)).armorLeftArm,
								"right_arm", new SpaceChestplate(Minecraft.getInstance().getEntityModels().bakeLayer(SpaceChestplate.LAYER_LOCATION)).armorRightArm,
								"head", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
								"hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
								"right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
								"left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap())
							)));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		
		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return Walkers.MODID + ":textures/entity/space_chestplate.png";
		}
	}

	public static class Leggings extends SpaceArmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties());
		}

		@Override
		public void initializeClient(Consumer<IClientItemExtensions> consumer) {
			consumer.accept(new IClientItemExtensions() {
				@Override
				public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of(
								"left_leg", new SpaceLeggings(Minecraft.getInstance().getEntityModels().bakeLayer(SpaceLeggings.LAYER_LOCATION)).armorLeftLeg,
								"right_leg", new SpaceLeggings(Minecraft.getInstance().getEntityModels().bakeLayer(SpaceLeggings.LAYER_LOCATION)).armorLeftLeg,
								"head", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
								"hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
								"body", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
								"right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
								"left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap())
							)));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}


		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return Walkers.MODID + ":textures/entity/space_leggings.png";
		}
	}
	
	public static class Boots extends SpaceArmorItem{
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties());
		}
		
		@Override
		public void initializeClient(Consumer<IClientItemExtensions> consumer) {
			consumer.accept(new IClientItemExtensions() {
				@Override
				public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of(
								"left_leg", new SpaceBoots(Minecraft.getInstance().getEntityModels().bakeLayer(SpaceBoots.LAYER_LOCATION)).armorLeftBoot,
								"right_leg", new SpaceBoots(Minecraft.getInstance().getEntityModels().bakeLayer(SpaceBoots.LAYER_LOCATION)).armorLeftBoot,
								"head", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
								"hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
								"body", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
								"right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
								"left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap())
							)));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}


		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return Walkers.MODID + ":textures/entity/space_boots.png";
		}
	}
}
