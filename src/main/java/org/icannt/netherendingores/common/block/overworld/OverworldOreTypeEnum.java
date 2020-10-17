package org.icannt.netherendingores.common.block.overworld;

import org.icannt.netherendingores.common.block.IOreType;

public enum OverworldOreTypeEnum implements IOreType {

    AMBROSIUM("ambrosium_ore", 3, 15, 6, 0),
    ARDITE("ardite_ore", 10, 50, 0, 4),
    ARKENIUM("arkenium_ore", 3, 15, 0, 2),
    COBALT("cobalt_ore", 10, 50, 0, 4),
    GRAVITITE("gravitite_ore", 3, 15, 0, 2),
    ICESTONE("icestone_ore", 3, 15, 0, 1),
    QUARTZ("quartz_ore", 3, 15, 0, 0),
    ZANITE("zanite_ore", 3, 15, 0, 1);

    private final String name;
    private final float hardness;
    private final float resistance;
    private final int lightLevel;
    private final int harvestLevel;

    OverworldOreTypeEnum(String name, float hardness, float resistance, int lightLevel, int harvestLevel) {
        this.name = name;
        this.hardness = hardness;
        this.resistance = resistance;
        this.lightLevel = lightLevel;
        this.harvestLevel = harvestLevel;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getHardness() {
        return this.hardness;
    }

    @Override
    public float getResistance() {
        return this.resistance;
    }

    @Override
    public int getLightLevel() {
        return this.lightLevel;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }
}
