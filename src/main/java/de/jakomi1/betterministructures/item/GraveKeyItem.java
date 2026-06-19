package de.jakomi1.betterministructures.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class GraveKeyItem extends Item {

    public GraveKeyItem() {
        super(new Properties()
                .stacksTo(1)                // Nur ein Schlüssel pro Slot
                .rarity(Rarity.UNCOMMON)    // Hebt sich optisch ab
                .durability(0)              // Kein Verschleiß, optional
        );
    }
}
