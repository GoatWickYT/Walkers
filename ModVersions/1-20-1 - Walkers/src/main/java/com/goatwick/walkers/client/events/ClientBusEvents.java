package com.goatwick.walkers.client.events;

import com.goatwick.walkers.Walkers;
import com.goatwick.walkers.core.init.ItemInit;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Walkers.MODID, bus = Bus.FORGE, value = Dist.CLIENT)
public class ClientBusEvents {
	
    @SubscribeEvent
    public static void renderPlayerPre(RenderPlayerEvent.Pre event)
    {
    	if (event.getEntity().getInventory().getArmor(0).is(ItemInit.SPACE_BOOTS.get())) {
    		event.getRenderer().getModel().leftPants.visible = false;
    		event.getRenderer().getModel().rightPants.visible = false;
    	}
        if (event.getEntity().getInventory().getArmor(2).is(ItemInit.SPACE_CHESTPLATE.get())) {
            event.getRenderer().getModel().leftSleeve.visible = false;
            event.getRenderer().getModel().rightSleeve.visible = false;
            event.getRenderer().getModel().jacket.visible = false;
        }
        if (event.getEntity().getInventory().getArmor(3).is(ItemInit.SPACE_HELMET.get())) {
            event.getRenderer().getModel().hat.visible = false;
            event.getRenderer().getModel().head.visible = false;
        }
		if (event.getEntity().getInventory().getArmor(1).is(ItemInit.SPACE_LEGGINGS.get())) {
			event.getRenderer().getModel().leftPants.visible = false;
			event.getRenderer().getModel().rightPants.visible = false;
			event.getRenderer().getModel().leftLeg.visible = false;
			event.getRenderer().getModel().rightLeg.visible = false;
		}
    }
}