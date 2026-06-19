package de.jakomi1.betterministructures.procedures;

import de.jakomi1.betterministructures.init.BetterministructuresModItems;
import de.jakomi1.betterministructures.item.GraveKeyItem;
import net.minecraft.client.resources.model.Material;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AirItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;

public class OnGraveStoneClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, LivingEntity entity) {
		if (entity == null)
			return;

		// Prüfen, ob der Spieler einen Diamanten in der Hand hat
		ItemStack heldItem = entity.getMainHandItem();
		if (!heldItem.is(BetterministructuresModItems.GRAVE_KEY.get())) {
			return; // Nicht mit Diamant → nichts tun
		}
		entity.setItemInHand(InteractionHand.MAIN_HAND, new ItemStack(Items.AIR));
		BlockPos pos = BlockPos.containing(x, y, z);

		if (world instanceof ServerLevel level) {
			int boneCount = Mth.nextInt(RandomSource.create(), 3, 5);

			for (int i = 0; i < boneCount; i++) {
				ItemEntity bone = new ItemEntity(level, x + 0.5, y, z + 0.5, new ItemStack(Items.BONE));
				bone.setPickUpDelay(10);
				level.addFreshEntity(bone);
			}

			ItemEntity skull = new ItemEntity(level, x + 0.5, y, z + 0.5, new ItemStack(Items.SKELETON_SKULL));
			skull.setPickUpDelay(10);
			level.addFreshEntity(skull);
		}

		// Block zerstören
		world.destroyBlock(pos, false);

		// Sound abspielen
		if (world instanceof Level level) {
			level.playSound(null, pos, SoundEvents.CHEST_OPEN, SoundSource.BLOCKS, 1.0f, 0.0f);
		}
	}
}
