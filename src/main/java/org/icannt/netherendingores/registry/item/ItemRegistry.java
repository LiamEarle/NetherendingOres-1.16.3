package org.icannt.netherendingores.registry.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.icannt.netherendingores.NetherendingOres;

import java.util.ArrayList;
import java.util.List;

public class ItemRegistry {

    public static final ItemGroup GROUP = new ItemGroup(NetherendingOres.MOD_ID + "_item_group") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.GOLD_INGOT);
        }


    };

    private static final List<Item> ITEMS = new ArrayList<>();

    public static void setup() {

    }

    public static void add(Item item) {
        ITEMS.add(item);
    }

    public static List<Item> getItems() {
        return ITEMS;
    }
}
