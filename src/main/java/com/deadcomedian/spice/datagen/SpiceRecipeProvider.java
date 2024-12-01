package com.deadcomedian.spice.datagen;

import com.deadcomedian.spice.Spice;
import com.deadcomedian.spice.registries.SpiceBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class SpiceRecipeProvider extends FabricRecipeProvider {
    public SpiceRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        List<ItemConvertible> RED_NETHER_SMELTABLES = List.of(Blocks.RED_NETHER_BRICKS);
        List<ItemConvertible> WARPED_NETHER_SMELTABLES = List.of(SpiceBlocks.WARPED_NETHER_BRICKS);

        offerSmelting(recipeExporter, RED_NETHER_SMELTABLES, RecipeCategory.MISC, SpiceBlocks.CRACKED_RED_NETHER_BRICKS, 0.25f, 200, "pink_garnet");
        offerSmelting(recipeExporter, WARPED_NETHER_SMELTABLES, RecipeCategory.MISC, SpiceBlocks.CRACKED_WARPED_NETHER_BRICKS, 0.25f, 200, "pink_garnet");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, SpiceBlocks.CHISELED_RED_NETHER_BRICKS)
                .pattern(" R ")
                .pattern(" R ")
                .pattern("   ")
                .input('R', Blocks.RED_NETHER_BRICK_SLAB)
                .criterion(hasItem(Blocks.RED_NETHER_BRICK_SLAB), conditionsFromItem(Blocks.RED_NETHER_BRICK_SLAB))
                .offerTo(recipeExporter);


    }
}
