package org.icannt.netherendingores.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import org.icannt.netherendingores.registry.item.ItemRegistry;

import java.util.Objects;
import java.util.Random;

public class BlockOre extends BlockBase {
    private final OreTypeData type;

    public BlockOre(OreTypeData type, Block.Properties props) {
        super(type.getName(), props);
        this.type = type;
    }

    @Override
    public void registerBlockItem() {
        Item.Properties props = new Item.Properties()
                .maxStackSize(64)
                .group(ItemRegistry.GROUP)
                .rarity(type.getRarity());

        BlockItem object = new BlockItem(this, props);
        object.setRegistryName(Objects.requireNonNull(this.getRegistryName()));
        ItemRegistry.add(object);
    }

    @Override
    public int getLightValue(BlockState state, IBlockReader world, BlockPos pos) {
        return type.getLightLevel();
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader world, BlockPos pos, int fortune, int silktouch) {
        Random random = new Random();
        return random.nextInt(type.getExperienceMaximum() - type.getExperienceMinimum()) + type.getExperienceMinimum();
    }
}
