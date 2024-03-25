package com.creatisfactory.item;

import com.creatisfactory.item.chemicalStuff.balloonItem;
import com.tterrag.registrate.util.entry.ItemEntry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

import static com.creatisfactory.Creatisfactory.REGISTRATE;

public class ModItems {

	public static final ItemEntry<balloonItem> balloon_item =
			REGISTRATE.item("balloon", balloonItem::new)
					.properties(p -> {
						p.fireResistant();
						p.stacksTo(1);
						return p;
					})
					.register();
	public static final ItemEntry<Item> plastic =
			REGISTRATE.item("plastic", Item::new).register();
	public static void load() {  }


}
