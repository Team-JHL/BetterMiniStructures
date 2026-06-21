package de.jakomi1.betterministructures.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import de.jakomi1.betterministructures.block.GraveStoneBlock;
import de.jakomi1.betterministructures.BetterministructuresMod;

public class BetterministructuresModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterministructuresMod.MODID);
	public static final RegistryObject<Block> GRAVE_STONE = REGISTRY.register("grave_stone", GraveStoneBlock::new);
}
