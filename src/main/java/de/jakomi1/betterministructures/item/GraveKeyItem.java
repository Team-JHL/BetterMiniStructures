package de.jakomi1.betterministructures.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class GraveKeyItem extends Item {

    public GraveKeyItem() {
        super(new Properties()
                .stacksTo(1)
                .rarity(Rarity.UNCOMMON)
                .durability(0)
        );
    }
}
