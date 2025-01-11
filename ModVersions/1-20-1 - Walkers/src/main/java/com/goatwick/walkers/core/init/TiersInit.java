package com.goatwick.walkers.core.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class TiersInit {
	public static final ForgeTier STEEL = new ForgeTier(
			2,
			800,
			1.0f,
			2.5f,
			17,
			BlockTags.NEEDS_IRON_TOOL,
			() -> Ingredient.of(ItemInit.STEEL_INGOT::get)
		);
}
