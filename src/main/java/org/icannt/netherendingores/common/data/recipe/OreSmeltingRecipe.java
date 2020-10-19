package org.icannt.netherendingores.common.data.recipe;

import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.common.block.BlockOre;
import org.icannt.netherendingores.common.block.IOreType;
import org.icannt.netherendingores.common.block.OreTypeData;
import org.icannt.netherendingores.registry.block.BlockRegistry;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Consumer;

public class OreSmeltingRecipe extends RecipeProvider implements IConditionBuilder {

    public OreSmeltingRecipe(DataGenerator generator) {
        super(generator);
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        super.registerRecipes(consumer);

        for (IOreType ore : OreTypeData.values()) {
            BlockOre block = BlockRegistry.getOreOfType(ore);
            CookingRecipeBuilder.smeltingRecipe(
                    Ingredient.fromItems(block.asItem()),
                    Items.DIAMOND,
                    0f,
                    200
            )
            .addCriterion("has_item", hasItem(block.asItem()))
            .build(consumer, NetherendingOres.MOD_ID + ":" + "smelting/" + ore.getName());
        }
    }
}
