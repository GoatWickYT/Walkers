package com.goatwick.walkers;

import com.goatwick.walkers.core.init.BlockInit;
import com.goatwick.walkers.core.init.CreativeTabInit;
import com.goatwick.walkers.core.init.ItemInit;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Walkers.MODID)
public class Walkers
{
	public static final String MODID = "walkers";
	
	public Walkers() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		
		BlockInit.BLOCKS.register(bus);
		
		CreativeTabInit.TABS.register(bus);
	}
   
}
