package com.creatisfactory.block;

import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.entry.ItemEntry;

//import net.minecraft.world.
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;

import static com.creatisfactory.Creatisfactory.LOGGER;
import static com.creatisfactory.Creatisfactory.REGISTRATE;

public class ModBlocks {
	public static final BlockEntry<Block> plastic_block =
			REGISTRATE.block("plastic_block", Block::new)
					.simpleItem()
					.register();

	public static void load() {
		LOGGER.info("Loading Creatisfactory Blocks");
	}
}
