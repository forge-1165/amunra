package de.katzenpapst.amunra1122.client;

import de.katzenpapst.amunra1122.AmunRa1122;
import de.katzenpapst.amunra1122.registry.ARContent1122;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = AmunRa1122.MODID, value = net.minecraftforge.fml.relauncher.Side.CLIENT)
public final class ARClientRegistration1122 {
    private ARClientRegistration1122() {}

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        register(ARContent1122.EXAMPLE_BLOCK_ITEM);
    }

    private static void register(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
