package org.icannt.netherendingores.common.block;

import net.minecraft.block.Block;

public class BlockOre extends BlockBase {
    public BlockOre(OreTypeData type, Block.Properties props) {
        super(type.getName(), type, props);
    }
}
