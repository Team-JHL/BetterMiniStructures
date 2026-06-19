
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package de.jakomi1.betterministructures.init;

import de.jakomi1.betterministructures.item.GraveKeyItem;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import de.jakomi1.betterministructures.BetterministructuresMod;

public class BetterministructuresModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BetterministructuresMod.MODID);
	public static final RegistryObject<Item> GRAVE_STONE = block(BetterministructuresModBlocks.GRAVE_STONE);
	public static final RegistryObject<Item> GRAVE_KEY = REGISTRY.register("grave_key", GraveKeyItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
