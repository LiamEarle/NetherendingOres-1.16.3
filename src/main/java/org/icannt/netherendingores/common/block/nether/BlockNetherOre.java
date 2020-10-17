package org.icannt.netherendingores.common.block.nether;

import net.minecraft.block.Block;
import org.icannt.netherendingores.common.block.BlockBase;

public class BlockNetherOre extends BlockBase {
    public BlockNetherOre(NetherOreTypeEnum type, Block.Properties props) {
        super("nether_" + type.getName(), type, props);
    }
}
