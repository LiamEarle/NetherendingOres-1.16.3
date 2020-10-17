package org.icannt.netherendingores.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.registry.item.ItemRegistry;

import java.util.Objects;

public class BlockBase extends Block {
    private final String name;
    private final IOreType type;

    public BlockBase(String name, IOreType type, Properties properties) {
        super(properties);
        this.name = name;
        this.type = type;

        this.registrySetup();
        this.generateItem();
    }

    private void registrySetup() {
        setRegistryName(new ResourceLocation(NetherendingOres.MOD_ID, this.name));
    }

    private void generateItem() {
        Item.Properties props = new Item.Properties()
                .maxStackSize(64)
                .group(ItemRegistry.GROUP);

        BlockItem object = new BlockItem(this, props);
        object.setRegistryName(Objects.requireNonNull(this.getRegistryName()));
        ItemRegistry.add(object);
    }

    @Override
    public int getLightValue(BlockState state, IBlockReader world, BlockPos pos) {
        return type.getLightLevel();
    }
}
