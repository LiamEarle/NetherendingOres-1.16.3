package org.icannt.netherendingores.registry;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import org.icannt.netherendingores.registry.block.BlockRegistry;
import org.icannt.netherendingores.registry.data.DataRegistry;
import org.icannt.netherendingores.registry.item.ItemRegistry;

public class RegistryCommon {

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        for(Block block : BlockRegistry.getBlocks()) {
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

    @SubscribeEvent
    public static void registerGenerators(final GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            DataRegistry.serverSetup(event);
        }
    }
}
