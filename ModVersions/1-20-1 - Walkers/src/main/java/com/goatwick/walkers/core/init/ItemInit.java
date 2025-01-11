package com.goatwick.walkers.core.init;

import com.goatwick.walkers.Walkers;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
		public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Walkers.MODID);

	    public static final RegistryObject<Item> ICON = 	
				ITEMS.register("icon",
					() -> new Item(new Item.Properties()
							.rarity(Rarity.EPIC)
					));
	    
	    public static final RegistryObject<Item> STEEL_INGOT = CreativeTabInit.addToTab(
				ITEMS.register("steel_ingot",
					() -> new Item(new Item.Properties()
							.rarity(Rarity.COMMON)
					)));
	    
	    /*
	    public static final RegistryObject<Item> EXAMPLE_ITEM = CreativeTabInit.addToTab(	
				ITEMS.register("example_item",
					() -> new Item(new Item.Properties()
							.rarity(Rarity.EPIC)
					)));
	     
	    
		public static final RegistryObject<BlockItem> EXAMPLE_BLOCK_ITEM = CreativeTabInit.addToTab(
				ITEMS.register("example_block",
					() -> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(), new Item.Properties()
							.rarity(Rarity.COMMON)
					)));
		
		
		public static final RegistryObject<SwordItem> EXAMPLE_SWORD = CreativeTabInit.addToTab(
				ITEMS.register("example_sword",
					() -> new SwordItem(
							TiersInit.ASGARDIUM,
							3,
							2.4f,
							new Item.Properties()
								.rarity(Rarity.UNCOMMON)
					)));
		
	    public static final RegistryObject<PickaxeItem> EXAMPLE_PICKAXE = CreativeTabInit.addToTab(
	    		ITEMS.register("example_pickaxe",
					() -> new PickaxeItem(
							TiersInit.ASGARDIUM,
							1,
							-2.8f,
							new Item.Properties()
								.rarity(Rarity.UNCOMMON)
					)));
	    
		public static final RegistryObject<HoeItem> EXAMPLE_HOE = CreativeTabInit.addToTab(
				ITEMS.register("example_hoe",
					() -> new HoeItem(
							TiersInit.ASGARDIUM,
							-3,
							0f,
							new Item.Properties()
								.rarity(Rarity.UNCOMMON)
					)));
		
		public static final RegistryObject<AxeItem> EXAMPLE_AXE = CreativeTabInit.addToTab(
				ITEMS.register("example_axe",
	                () -> new AxeItem(
	                		TiersInit.ASGARDIUM,
	                		6,
	                		-3.2f,
	                		new Item.Properties()
	                			.rarity(Rarity.UNCOMMON)
	                )));
		
		public static final RegistryObject<ShovelItem> EXAMPLE_SHOVEL = CreativeTabInit.addToTab(
				ITEMS.register("example_shovel",
					() -> new ShovelItem(
							TiersInit.ASGARDIUM,
							1.5f,
							-3.0f,
							new Item.Properties()
								.rarity(Rarity.UNCOMMON)
					)));
		
		
		public static final RegistryObject<ArmorItem> EXAMPLE_HELMET = CreativeTabInit.addToTab(
				ITEMS.register("example_helmet",
					() -> new ArmorItem(
							CustomArmorMaterialInit.ASGARDIUM,
							ArmorItem.Type.HELMET,
							new Item.Properties()
								.rarity(Rarity.UNCOMMON)
					)));
		
		public static final RegistryObject<ArmorItem> EXAMPLE_CHESTPLATE = CreativeTabInit.addToTab(
				ITEMS.register("example_chestplate",
					() -> new ArmorItem(
							CustomArmorMaterialInit.ASGARDIUM,
							ArmorItem.Type.CHESTPLATE,
							new Item.Properties()
								.rarity(Rarity.UNCOMMON)
					)));

		public static final RegistryObject<ArmorItem> EXAMPLE_LEGGINGS = CreativeTabInit.addToTab(
				ITEMS.register("example_leggings",
					() -> new ArmorItem(
							CustomArmorMaterialInit.ASGARDIUM,
							ArmorItem.Type.LEGGINGS,
							new Item.Properties()
								.rarity(Rarity.UNCOMMON)
					)));

		public static final RegistryObject<ArmorItem> EXAMPLE_BOOTS = CreativeTabInit.addToTab(
				ITEMS.register("example_boots",
					() -> new ArmorItem(
							CustomArmorMaterialInit.ASGARDIUM,
							ArmorItem.Type.BOOTS,
							new Item.Properties()
								.rarity(Rarity.UNCOMMON)
					)));
	*/
}
