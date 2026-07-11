package de.jakomi1.betterministructures.init;


import de.jakomi1.betterministructures.BetterministructuresMod;
import de.jakomi1.betterministructures.block.GraveStoneBlock;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BetterministructuresModBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.createBlocks(BetterministructuresMod.MODID);
    public static final DeferredHolder<Block, Block> GRAVE_STONE = REGISTRY.register("grave_stone", GraveStoneBlock::new);

    private BetterministructuresModBlocks() {
    }
}
