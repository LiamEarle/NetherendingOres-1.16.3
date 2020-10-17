package org.icannt.netherendingores.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.icannt.netherendingores.registry.block.BlockRegistry;
import org.icannt.netherendingores.registry.item.ItemRegistry;

public class RegistryCommon {

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        for(Block block : BlockRegistry.getBlocks().values()) {
            if (block.getRegistryName() == null)
                continue;

            event.getRegistry().register(block);
        }
    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        for(Item item : ItemRegistry.getItems()) {
            if (item.getRegistryName() == null)
                continue;

            event.getRegistry().register(item);
        }
    }
}
