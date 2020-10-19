package org.icannt.netherendingores.registry.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import org.icannt.netherendingores.common.block.BlockOre;
import org.icannt.netherendingores.common.block.IOreType;
import org.icannt.netherendingores.common.block.OreTypeData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BlockRegistry {

    private static final HashMap<IOreType, Block> ORES = new HashMap<>();
    private static final List<Block> BLOCKS = new ArrayList<>();

    public static void setup() {
        // Register Ore Blocks
        for (OreTypeData ore : OreTypeData.values()) {
            Block.Properties props = Block.Properties.create(Material.ROCK, ore.getMaterialColor())
                    .hardnessAndResistance(ore.getHardness(), ore.getResistance())
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(ore.getHarvestLevel());
            BlockOre block = new BlockOre(ore, props);
            block.registerBlockItem();
            BlockRegistry.addOre(ore, block);
        }
    }

    public static void addOre(IOreType type, Block block) {
        ORES.put(type, block);
        BLOCKS.add(block);
    }

    public static void add(Block block) {
        BLOCKS.add(block);
    }

    public static HashMap<IOreType, Block> getOres() {
        return ORES;
    }

    public static List<Block> getBlocks() {
        return BLOCKS;
    }

    public static BlockOre getOreOfType(IOreType type) {
        return (BlockOre) ORES.get(type);
    }
}
