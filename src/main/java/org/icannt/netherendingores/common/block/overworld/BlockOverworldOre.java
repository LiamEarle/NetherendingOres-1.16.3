package org.icannt.netherendingores.common.block.overworld;

import net.minecraft.block.Block;
import org.icannt.netherendingores.common.block.BlockBase;

public class BlockOverworldOre extends BlockBase {
    public BlockOverworldOre(OverworldOreTypeEnum type, Block.Properties props) {
        super("overworld_" + type.getName(), type, props);
    }
}
