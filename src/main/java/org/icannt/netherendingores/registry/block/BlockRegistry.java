package org.icannt.netherendingores.registry.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import org.icannt.netherendingores.common.block.IOreType;
import org.icannt.netherendingores.common.block.end.BlockEndOre;
import org.icannt.netherendingores.common.block.end.EndOreTypeEnum;
import org.icannt.netherendingores.common.block.nether.BlockNetherOre;
import org.icannt.netherendingores.common.block.nether.NetherOreTypeEnum;
import org.icannt.netherendingores.common.block.overworld.BlockOverworldOre;
import org.icannt.netherendingores.common.block.overworld.OverworldOreTypeEnum;

import java.util.HashMap;

public class BlockRegistry {

    private static final HashMap<IOreType, Block> BLOCKS = new HashMap<>();

    public static void setup() {
        for (NetherOreTypeEnum ore : NetherOreTypeEnum.values()) {
            Block.Properties props = Block.Properties.create(Material.ROCK, MaterialColor.SAND)
                    .hardnessAndResistance(ore.getHardness(), ore.getResistance())
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(ore.getHarvestLevel());
            BlockNetherOre block = new BlockNetherOre(ore, props);
            BlockRegistry.add(ore, block);
        }

        for (EndOreTypeEnum ore : EndOreTypeEnum.values()) {
            Block.Properties props = Block.Properties.create(Material.ROCK, MaterialColor.SAND)
                    .hardnessAndResistance(ore.getHardness(), ore.getResistance())
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(ore.getHarvestLevel());
            BlockEndOre block = new BlockEndOre(ore, props);
            BlockRegistry.add(ore, block);
        }

        for (OverworldOreTypeEnum ore : OverworldOreTypeEnum.values()) {
            Block.Properties props = Block.Properties.create(Material.ROCK, MaterialColor.SAND)
                    .hardnessAndResistance(ore.getHardness(), ore.getResistance())
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(ore.getHarvestLevel());
            BlockOverworldOre block = new BlockOverworldOre(ore, props);
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
