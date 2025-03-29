package com.goatwick.walkers.events;

import com.goatwick.walkers.custom.armor.SpaceArmorItem;
import com.goatwick.walkers.Walkers;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Walkers.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SpaceArmorEventHandler {

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        boolean isWearingHelmet = player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof SpaceArmorItem.Helmet;
        boolean isWearingChestplate = player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof SpaceArmorItem.Chestplate;
        boolean isWearingLeggings = player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof SpaceArmorItem.Leggings;
        boolean isWearingBoots = player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof SpaceArmorItem.Boots;
        
        // Only run on the SERVER side to avoid issues
        if (player.level().isClientSide() || event.phase != TickEvent.Phase.START) {
            return;
        }

        // Check if player is wearing the full armor set
        boolean isWearingFullSet = isWearingHelmet && isWearingChestplate && isWearingLeggings && isWearingBoots;

        // Apply Night Vision when wearing the helmet
        if (isWearingHelmet) {
            player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 220, 0, false, false));
        }

        // Apply Resistance 1 when wearing full armor set
        if (isWearingFullSet) {
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 220, 0, false, false));
        }
    }
}
