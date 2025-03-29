package com.goatwick.walkers.client.events;

import java.util.function.Predicate;

import com.goatwick.walkers.Walkers;
import com.goatwick.walkers.core.init.ItemInit;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ProjectileWeaponItem;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Walkers.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class OverlayRenderer {

    // Path to your custom overlay texture
    private static final ResourceLocation SPACE_HELMET_OVERLAY = new ResourceLocation(Walkers.MODID + ":textures/misc/space_helmet_overlay.png");

    private static void renderHelmetOverlay(GuiGraphics guiGraphics) {
        Minecraft mc = Minecraft.getInstance();

        int screenWidth = mc.getWindow().getGuiScaledWidth();
        int screenHeight = mc.getWindow().getGuiScaledHeight();

        // Enable transparency blending (IMPORTANT!)
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShaderTexture(0, SPACE_HELMET_OVERLAY); // Set the texture

        // Render the overlay texture centered on the screen
        guiGraphics.blit(SPACE_HELMET_OVERLAY, 0, 0, 0, 0, screenWidth, screenHeight, screenWidth, screenHeight);

        // Disable blending after rendering
        RenderSystem.disableBlend();
    }

    private static LivingEntity getEntityLookedAt(Player player) {
        Minecraft mc = Minecraft.getInstance();
        double reachDistance = 10.0; // Max distance to detect mobs

        // Perform a raycast to find entities
        HitResult hitResult = mc.hitResult;
        if (hitResult instanceof EntityHitResult entityHit) {
            Entity entity = entityHit.getEntity();
            
            // Ensure the entity is a LivingEntity (has health)
            if (entity instanceof LivingEntity livingEntity) {
                return livingEntity;
            }
        }
        return null;
    }

    @SubscribeEvent
    public static void onRenderOverlay(RenderGuiOverlayEvent.Post event) {
        Minecraft mc = Minecraft.getInstance();
        LocalPlayer player = mc.player;

        if (player == null) return;
        // Ensure the player is wearing the space helmet
        
        if (player.getInventory().getArmor(3).getItem() != ItemInit.SPACE_HELMET.get()) {
            return; // Exit if not wearing the helmet
        }

        // 🔥 NEW: Check if the player is in first-person view
        if (!mc.options.getCameraType().isFirstPerson()) {
            return; // Don't render overlay in third-person
        }
        
        renderHelmetOverlay(event.getGuiGraphics());

        displayHeldItem(player, event, mc); // Display held item (if any)
        
        displayHealthBar(player, event, mc); // Display health bar of the entity the player is looking at

    }

    private static void displayHeldItem(Player player, RenderGuiOverlayEvent.Post event, Minecraft mc) {
        // Get the item in the main hand
        ItemStack mainHandItem = player.getMainHandItem();
        ItemStack itemPlaceholder = mainHandItem.copy();
        if (!mainHandItem.isEmpty()) { // Ensure the player is holding something
            GuiGraphics guiGraphics = event.getGuiGraphics();

            // Get screen width and height
            int screenWidth = event.getWindow().getGuiScaledWidth();
            int screenHeight = event.getWindow().getGuiScaledHeight();

            // Set position (Bottom-left corner, with some padding)
            int x = screenWidth - 30;  // Left padding
            int y = screenHeight - 30; // Bottom padding

            // Render the item
            guiGraphics.renderItem(itemPlaceholder, x, y);
            
			if (mainHandItem.getItem() instanceof ProjectileWeaponItem) {
				if (mainHandItem.getItem() instanceof CrossbowItem) {					
					itemPlaceholder.setCount(countItemInInventory(player, ProjectileWeaponItem.ARROW_OR_FIREWORK));
				}
				else if (mainHandItem.getItem() instanceof BowItem) {
					itemPlaceholder.setCount(countItemInInventory(player, ProjectileWeaponItem.ARROW_ONLY));
                }
			}
			else {				
				itemPlaceholder.setCount(countItemInInventory(player, mainHandItem));
			}
            // Render item count if stack size > 1
            guiGraphics.renderItemDecorations(mc.font, itemPlaceholder, x, y);
        }
    }
    


	private static void displayHealthBar(Player player, RenderGuiOverlayEvent.Post event, Minecraft mc) {
    	// Get the entity the player is looking at
        LivingEntity target = getEntityLookedAt(player);
        if (target == null) return; // No entity found

        // Get mob's name and health
        Component mobName = target.getDisplayName();
        int currentHealth = (int) target.getHealth();
        int maxHealth = (int) target.getMaxHealth();

        // Prepare text
        String healthText = "❤ " + currentHealth + " / " + maxHealth;

        // Get screen dimensions
        int screenWidth = event.getWindow().getGuiScaledWidth();
        int screenHeight = event.getWindow().getGuiScaledHeight();

        // Position text near the crosshair
        int x = screenWidth / 2;
        int y = screenHeight / 2 + 10;

     // Prepare rendering
        GuiGraphics guiGraphics = event.getGuiGraphics();
        guiGraphics.pose().pushPose(); // 🔥 Fix hotbar lighting issue

        // Render mob's name
        guiGraphics.drawString(mc.font, mobName, x - mc.font.width(mobName) / 2, y, 0xFFFFFF, true);

        // Render mob's health
        guiGraphics.drawString(mc.font, healthText, x - mc.font.width(healthText) / 2, y + 10, 0xFF5555, true);

        guiGraphics.pose().popPose(); // 🔥 Restore previous render state
    }
    
    private static int countItemInInventory(Player player, ItemStack item) {
        int itemCount = 0;

        // Check the player's inventory for the ammo item
        for (ItemStack stack : player.getInventory().items) {
            if (stack.is(item.getItem())) { // Check for specific ammo type
            	itemCount += stack.getCount();
            }
        }

        return itemCount;
    }
    
    private static int countItemInInventory(Player player, Predicate<ItemStack> allSupportedProjectiles) {
        int itemCount = 0;

        // Check the player's inventory for the ammo item
        for (ItemStack stack : player.getInventory().items) {
            if (allSupportedProjectiles.test(stack)) { // Check for specific ammo type
            	itemCount += stack.getCount();
            }
        }
        for (ItemStack stacks : player.getInventory().offhand) {
            if (allSupportedProjectiles.test(stacks)) { // Check for specific ammo type
            	itemCount += stacks.getCount();
            }
        }

        return itemCount;
	}
    
    private static int countItemInInventory(Player player, Item item) {
        int itemCount = 0;

        // Check the player's inventory for the ammo item
        for (ItemStack stack : player.getInventory().items) {
            if (stack.is(item)) { // Check for specific ammo type
            	itemCount += stack.getCount();
            }
        }

        return itemCount;
    }
    
}
