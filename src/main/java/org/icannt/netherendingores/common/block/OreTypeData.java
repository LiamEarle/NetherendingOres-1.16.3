package org.icannt.netherendingores.common.block;

import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Items;
import net.minecraft.item.Rarity;

public enum OreTypeData implements IOreType {

    END_ALUMINUM_ORE ("end_aluminum_ore", "end", MaterialColor.SAND, 0, 1, 3F, 15F, Rarity.COMMON, "forge:ingots/aluminium", "", "thermalfoundation", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_AMBROSIUM_ORE ("end_ambrosium_ore", "end", MaterialColor.SAND, 6, 0, 3F, 15F, Rarity.COMMON, "forge:gems/ambrosium", "gem", "aether", new Object[] {Items.AIR, 0}, true, 1, 1, 0, 1, false, true, 2, true),
    END_ARDITE_ORE ("end_ardite_ore", "end", MaterialColor.SAND, 0, 4, 10F, 50F, Rarity.COMMON, "forge:ingots/ardite", "", "tconstruct", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, false, true, 1, true),
    END_ARKENIUM_ORE ("end_arkenium_ore", "end", MaterialColor.SAND, 0, 2, 3F, 15F, Rarity.COMMON, "forge:ingots/arkenium", "", "aether", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_CERTUS_QUARTZ_ORE ("end_certus_quartz_ore", "end", MaterialColor.SAND, 0, 0, 3F, 15F, Rarity.COMMON, "forge:gems/certus_quartz", "gem", "appliedenergistics2", new Object[] {Items.AIR, 0}, true, 1, 2, 2, 4, false, true, 2, true),
    END_CHARGED_CERTUS_QUARTZ_ORE ("end_charged_certus_quartz_ore", "end", MaterialColor.SAND, 0, 0, 3F, 15F, Rarity.COMMON, "forge:gems/charged_certus_quartz", "gem", "appliedenergistics2", new Object[] {Items.AIR, 0}, true, 1, 2, 2, 5, false, true, 2, true),
    END_COAL_ORE ("end_coal_ore", "end", MaterialColor.SAND, 0, 0, 3F, 15F, Rarity.COMMON, "forge:coals/coal", "coal", "minecraft", new Object[] {Items.AIR, 0}, true, 1, 1, 1, 2, true, true, 2, true),
    END_COBALT_ORE ("end_cobalt_ore", "end", MaterialColor.SAND, 0, 4, 10F, 50F, Rarity.COMMON, "forge:ingots/cobalt", "", "tconstruct", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 1, true),
    END_COPPER_ORE ("end_copper_ore", "end", MaterialColor.SAND, 0, 1, 3F, 15F, Rarity.COMMON, "forge:ingots/copper", "", "thermalfoundation", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_DIAMOND_ORE ("end_diamond_ore", "end", MaterialColor.SAND, 0, 2, 3F, 15F, Rarity.COMMON, "forge:gems/diamond", "gem", "minecraft", new Object[] {Items.AIR, 0}, true, 1, 1, 4, 7, true, true, 2, true),
    END_DILITHIUM_ORE ("end_dilithium_ore", "end", MaterialColor.SAND, 0, 2, 4F, 15F, Rarity.COMMON, "forge:gems/dilithium", "gem", "matteroverdrive", new Object[] {Items.AIR, 0}, true, 1, 1, 2, 5, false, true, 2, true),
    END_ELECTROTINE_ORE ("end_electrotine_ore", "end", MaterialColor.SAND, 0, 2, 3F, 15F, Rarity.COMMON, "forge:ingots/electrotine", "", "projectred-exploration", new Object[] {Items.AIR, 0}, false, 1, 8, 2, 5, true, true, 2, true),
    END_EMERALD_ORE ("end_emerald_ore", "end", MaterialColor.SAND, 0, 2, 3F, 15F, Rarity.COMMON, "forge:gems/emerald", "gem", "minecraft", new Object[] {Items.AIR, 0}, true, 1, 1, 3, 7, true, true, 2, true),
    END_GOLD_ORE ("end_gold_ore", "end", MaterialColor.SAND, 0, 2, 3F, 15F, Rarity.COMMON, "forge:ingots/gold", "", "minecraft", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_GRAVITITE_ORE ("end_gravitite_ore", "end", MaterialColor.SAND, 0, 2, 3F, 15F, Rarity.COMMON, "forge:ingots/gravitite", "", "aether", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_ICESTONE_ORE ("end_icestone_ore", "end", MaterialColor.SAND, 0, 1, 3F, 15F, Rarity.COMMON, "forge:gems/icestone", "gem", "aether", new Object[] {Items.AIR, 0}, true, 1, 1, 1, 1, false, true, 2, true),
    END_IRIDIUM_ORE ("end_iridium_ore", "end", MaterialColor.SAND, 4, 3, 3F, 15F, Rarity.UNCOMMON, "forge:ingots/iridium", "", "thermalfoundation", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_IRON_ORE ("end_iron_ore", "end", MaterialColor.SAND, 0, 1, 3F, 15F, Rarity.COMMON, "forge:ingots/iron", "", "minecraft", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_LAPIS_ORE ("end_lapis_ore", "end", MaterialColor.SAND, 0, 1, 3F, 15F, Rarity.COMMON, "forge:gems/lapis", "gem", "minecraft", new Object[] {Items.AIR, 0}, true, 4, 8, 2, 5, true, true, 2, true),
    END_LEAD_ORE ("end_lead_ore", "end", MaterialColor.SAND, 0, 2, 3F, 15F, Rarity.COMMON, "forge:ingots/lead", "", "thermalfoundation", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_MITHRIL_ORE ("end_mithril_ore", "end", MaterialColor.SAND, 8, 3, 3F, 15F, Rarity.RARE, "forge:ingots/mithril", "", "thermalfoundation", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_NICKEL_ORE ("end_nickel_ore", "end", MaterialColor.SAND, 0, 2, 3F, 15F, Rarity.COMMON, "forge:ingots/nickel", "", "thermalfoundation", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_OSMIUM_ORE ("end_osmium_ore", "end", MaterialColor.SAND, 0, 0, 3F, 15F, Rarity.COMMON, "forge:ingots/osmium", "", "mekanism", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_PERIDOT_ORE ("end_peridot_ore", "end", MaterialColor.SAND, 0, 2, 3F, 15F, Rarity.COMMON, "forge:gems/peridot", "gem", "projectred-exploration", new Object[] {Items.AIR, 0}, true, 1, 4, 2, 7, true, true, 2, true),
    END_PLATINUM_ORE ("end_platinum_ore", "end", MaterialColor.SAND, 4, 3, 3F, 15F, Rarity.UNCOMMON, "forge:ingots/platinum", "", "thermalfoundation", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_QUARTZ_ORE ("end_quartz_ore", "end", MaterialColor.SAND, 0, 0, 3F, 15F, Rarity.COMMON, "forge:gems/quartz", "gem", "minecraft", new Object[] {Items.AIR, 0}, false, 1, 1, 2, 5, true, true, 1, true),
    END_REDSTONE_ORE ("end_redstone_ore", "end", MaterialColor.SAND, 0, 1, 3F, 15F, Rarity.COMMON, "forge:dusts/redstone", "dust", "minecraft", new Object[] {Items.AIR, 0}, true, 4, 5, 1, 4, true, true, 2, true),
    END_RUBY_ORE ("end_ruby_ore", "end", MaterialColor.SAND, 0, 2, 3F, 15F, Rarity.COMMON, "forge:gems/ruby", "gem", "projectred-exploration", new Object[] {Items.AIR, 0}, true, 1, 4, 2, 7, true, true, 2, true),
    END_SAPPHIRE_ORE ("end_sapphire_ore", "end", MaterialColor.SAND, 0, 2, 3F, 15F, Rarity.COMMON, "forge:gems/sapphire", "gem", "projectred-exploration", new Object[] {Items.AIR, 0}, true, 1, 4, 2, 7, true, true, 2, true),
    END_SILVER_ORE ("end_silver_ore", "end", MaterialColor.SAND, 4, 2, 3F, 15F, Rarity.COMMON, "forge:ingots/silver", "", "thermalfoundation", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_TIN_ORE ("end_tin_ore", "end", MaterialColor.SAND, 0, 1, 3F, 15F, Rarity.COMMON, "forge:ingots/tin", "", "thermalfoundation", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_TRITANIUM_ORE ("end_tritanium_ore", "end", MaterialColor.SAND, 0, 2, 8F, 15F, Rarity.COMMON, "forge:ingots/tritanium", "", "matteroverdrive", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_URANIUM_ORE ("end_uranium_ore", "end", MaterialColor.SAND, 0, 2, 4F, 30F, Rarity.COMMON, "forge:ingots/uranium", "", "ic2", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, false, true, 2, true),
    END_YELLORITE_ORE ("end_yellorite_ore", "end", MaterialColor.SAND, 0, 0, 2F, 10F, Rarity.COMMON, "forge:ingots/yellorite", "", "bigreactors", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    END_ZANITE_ORE ("end_zanite_ore", "end", MaterialColor.SAND, 0, 1, 3F, 15F, Rarity.COMMON, "forge:gems/zanite", "gem", "aether", new Object[] {Items.AIR, 0}, true, 1, 1, 2, 4, false, true, 2, true),
    END_ZINC_ORE ("end_zinc_ore", "end", MaterialColor.SAND, 0, 1, 3F, 15F, Rarity.COMMON, "forge:ingots/zinc", "", "railcraft", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_ALUMINUM_ORE ("nether_aluminum_ore", "nether", MaterialColor.NETHERRACK, 0, 1, 3F, 15F, Rarity.COMMON, "forge:ingots/aluminium", "", "thermalfoundation", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_AMBROSIUM_ORE ("nether_ambrosium_ore", "nether", MaterialColor.NETHERRACK, 6, 0, 3F, 15F, Rarity.COMMON, "forge:gems/ambrosium", "gem", "aether", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 1, false, true, 2, true),
    NETHER_ARKENIUM_ORE ("nether_arkenium_ore", "nether", MaterialColor.NETHERRACK, 0, 2, 3F, 15F, Rarity.COMMON, "forge:ingots/arkenium", "", "aether", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_CERTUS_QUARTZ_ORE ("nether_certus_quartz_ore", "nether", MaterialColor.NETHERRACK, 0, 0, 3F, 15F, Rarity.COMMON, "forge:gems/certus_quartz", "gem", "appliedenergistics2", new Object[] {Items.AIR, 0}, false, 1, 2, 2, 4, false, true, 2, true),
    NETHER_CHARGED_CERTUS_QUARTZ_ORE ("nether_charged_certus_quartz_ore", "nether", MaterialColor.NETHERRACK, 0, 0, 3F, 15F, Rarity.COMMON, "forge:gems/charged_certus_quartz", "gem", "appliedenergistics2", new Object[] {Items.AIR, 0}, false, 1, 2, 2, 5, false, true, 2, true),
    NETHER_COAL_ORE ("nether_coal_ore", "nether", MaterialColor.NETHERRACK, 0, 0, 3F, 15F, Rarity.COMMON, "minecraft:coal", "coal", "minecraft", new Object[] {Items.AIR, 0}, false, 1, 1, 1, 2, true, true, 2, true),
    NETHER_COPPER_ORE ("nether_copper_ore", "nether", MaterialColor.NETHERRACK, 0, 1, 3F, 15F, Rarity.COMMON, "forge:ingots/copper", "", "thermalfoundation", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_DIAMOND_ORE ("nether_diamond_ore", "nether", MaterialColor.NETHERRACK, 0, 2, 3F, 15F, Rarity.COMMON, "forge:gems/diamond", "gem", "minecraft", new Object[] {Items.AIR, 0}, false, 1, 1, 4, 7, true, true, 2, true),
    NETHER_DILITHIUM_ORE ("nether_dilithium_ore", "nether", MaterialColor.NETHERRACK, 0, 2, 4F, 15F, Rarity.COMMON, "forge:gems/dilithium", "gem", "matteroverdrive", new Object[] {Items.AIR, 0}, false, 1, 1, 2, 5, false, true, 2, true),
    NETHER_ELECTROTINE_ORE ("nether_electrotine_ore", "nether", MaterialColor.NETHERRACK, 0, 2, 3F, 15F, Rarity.COMMON, "forge:ingots/electrotine", "", "projectred-exploration", new Object[] {Items.AIR, 0}, false, 1, 8, 2, 5, true, true, 2, true),
    NETHER_EMERALD_ORE ("nether_emerald_ore", "nether", MaterialColor.NETHERRACK, 0, 2, 3F, 15F, Rarity.COMMON, "forge:gems/emerald", "gem", "minecraft", new Object[] {Items.AIR, 0}, false, 1, 1, 3, 7, true, true, 2, true),
    NETHER_GOLD_ORE ("nether_gold_ore", "nether", MaterialColor.NETHERRACK, 0, 2, 3F, 15F, Rarity.COMMON, "forge:ingots/gold", "", "minecraft", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_GRAVITITE_ORE ("nether_gravitite_ore", "nether", MaterialColor.NETHERRACK, 0, 2, 3F, 15F, Rarity.COMMON, "forge:ingots/gravitite", "", "aether", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_ICESTONE_ORE ("nether_icestone_ore", "nether", MaterialColor.NETHERRACK, 0, 1, 3F, 15F, Rarity.COMMON, "forge:gems/icestone", "gem", "aether", new Object[] {Items.AIR, 0}, false, 1, 1, 1, 1, false, true, 2, true),
    NETHER_IRIDIUM_ORE ("nether_iridium_ore", "nether", MaterialColor.NETHERRACK, 4, 3, 3F, 15F, Rarity.UNCOMMON, "forge:ingots/iridium", "", "thermalfoundation", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_IRON_ORE ("nether_iron_ore", "nether", MaterialColor.NETHERRACK, 0, 1, 3F, 15F, Rarity.COMMON, "forge:ingots/iron", "", "minecraft", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_LAPIS_ORE ("nether_lapis_ore", "nether", MaterialColor.NETHERRACK, 0, 1, 3F, 15F, Rarity.COMMON, "forge:gems/lapis", "gem", "minecraft", new Object[] {Items.AIR, 0}, false, 4, 8, 2, 5, true, true, 2, true),
    NETHER_LEAD_ORE ("nether_lead_ore", "nether", MaterialColor.NETHERRACK, 0, 2, 3F, 15F, Rarity.COMMON, "forge:ingots/lead", "", "thermalfoundation", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_MITHRIL_ORE ("nether_mithril_ore", "nether", MaterialColor.NETHERRACK, 8, 3, 3F, 15F, Rarity.RARE, "forge:ingots/mithril", "", "thermalfoundation", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_NICKEL_ORE ("nether_nickel_ore", "nether", MaterialColor.NETHERRACK, 0, 2, 3F, 15F, Rarity.COMMON, "forge:ingots/nickel", "", "thermalfoundation", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_OSMIUM_ORE ("nether_osmium_ore", "nether", MaterialColor.NETHERRACK, 0, 0, 3F, 15F, Rarity.COMMON, "forge:ingots/osmium", "", "mekanism", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_PERIDOT_ORE ("nether_peridot_ore", "nether", MaterialColor.NETHERRACK, 0, 2, 3F, 15F, Rarity.COMMON, "forge:gems/peridot", "gem", "projectred-exploration", new Object[] {Items.AIR, 0}, false, 1, 4, 2, 7, true, true, 2, true),
    NETHER_PLATINUM_ORE ("nether_platinum_ore", "nether", MaterialColor.NETHERRACK, 4, 3, 3F, 15F, Rarity.UNCOMMON, "forge:ingots/platinum", "", "thermalfoundation", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_REDSTONE_ORE ("nether_redstone_ore", "nether", MaterialColor.NETHERRACK, 0, 1, 3F, 15F, Rarity.COMMON, "forge:dusts/redstone", "dust", "minecraft", new Object[] {Items.AIR, 0}, false, 4, 5, 1, 4, true, true, 2, true),
    NETHER_RUBY_ORE ("nether_ruby_ore", "nether", MaterialColor.NETHERRACK, 0, 2, 3F, 15F, Rarity.COMMON, "forge:gems/ruby", "gem", "projectred-exploration", new Object[] {Items.AIR, 0}, false, 1, 4, 2, 7, true, true, 2, true),
    NETHER_SAPPHIRE_ORE ("nether_sapphire_ore", "nether", MaterialColor.NETHERRACK, 0, 2, 3F, 15F, Rarity.COMMON, "forge:gems/sapphire", "gem", "projectred-exploration", new Object[] {Items.AIR, 0}, false, 1, 4, 2, 7, true, true, 2, true),
    NETHER_SILVER_ORE ("nether_silver_ore", "nether", MaterialColor.NETHERRACK, 4, 2, 3F, 15F, Rarity.COMMON, "forge:ingots/silver", "", "thermalfoundation", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_TIN_ORE ("nether_tin_ore", "nether", MaterialColor.NETHERRACK, 0, 1, 3F, 15F, Rarity.COMMON, "forge:ingots/tin", "", "thermalfoundation", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_TRITANIUM_ORE ("nether_tritanium_ore", "nether", MaterialColor.NETHERRACK, 0, 2, 8F, 15F, Rarity.COMMON, "forge:ingots/tritanium", "", "matteroverdrive", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_URANIUM_ORE ("nether_uranium_ore", "nether", MaterialColor.NETHERRACK, 0, 2, 4F, 30F, Rarity.COMMON, "forge:ingots/uranium", "", "ic2", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, false, true, 2, true),
    NETHER_YELLORITE_ORE ("nether_yellorite_ore", "nether", MaterialColor.NETHERRACK, 0, 0, 2F, 10F, Rarity.COMMON, "forge:ingots/yellorite", "", "bigreactors", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    NETHER_ZANITE_ORE ("nether_zanite_ore", "nether", MaterialColor.NETHERRACK, 0, 1, 3F, 15F, Rarity.COMMON, "forge:gems/zanite", "gem", "aether", new Object[] {Items.AIR, 0}, false, 1, 1, 2, 4, false, true, 2, true),
    NETHER_ZINC_ORE ("nether_zinc_ore", "nether", MaterialColor.NETHERRACK, 0, 1, 3F, 15F, Rarity.COMMON, "forge:ingots/zinc", "", "railcraft", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 2, true),
    OVERWORLD_AMBROSIUM_ORE ("overworld_ambrosium_ore", "overworld", MaterialColor.STONE, 6, 0, 3F, 15F, Rarity.COMMON, "forge:gems/ambrosium", "gem", "aether", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 1, false, true, 1, false),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", "overworld", MaterialColor.STONE, 0, 4, 10F, 50F, Rarity.COMMON, "forge:ingots/ardite", "", "tconstruct", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, false, true, 1, false),
    OVERWORLD_ARKENIUM_ORE ("overworld_arkenium_ore", "overworld", MaterialColor.STONE, 0, 2, 3F, 15F, Rarity.COMMON, "forge:ingots/arkenium", "", "aether", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 1, false),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", "overworld", MaterialColor.STONE, 0, 4, 10F, 50F, Rarity.COMMON, "forge:ingots/cobalt", "", "tconstruct", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 1, false),
    OVERWORLD_GRAVITITE_ORE ("overworld_gravitite_ore", "overworld", MaterialColor.STONE, 0, 2, 3F, 15F, Rarity.COMMON, "forge:ingots/gravitite", "", "aether", new Object[] {Items.AIR, 0}, false, 1, 1, 0, 0, true, true, 1, false),
    OVERWORLD_ICESTONE_ORE ("overworld_icestone_ore", "overworld", MaterialColor.STONE, 0, 1, 3F, 15F, Rarity.COMMON, "forge:gems/icestone", "gem", "aether", new Object[] {Items.AIR, 0}, false, 1, 1, 1, 1, false, true, 1, false),
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", "overworld", MaterialColor.STONE, 0, 0, 3F, 15F, Rarity.COMMON, "forge:gems/quartz", "gem", "minecraft", new Object[] {Items.AIR, 0}, false, 1, 1, 2, 5, true, true, 1, false),
    OVERWORLD_ZANITE_ORE ("overworld_zanite_ore", "overworld", MaterialColor.STONE, 0, 1, 3F, 15F, Rarity.COMMON, "forge:gems/zanite", "gem", "aether", new Object[] {Items.AIR, 0}, false, 1, 1, 2, 4, false, true, 1, false);

	
    private final String name;
    private final String namePrefix;
    private final MaterialColor materialColor;
    
    private final int lightLevel;
    private final int harvestLevel;
    private final float hardness;
    private final float resistance;
    private final Rarity rarity;

    private final String outputTag;
    private final String something;
    private final String preferredMod;
    
    private final Object[] dropItemObject;
    private final boolean dropItems;
    private final int dropItemsQuantityMin;
    private final int dropItemsQuantityMax;
    private final int dropItemsExperienceMin;
    private final int dropItemsExperienceMax;
    
    private final boolean furnaceRecipeEnabled;
    private final boolean furnaceRecipeToItem;
    private final int recipeMultiplier;
    private final boolean oreExplosionEnabled;
    

    OreTypeData(final String name, final String namePrefix, final MaterialColor materialColor,
    		int lightLevel, int harvestLevel, float hardness, float resistance, Rarity rarity,
    	    String outputTag, String something, String preferredMod,
    		Object[] dropItemObject, boolean dropItems, int dropItemsQuantityMin, int dropItemsQuantityMax, int dropItemsExperienceMin, int dropItemsExperienceMax,
    		boolean furnaceRecipeEnabled, boolean furnaceRecipeToItem, int recipeMultiplier, boolean oreExplosionEnabled) {

        this.name = name;
        this.namePrefix = namePrefix;
        this.materialColor = materialColor;
        
        this.lightLevel = lightLevel;
        this.harvestLevel = harvestLevel;
        this.hardness = hardness;
        this.resistance = resistance;
        this.rarity = rarity;

		this.outputTag = outputTag;
		this.something = something;
		this.preferredMod = preferredMod;
		
		this.dropItemObject = dropItemObject;
		this.dropItems =  dropItems;
		this.dropItemsQuantityMin = dropItemsQuantityMin;
		this.dropItemsQuantityMax = dropItemsQuantityMax;
		this.dropItemsExperienceMin = dropItemsExperienceMin;
		this.dropItemsExperienceMax = dropItemsExperienceMax;
		
		this.furnaceRecipeEnabled = furnaceRecipeEnabled;
		this.furnaceRecipeToItem = furnaceRecipeToItem;
		this.recipeMultiplier = recipeMultiplier;
		this.oreExplosionEnabled = oreExplosionEnabled;       
        
    }

    @Override
    public String getName() {
        return this.name;
    }

    
    public MaterialColor getMaterialColor() {
    	return this.materialColor;
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

    @Override
    public Rarity getRarity() {
        return this.rarity;
    }

    @Override
    public String getOutputTag() {
        return this.outputTag;
    }

    @Override
    public int getDropsMinimum() {
        return this.dropItemsQuantityMin;
    }

    @Override
    public int getDropsMaximum() {
        return this.dropItemsExperienceMax;
    }

    @Override
    public int getExperienceMinimum() {
        return this.dropItemsExperienceMin;
    }

    @Override
    public int getExperienceMaximum() {
        return this.dropItemsExperienceMax;
    }

    @Override
    public int getMultiplier() {
        return this.recipeMultiplier;
    }

    @Override
    public boolean getFurnaceRecipeEnabled() {
        return this.furnaceRecipeEnabled;
    }
}
