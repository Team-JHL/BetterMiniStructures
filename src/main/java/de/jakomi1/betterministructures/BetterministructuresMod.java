package de.jakomi1.betterministructures;

import dev.faststats.ErrorTracker;
import dev.faststats.Metrics;
import dev.faststats.neoforge.NeoForgeContext;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import de.jakomi1.betterministructures.init.BetterministructuresModItems;
import de.jakomi1.betterministructures.init.BetterministructuresModBlocks;

@Mod(BetterministructuresMod.MODID)
public class BetterministructuresMod {
	public static final Logger LOGGER = LogManager.getLogger(BetterministructuresMod.class);
	public static final String MODID = "betterministructures";
    public static final ErrorTracker ERROR_TRACKER = ErrorTracker.contextAware();
    private final NeoForgeContext context = new NeoForgeContext.Factory(MODID, "dd4d97c00d36f69ea83ba543d3c6e8e6")
            .errorTrackerService(ERROR_TRACKER)
            .metrics(Metrics.Factory::create)
            .create();

	public BetterministructuresMod(IEventBus modEventBus) {
		BetterministructuresModBlocks.REGISTRY.register(modEventBus);
		BetterministructuresModItems.REGISTRY.register(modEventBus);
	}
}
