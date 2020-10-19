package org.icannt.netherendingores.registry.data.tag;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.common.block.IOreType;
import org.icannt.netherendingores.common.block.OreTypeData;
import org.icannt.netherendingores.registry.block.BlockRegistry;

public class NetherendingOresTags {

    public static class Blocks extends BlockTagsProvider {

        public Blocks(DataGenerator generator, ExistingFileHelper helper) {
            super(generator, NetherendingOres.MOD_ID, helper);
        }

        @Override
        protected void registerTags() {
            super.registerTags();
            // Register Ore Tags
            for (IOreType type : OreTypeData.values()) {
            	getOrCreateBuilder(BlockTags.makeWrapperTag(new ResourceLocation(NetherendingOres.MOD_ID, type.getName()).toString()))
                        .add(BlockRegistry.getOreOfType(type));
            }
        }

    }
    }
