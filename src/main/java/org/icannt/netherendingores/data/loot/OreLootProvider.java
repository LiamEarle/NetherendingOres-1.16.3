package org.icannt.netherendingores.data.loot;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;
import net.minecraft.data.LootTableProvider;
import net.minecraft.loot.*;
import org.icannt.netherendingores.common.block.IOreType;
import org.icannt.netherendingores.common.block.OreTypeData;
import org.icannt.netherendingores.registry.block.BlockRegistry;

import java.io.IOException;
import java.nio.file.Path;

public class OreLootProvider extends LootTableProvider {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private final DataGenerator generator;

    public OreLootProvider(DataGenerator generator) {
        super(generator);
        this.generator = generator;
    }

    @Override
    public void act(DirectoryCache cache) {
        Path outFolder = this.generator.getOutputFolder();

        for (IOreType type : OreTypeData.values()) {
            Block block = BlockRegistry.getOreOfType(type);
            LootEntry.Builder<?> entry = ItemLootEntry.builder(block);
            LootPool.Builder pool = LootPool.builder().name("main").rolls(RandomValueRange.of(type.getDropsMinimum(), type.getDropsMaximum())).addEntry(entry);
            LootTable.Builder builder = LootTable.builder().addLootPool(pool);

            Path out = outFolder.resolve("data/" + block.getRegistryName().getNamespace() + "/loot_tables/blocks/" + block.getRegistryName().getPath() + ".json");

            try {
                IDataProvider.save(GSON, cache, LootTableManager.toJson(builder.setParameterSet(LootParameterSets.BLOCK).build()), out);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
