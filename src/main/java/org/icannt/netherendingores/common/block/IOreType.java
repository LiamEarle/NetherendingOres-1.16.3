package org.icannt.netherendingores.common.block;

import net.minecraft.item.Rarity;

public interface IOreType {

    String getName();
    float getHardness();
    float getResistance();
    int getLightLevel();
    int getHarvestLevel();
    Rarity getRarity();
    String getOutputTag();
    int getDropsMinimum();
    int getDropsMaximum();
    int getExperienceMinimum();
    int getExperienceMaximum();
    int getMultiplier();
    boolean getFurnaceRecipeEnabled();

}
