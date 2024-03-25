package com.creatisfactory.item;

import com.tterrag.registrate.util.entry.ItemEntry;

import net.minecraft.world.item.Item;


import static com.creatisfactory.Creatisfactory.REGISTRATE;

public class ModItems {

	public static final ItemEntry<Item> TEST_ITEM =
			REGISTRATE.item("plastic", Item::new).register();

	public static void load() {  }

}
