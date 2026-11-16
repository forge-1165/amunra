package de.katzenpapst.amunra1122.registry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.IForgeRegistry;

/** Minimal registry-event based content port; legacy blocks/items are migrated here incrementally. */
public final class ARContent1122 {
    public static final Block EXAMPLE_BLOCK = new Block(Material.ROCK)
            .setRegistryName(new ResourceLocation("amunra", "port_example_block"))
            .setTranslationKey("amunra.port_example_block");

    public static final Item EXAMPLE_BLOCK_ITEM = new ItemBlock(EXAMPLE_BLOCK)
            .setRegistryName(EXAMPLE_BLOCK.getRegistryName());

    private ARContent1122() {}

    public static void registerBlocks(IForgeRegistry<Block> registry) {
        registry.register(EXAMPLE_BLOCK);
    }

    public static void registerItems(IForgeRegistry<Item> registry) {
        registry.register(EXAMPLE_BLOCK_ITEM);
    }
}
