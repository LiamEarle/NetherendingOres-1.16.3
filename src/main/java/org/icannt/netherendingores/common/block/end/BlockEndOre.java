package org.icannt.netherendingores.common.block.end;

import net.minecraft.block.Block;
import org.icannt.netherendingores.common.block.BlockBase;

public class BlockEndOre extends BlockBase {
    public BlockEndOre(EndOreTypeEnum type, Block.Properties props) {
        super("end_" + type.getName(), type, props);
    }
}
