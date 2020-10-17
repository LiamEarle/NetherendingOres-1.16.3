package org.icannt.netherendingores.registry.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

import org.icannt.netherendingores.common.block.BlockOre;
import org.icannt.netherendingores.common.block.IOreType;
import org.icannt.netherendingores.common.block.OreTypeData;

import java.util.HashMap;

public class BlockRegistry {

    private static final HashMap<IOreType, Block> BLOCKS = new HashMap<>();

    public static void setup() {
        for (OreTypeData ore : OreTypeData.values()) {
            Block.Properties props = Block.Properties.create(Material.ROCK, ore.getMaterialColor())
                    .hardnessAndResistance(ore.getHardness(), ore.getResistance())
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(ore.getHarvestLevel());
            BlockOre block = new BlockOre(ore, props);
            BlockRegistry.add(ore, block);
        }

    }

    public static void add(IOreType type, Block block) {
        BLOCKS.put(type, block);
    }

    public static HashMap<IOreType, Block> getBlocks() {
        return BLOCKS;
    }
}
