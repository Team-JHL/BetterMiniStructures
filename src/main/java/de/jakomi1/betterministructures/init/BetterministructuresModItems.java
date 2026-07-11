package de.jakomi1.betterministructures.init;

import de.jakomi1.betterministructures.BetterministructuresMod;
import de.jakomi1.betterministructures.item.GraveKeyItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BetterministructuresModItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.createItems(BetterministructuresMod.MODID);
    public static final DeferredHolder<Item, Item> GRAVE_STONE = block(BetterministructuresModBlocks.GRAVE_STONE);
    public static final DeferredHolder<Item, Item> GRAVE_KEY = REGISTRY.register("grave_key", GraveKeyItem::new);

    private BetterministructuresModItems() {
    }

    private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
