package com.goatwick.walkers.core.init;

import com.goatwick.walkers.Walkers;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Walkers.MODID);
	
	/*
	public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block",
			() -> new Block(BlockBehaviour.Properties.of()
					.mapColor(MapColor.CLAY)
					.strength(5.0f, 17.0f)
					.instrument(NoteBlockInstrument.BANJO)
					.lightLevel(state -> 5)
					.requiresCorrectToolForDrops()
			));
			*/
}
