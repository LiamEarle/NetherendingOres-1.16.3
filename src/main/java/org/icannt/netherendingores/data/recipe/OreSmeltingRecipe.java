package org.icannt.netherendingores.data.recipe;

import com.google.gson.JsonObject;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.AbstractCookingRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistryEntry;

import javax.annotation.Nullable;

public class OreSmeltingRecipe extends AbstractCookingRecipe {

    public static Serializer SERIALIZER = new Serializer();

    private final ResourceLocation id;
    private final Ingredient input;
    private final ITag.INamedTag<Item> result;
    private final int multiplier;
    private final float experience;
    private final int cookTime;

    public OreSmeltingRecipe(ResourceLocation id, Ingredient input, ITag.INamedTag<Item> result, int multiplier, float experience, int cookTime) {
        // Pass in ItemStack.EMPTY here as output to conform with AbstractCookingRecipe. Hacky?
        super(IRecipeType.SMELTING, id, "", input, ItemStack.EMPTY, experience, cookTime);
        this.id = id;
        this.input = input;
        this.result = result;
        this.multiplier = multiplier;
        this.experience = experience;
        this.cookTime = cookTime;
    }

    @Override
    public ItemStack getCraftingResult(IInventory inv) {
        return new ItemStack(this.result.getAllElements().get(0), this.multiplier);
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        return NonNullList.from(this.input);
    }

    public float getExperience() {
        return this.experience;
    }

    @Override
    public ItemStack getRecipeOutput() {
        return new ItemStack(this.result.getAllElements().get(0), this.multiplier);
    }

    @Override
    public IRecipeSerializer<?> getSerializer() {
        return OreSmeltingRecipe.SERIALIZER;
    }

    @Override
    public IRecipeType<?> getType() {
        return IRecipeType.SMELTING;
    }

    public static class Serializer extends ForgeRegistryEntry<IRecipeSerializer<?>> implements IRecipeSerializer<OreSmeltingRecipe> {

        @Override
        public OreSmeltingRecipe read(ResourceLocation recipeId, JsonObject json) {
            Ingredient input = Ingredient.deserialize(JSONUtils.getJsonObject(json, "input"));
            ITag.INamedTag<Item> output = ItemTags.makeWrapperTag(JSONUtils.getString(json, "tag"));
            int multiplier = JSONUtils.getInt(json, "multiplier");
            float experience = JSONUtils.getFloat(json, "experience");
            int cookTime = JSONUtils.getInt(json, "cookTime");

            return new OreSmeltingRecipe(recipeId, input, output, multiplier, experience, cookTime);

        }

        @Nullable
        @Override
        public OreSmeltingRecipe read(ResourceLocation recipeId, PacketBuffer buffer) {
            Ingredient input = Ingredient.read(buffer);
            ITag.INamedTag<Item> output = ItemTags.makeWrapperTag(buffer.readString());
            int multiplier = buffer.readVarInt();
            float experience = buffer.readFloat();
            int cookTime = buffer.readVarInt();

            return new OreSmeltingRecipe(recipeId, input, output, multiplier, experience, cookTime);
        }

        @Override
        public void write(PacketBuffer buffer, OreSmeltingRecipe recipe) {
            recipe.input.write(buffer);
            buffer.writeString(recipe.result.toString());
            buffer.writeVarInt(recipe.multiplier);
            buffer.writeFloat(recipe.experience);
            buffer.writeVarInt(recipe.cookTime);
        }
    }
}
