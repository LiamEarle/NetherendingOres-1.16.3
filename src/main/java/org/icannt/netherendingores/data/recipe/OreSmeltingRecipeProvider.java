package org.icannt.netherendingores.data.recipe;

import com.google.gson.JsonObject;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.common.crafting.conditions.TagEmptyCondition;
import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.common.block.BlockOre;
import org.icannt.netherendingores.common.block.IOreType;
import org.icannt.netherendingores.common.block.OreTypeData;
import org.icannt.netherendingores.registry.block.BlockRegistry;

import javax.annotation.Nullable;
import java.util.function.Consumer;

public class OreSmeltingRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public OreSmeltingRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        for (IOreType type : OreTypeData.values()) {
            if (!type.getFurnaceRecipeEnabled())
                continue;

            BlockOre block = BlockRegistry.getOreOfType(type);
            ConditionalRecipe.builder()
                    .addCondition(not(new TagEmptyCondition(type.getOutputTag())))
                    .addRecipe(new FinishedRecipe(
                            new ResourceLocation(NetherendingOres.MOD_ID, type.getName()),
                            Ingredient.fromItems(block.asItem()),
                            ItemTags.makeWrapperTag(type.getOutputTag()),
                            type.getMultiplier(),
                            0.1f,
                            200
                    ))
                    .build(consumer, new ResourceLocation(NetherendingOres.MOD_ID, type.getName() + "_smelting"));
        }
    }

    public static class FinishedRecipe implements IFinishedRecipe {

        private final ResourceLocation id;
        private final Ingredient input;
        private final ITag.INamedTag<Item> result;
        private final int multiplier;
        private final float experience;
        private final int cookTime;

        public FinishedRecipe(ResourceLocation id, Ingredient input, ITag.INamedTag<Item> result, int multiplier, float experience, int cookTime) {
            this.id = id;
            this.input = input;
            this.result = result;
            this.multiplier = multiplier;
            this.experience = experience;
            this.cookTime = cookTime;
        }

        @Override
        public void serialize(JsonObject json) {
            json.add("input", this.input.serialize());
            json.addProperty("tag", this.result.getName().toString());
            json.addProperty("multiplier", this.multiplier);
            json.addProperty("experience", this.experience);
            json.addProperty("cookTime", this.cookTime);
        }

        @Override
        public ResourceLocation getID() {
            return this.id;
        }

        @Override
        public IRecipeSerializer<?> getSerializer() {
            return OreSmeltingRecipe.SERIALIZER;
        }

        @Nullable
        @Override
        public JsonObject getAdvancementJson() {
            return null;
        }

        @Nullable
        @Override
        public ResourceLocation getAdvancementID() {
            return null;
        }
    }
}
