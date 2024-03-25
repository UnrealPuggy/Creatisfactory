package com.creatisfactory.item;

import com.creatisfactory.item.chemicalStuff.balloonItem;
import com.tterrag.registrate.util.entry.ItemEntry;

import static com.creatisfactory.Creatisfactory.REGISTRATE;

public class ModItems {

	public static final ItemEntry<balloonItem> TEST_ITEM =
			REGISTRATE.item("balloon", balloonItem::new).register();

	public static void load() {  }

}
