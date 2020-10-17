package org.icannt.netherendingores.common.block.nether;

import org.icannt.netherendingores.common.block.IOreType;

public enum NetherOreTypeEnum implements IOreType {

    ALUMINUM("aluminum_ore", 3, 15, 0, 1),
    AMBROSIUM("ambrosium_ore", 3, 15, 6, 0),
    ARKENIUM("arkenium_ore", 3, 15, 0, 2),
    CERTUS_QUARTZ("certus_quartz_ore", 3, 15, 0, 0),
    CHARGED_CERTUS_QUARTZ("charged_certus_quartz_ore", 3, 15, 0, 0),
    COAL("coal_ore", 3, 15, 0, 0),
    COPPER("copper_ore", 3, 15, 0, 1),
    DIAMOND("diamond_ore", 3, 15, 0, 2),
    DILITHIUM("dilithium_ore", 4, 15,0, 2),
    ELECTROTINE("electrotine_ore", 3, 15, 0, 2),
    EMERALD("emerald_ore", 3, 15, 0, 2),
    GOLD("gold_ore", 3, 15, 0, 2),
    GRAVITITE("gravitite_ore", 3, 15, 0, 2),
    ICESTONE("icestone_ore", 3, 15, 0, 1),
    IRIDIUM("iridium_ore", 3, 15, 4, 3),
    IRON("iron_ore", 3, 15, 0, 1),
    LAPIS("lapis_ore", 3, 15, 0, 1),
    LEAD("lead_ore", 3, 15, 0, 2),
    MITHRIL("mithril_ore", 3, 15, 8, 3),
    NICKEL("nickel_ore", 3, 15, 0, 2),
    OSMIUM("osmium_ore", 3, 15, 0, 0),
    PERIDOT("peridot_ore", 3, 15, 0, 2),
    PLATINUM("platinum_ore", 3, 15, 4, 3),
    REDSTONE("redstone_ore", 3, 15, 0, 1),
    RUBY("ruby_ore", 3, 15, 0, 2),
    SAPPHIRE("sapphire_ore", 3, 15, 0, 2),
    SILVER("silver_ore", 3, 15, 4, 2),
    TIN("tin_ore", 3, 15, 0, 1),
    TRITANIUM("tritanium_ore", 8, 15, 0, 2),
    URANIUM("uranium_ore", 4, 30, 0, 2),
    YELLORITE("yellorite_ore", 2, 10, 0, 0),
    ZANITE("zanite_ore", 3, 15, 0, 1),
    ZINC("zinc_ore", 3, 15, 0, 1);




    private final String name;
    private final float hardness;
    private final float resistance;
    private final int lightLevel;
    private final int harvestLevel;

    NetherOreTypeEnum(String name, float hardness, float resistance, int lightLevel, int harvestLevel) {
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
