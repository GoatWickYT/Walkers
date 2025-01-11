package com.goatwick.walkers.core.init;

import com.goatwick.walkers.Walkers;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagInit {
	public static final TagKey<Block> NEEDS_EXAMPLE_TOOL = tag("needs_example_tool");
	
	public static TagKey<Block> tag(String name) {
		return BlockTags.create(new ResourceLocation(Walkers.MODID, name));
	}
}
