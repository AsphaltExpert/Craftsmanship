package com.exoae.cms.datagen;

import com.exoae.cms.CMS;
import com.exoae.cms.init.BlockInit;
import com.exoae.cms.init.ItemInit;
import net.minecraft.client.Minecraft;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> TESSAT_SMELTABLES = List.of(ItemInit.RAW_TESSAT.get(),
            BlockInit.TESSAT_ORE.get(), BlockInit.DEEPSLATE_TESSAT_ORE.get());

    private static final List<ItemLike> RAW_TESSAT_BLOCK = List.of(BlockInit.RAW_TESSAT_BLOCK.get());
    private static final List<ItemLike> RAW_COPPER_BLOCK = List.of(Blocks.RAW_COPPER_BLOCK);
    private static final List<ItemLike> RAW_IRON_BLOCK = List.of(Blocks.RAW_IRON_BLOCK);
    private static final List<ItemLike> RAW_GOLD_BLOCK = List.of(Blocks.RAW_GOLD_BLOCK);

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        //SMELTING
        //   ||
        //   \/
        //TESSAT :TO: INGOT
        oreSmelting(pWriter, TESSAT_SMELTABLES, RecipeCategory.MISC, ItemInit.TESSAT_INGOT.get(), 0.2f, 200, "tessat");

        oreBlasting(pWriter, TESSAT_SMELTABLES, RecipeCategory.MISC, ItemInit.TESSAT_INGOT.get(), 0.2f, 100, "tessat");

        //RAW ORE BLOCK :TO: BLOCK
        oreSmelting(pWriter, RAW_TESSAT_BLOCK, RecipeCategory.MISC, BlockInit.TESSAT_BLOCK.get(),1.8f, 500, "roblock_block");
        oreSmelting(pWriter, RAW_COPPER_BLOCK, RecipeCategory.MISC, Blocks.COPPER_BLOCK,1.8f, 500, "roblock_block");
        oreSmelting(pWriter, RAW_IRON_BLOCK, RecipeCategory.MISC, Blocks.IRON_BLOCK,1.8f, 500, "roblock_block");
        oreSmelting(pWriter, RAW_GOLD_BLOCK, RecipeCategory.MISC, Blocks.GOLD_BLOCK,1.8f, 500, "roblock_block");

        oreBlasting(pWriter, RAW_TESSAT_BLOCK, RecipeCategory.MISC, BlockInit.TESSAT_BLOCK.get(),1.8f, 1000, "roblock_block");
        oreBlasting(pWriter, RAW_COPPER_BLOCK, RecipeCategory.MISC, Blocks.COPPER_BLOCK,1.8f, 1000, "roblock_block");
        oreBlasting(pWriter, RAW_IRON_BLOCK, RecipeCategory.MISC, Blocks.IRON_BLOCK,1.8f, 1000, "roblock_block");
        oreBlasting(pWriter, RAW_GOLD_BLOCK, RecipeCategory.MISC, Blocks.GOLD_BLOCK,1.8f, 1000, "roblock_block");

        //   /\
        //   ||
        //SMELTING

        //SHAPED-CRAFTING
        //   ||
        //   \/
        //
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.TESSAT_BLOCK.get())
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")

                .define('T', ItemInit.TESSAT_INGOT.get())
                //.unlockedBy(getHasName(ItemInit.TESSAT_INGOT.get()), has(ItemInit.TESSAT_INGOT.get()))
                .save(pWriter);
        //   /\
        //   ||
        //SHAPED-CRAFTING

        //SHAPELESS-CRAFTING
        //   ||
        //   \/
        //TESSAT
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.TESSAT_INGOT.get(), 9)
                .requires(BlockInit.TESSAT_BLOCK.get())
                //.unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(BlockInit.TESSAT_BLOCK.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.TESSAT_NUGGET.get(), 9)
                .requires(ItemInit.TESSAT_INGOT.get())
                //.unlockedBy(getHasName(ItemInit.TESSAT_INGOT.get()), has(ItemInit.TESSAT_INGOT.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.TESSAT_INGOT.get(), 9)
                .requires(BlockInit.TESSAT_BLOCK.get())
                //.unlockedBy(getHasName(BlockInit.TESSAT_BLOCK.get()), has(BlockInit.TESSAT_BLOCK.get()))
                .save(pWriter);

        //   /\
        //   ||
        //SHAPELESS-CRAFTING
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  CMS.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
