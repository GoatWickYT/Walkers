package com.goatwick.walkers.core.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.goatwick.walkers.client.model.SpaceBoots;
import com.goatwick.walkers.client.model.SpaceChestplate;
import com.goatwick.walkers.client.model.SpaceHelmet;
import com.goatwick.walkers.client.model.SpaceLeggings;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ModelsInit {
	
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(SpaceHelmet.LAYER_LOCATION, SpaceHelmet::createBodyLayer);
		event.registerLayerDefinition(SpaceChestplate.LAYER_LOCATION, SpaceChestplate::createBodyLayer);
		event.registerLayerDefinition(SpaceLeggings.LAYER_LOCATION, SpaceLeggings::createBodyLayer);
		event.registerLayerDefinition(SpaceBoots.LAYER_LOCATION, SpaceBoots::createBodyLayer);
	}
}
