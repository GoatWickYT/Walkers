package com.goatwick.walkers.core.init;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import com.goatwick.walkers.Walkers;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabInit {
	public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Walkers.MODID);

	public static final List<Supplier<? extends ItemLike>> EXAMPLE_TAB_ITEMS = new ArrayList<>();
	
	public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = TABS.register("walkers_tab",
			() -> CreativeModeTab.builder()
				.title(Component.translatable("Goat Wick's : Walkers"))
				.icon(ItemInit.ICON.get()::getDefaultInstance)
				.displayItems((displayParams, output) -> {
					EXAMPLE_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get()));
				})
				.build()
	);
	
	public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike){
		EXAMPLE_TAB_ITEMS.add(itemLike);
		return itemLike;
	}
}
