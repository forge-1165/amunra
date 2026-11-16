package de.katzenpapst.amunra1122;

import de.katzenpapst.amunra1122.config.ARConfig1122;
import de.katzenpapst.amunra1122.registry.ARContent1122;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;

@Mod(modid = AmunRa1122.MODID, name = AmunRa1122.NAME, version = AmunRa1122.VERSION,
        dependencies = "required-after:GalacticraftCore;required-after:GalacticraftPlanets")
@EventBusSubscriber(modid = AmunRa1122.MODID)
public final class AmunRa1122 {
    public static final String MODID = "GalacticraftAmunRa";
    public static final String NAME = "Amun-Ra";
    public static final String VERSION = "0.5.0-1.12.2-port";

    @Mod.Instance(MODID)
    public static AmunRa1122 INSTANCE;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ARConfig1122.load(event.getSuggestedConfigurationFile());
        event.getModLog().info("Amun-Ra 1.12.2 port starting; features are being migrated incrementally.");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // Feature integrations and Galacticraft celestial registration will be
        // restored here as their 1.7.10 implementations are ported.
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }

    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent event) {
    }

    @Mod.EventHandler
    public void serverStarted(FMLServerStartedEvent event) {
    }

    @SubscribeEvent
    public static void registerBlocks(net.minecraftforge.event.RegistryEvent.Register<net.minecraft.block.Block> event) {
        ARContent1122.registerBlocks(event.getRegistry());
    }

    @SubscribeEvent
    public static void registerItems(net.minecraftforge.event.RegistryEvent.Register<net.minecraft.item.Item> event) {
        ARContent1122.registerItems(event.getRegistry());
    }
}
