package net.exoae.cms.datagen;

import net.exoae.cms.CMS;
import net.exoae.cms.init.BlockInit;
import net.exoae.cms.init.ItemInit;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
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
        {
        //TESSAT :TO: INGOT
            {
                oreSmelting(pWriter, TESSAT_SMELTABLES, RecipeCategory.MISC, ItemInit.TESSAT_INGOT.get(), 0.2f, 200, "tessat");

                oreBlasting(pWriter, TESSAT_SMELTABLES, RecipeCategory.MISC, ItemInit.TESSAT_INGOT.get(), 0.2f, 100, "tessat");
            }
        //RAW ORE BLOCK :TO: BLOCK
            {
                oreSmelting(pWriter, RAW_TESSAT_BLOCK, RecipeCategory.MISC, BlockInit.TESSAT_BLOCK.get(), 1.8f, 1000, "roblock_block");
                oreSmelting(pWriter, RAW_COPPER_BLOCK, RecipeCategory.MISC, Blocks.COPPER_BLOCK, 1.8f, 1000, "roblock_block");
                oreSmelting(pWriter, RAW_IRON_BLOCK, RecipeCategory.MISC, Blocks.IRON_BLOCK, 1.8f, 1000, "roblock_block");
                oreSmelting(pWriter, RAW_GOLD_BLOCK, RecipeCategory.MISC, Blocks.GOLD_BLOCK, 1.8f, 1000, "roblock_block");

                oreBlasting(pWriter, RAW_TESSAT_BLOCK, RecipeCategory.MISC, BlockInit.TESSAT_BLOCK.get(), 1.8f, 500, "roblock_block");
                oreBlasting(pWriter, RAW_COPPER_BLOCK, RecipeCategory.MISC, Blocks.COPPER_BLOCK, 1.8f, 500, "roblock_block");
                oreBlasting(pWriter, RAW_IRON_BLOCK, RecipeCategory.MISC, Blocks.IRON_BLOCK, 1.8f, 500, "roblock_block");
                oreBlasting(pWriter, RAW_GOLD_BLOCK, RecipeCategory.MISC, Blocks.GOLD_BLOCK, 1.8f, 500, "roblock_block");
            }
        }
        //   /\
        //   ||
        //SMELTING

        //SHAPED-CRAFTING
        //   ||
        //   \/
        {
        //TESSATBLOCK
        {
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.TESSAT_BLOCK.get())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', ItemInit.TESSAT_INGOT.get())
                .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.TESSAT_BRICKS.get())
                .pattern("NN")
                .pattern("NN")
                .define('N', ItemInit.TESSAT_NUGGET.get())
                .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                .save(pWriter);
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.RAW_TESSAT_BLOCK.get())
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', ItemInit.RAW_TESSAT.get())
                .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                .save(pWriter);
            }
        //CRATES
        {
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.OAK_CRATE.get(), 8)
                    .pattern("PPP")
                    .pattern("PFP")
                    .pattern("PPP")
                    .define('P', Blocks.OAK_PLANKS)
                    .define('F', ItemInit.TESSAT_FRAME.get())
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.SPRUCE_CRATE.get(), 8)
                    .pattern("PPP")
                    .pattern("PFP")
                    .pattern("PPP")
                    .define('P', Blocks.SPRUCE_PLANKS)
                    .define('F', ItemInit.TESSAT_FRAME.get())
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.BIRCH_CRATE.get(), 8)
                    .pattern("PPP")
                    .pattern("PFP")
                    .pattern("PPP")
                    .define('P', Blocks.BIRCH_PLANKS)
                    .define('F', ItemInit.TESSAT_FRAME.get())
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.JUNGLE_CRATE.get(), 8)
                    .pattern("PPP")
                    .pattern("PFP")
                    .pattern("PPP")
                    .define('P', Blocks.JUNGLE_PLANKS)
                    .define('F', ItemInit.TESSAT_FRAME.get())
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.ACACIA_CRATE.get(), 8)
                    .pattern("PPP")
                    .pattern("PFP")
                    .pattern("PPP")
                    .define('P', Blocks.ACACIA_PLANKS)
                    .define('F', ItemInit.TESSAT_FRAME.get())
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.DARK_OAK_CRATE.get(), 8)
                    .pattern("PPP")
                    .pattern("PFP")
                    .pattern("PPP")
                    .define('P', Blocks.DARK_OAK_PLANKS)
                    .define('F', ItemInit.TESSAT_FRAME.get())
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.MANGROVE_CRATE.get(), 8)
                    .pattern("PPP")
                    .pattern("PFP")
                    .pattern("PPP")
                    .define('P', Blocks.MANGROVE_PLANKS)
                    .define('F', ItemInit.TESSAT_FRAME.get())
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.CHERRY_CRATE.get(), 8)
                    .pattern("PPP")
                    .pattern("PFP")
                    .pattern("PPP")
                    .define('P', Blocks.CHERRY_PLANKS)
                    .define('F', ItemInit.TESSAT_FRAME.get())
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.BAMBOO_CRATE.get(), 8)
                    .pattern("PPP")
                    .pattern("PFP")
                    .pattern("PPP")
                    .define('P', Blocks.BAMBOO_PLANKS)
                    .define('F', ItemInit.TESSAT_FRAME.get())
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.CRIMSON_CRATE.get(), 8)
                    .pattern("PPP")
                    .pattern("PFP")
                    .pattern("PPP")
                    .define('P', Blocks.CRIMSON_PLANKS)
                    .define('F', ItemInit.TESSAT_FRAME.get())
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.WARPED_CRATE.get(), 8)
                    .pattern("PPP")
                    .pattern("PFP")
                    .pattern("PPP")
                    .define('P', Blocks.WARPED_PLANKS)
                    .define('F', ItemInit.TESSAT_FRAME.get())
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.PALE_CRATE.get(), 8)
                    .pattern("PPP")
                    .pattern("PFP")
                    .pattern("PPP")
                    .define('P', BlockInit.PALE_PLANKS.get())
                    .define('F', ItemInit.TESSAT_FRAME.get())
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);
        }
        //COLORED PLANKS
        {
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.WHITE_PLANKS.get(), 8)
                    .pattern("PPP")
                    .pattern("PDP")
                    .pattern("PPP")
                    .define('P', BlockInit.PALE_PLANKS.get())
                    .define('D', Items.WHITE_DYE)
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.LIGHT_GRAY_PLANKS.get(), 8)
                    .pattern("PPP")
                    .pattern("PDP")
                    .pattern("PPP")
                    .define('P', BlockInit.PALE_PLANKS.get())
                    .define('D', Items.LIGHT_GRAY_DYE)
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.GRAY_PLANKS.get(), 8)
                    .pattern("PPP")
                    .pattern("PDP")
                    .pattern("PPP")
                    .define('P', BlockInit.PALE_PLANKS.get())
                    .define('D', Items.GRAY_DYE)
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.BLACK_PLANKS.get(), 8)
                    .pattern("PPP")
                    .pattern("PDP")
                    .pattern("PPP")
                    .define('P', BlockInit.PALE_PLANKS.get())
                    .define('D', Items.BLACK_DYE)
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.BROWN_PLANKS.get(), 8)
                    .pattern("PPP")
                    .pattern("PDP")
                    .pattern("PPP")
                    .define('P', BlockInit.PALE_PLANKS.get())
                    .define('D', Items.BROWN_DYE)
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.RED_PLANKS.get(), 8)
                    .pattern("PPP")
                    .pattern("PDP")
                    .pattern("PPP")
                    .define('P', BlockInit.PALE_PLANKS.get())
                    .define('D', Items.RED_DYE)
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.ORANGE_PLANKS.get(), 8)
                    .pattern("PPP")
                    .pattern("PDP")
                    .pattern("PPP")
                    .define('P', BlockInit.PALE_PLANKS.get())
                    .define('D', Items.ORANGE_DYE)
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.YELLOW_PLANKS.get(), 8)
                    .pattern("PPP")
                    .pattern("PDP")
                    .pattern("PPP")
                    .define('P', BlockInit.PALE_PLANKS.get())
                    .define('D', Items.YELLOW_DYE)
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.LIME_PLANKS.get(), 8)
                    .pattern("PPP")
                    .pattern("PDP")
                    .pattern("PPP")
                    .define('P', BlockInit.PALE_PLANKS.get())
                    .define('D', Items.LIME_DYE)
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.GREEN_PLANKS.get(), 8)
                    .pattern("PPP")
                    .pattern("PDP")
                    .pattern("PPP")
                    .define('P', BlockInit.PALE_PLANKS.get())
                    .define('D', Items.GREEN_DYE)
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.CYAN_PLANKS.get(), 8)
                    .pattern("PPP")
                    .pattern("PDP")
                    .pattern("PPP")
                    .define('P', BlockInit.PALE_PLANKS.get())
                    .define('D', Items.CYAN_DYE)
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.LIGHT_BLUE_PLANKS.get(), 8)
                    .pattern("PPP")
                    .pattern("PDP")
                    .pattern("PPP")
                    .define('P', BlockInit.PALE_PLANKS.get())
                    .define('D', Items.LIGHT_BLUE_DYE)
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.BLUE_PLANKS.get(), 8)
                    .pattern("PPP")
                    .pattern("PDP")
                    .pattern("PPP")
                    .define('P', BlockInit.PALE_PLANKS.get())
                    .define('D', Items.BLUE_DYE)
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.PURPLE_PLANKS.get(), 8)
                    .pattern("PPP")
                    .pattern("PDP")
                    .pattern("PPP")
                    .define('P', BlockInit.PALE_PLANKS.get())
                    .define('D', Items.PURPLE_DYE)
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.MAGENTA_PLANKS.get(), 8)
                    .pattern("PPP")
                    .pattern("PDP")
                    .pattern("PPP")
                    .define('P', BlockInit.PALE_PLANKS.get())
                    .define('D', Items.MAGENTA_DYE)
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.PINK_PLANKS.get(), 8)
                    .pattern("PPP")
                    .pattern("PDP")
                    .pattern("PPP")
                    .define('P', BlockInit.PALE_PLANKS.get())
                    .define('D', Items.PINK_DYE)
                    .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                    .save(pWriter);
        }
        //ITEM
        {
            //TESSATITEM
            {
                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemInit.TESSAT_INGOT.get())
                        .pattern("NNN")
                        .pattern("NNN")
                        .pattern("NNN")
                        .define('N', ItemInit.TESSAT_NUGGET.get())
                        .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                        .save(pWriter, "n_tessat_ingot");

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemInit.TESSAT_FRAME.get())
                        .pattern("NNN")
                        .pattern("N N")
                        .pattern("NNN")
                        .define('N', ItemInit.TESSAT_NUGGET.get())
                        .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                        .save(pWriter);
            }
            //TESSATTOOLS
            {
                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemInit.TESSAT_SWORD.get())
                        .pattern("I")
                        .pattern("I")
                        .pattern("/")
                        .define('I', ItemInit.TESSAT_INGOT.get())
                        .define('/', Items.STICK)
                        .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                        .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemInit.TESSAT_SHOVEL.get())
                        .pattern("I")
                        .pattern("/")
                        .pattern("/")
                        .define('I', ItemInit.TESSAT_INGOT.get())
                        .define('/', Items.STICK)
                        .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                        .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemInit.TESSAT_PICKAXE.get())
                        .pattern("III")
                        .pattern(" / ")
                        .pattern(" / ")
                        .define('I', ItemInit.TESSAT_INGOT.get())
                        .define('/', Items.STICK)
                        .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                        .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemInit.TESSAT_AXE.get())
                        .pattern("II")
                        .pattern("I/")
                        .pattern(" /")
                        .define('I', ItemInit.TESSAT_INGOT.get())
                        .define('/', Items.STICK)
                        .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                        .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemInit.TESSAT_HOE.get())
                        .pattern("II")
                        .pattern(" /")
                        .pattern(" /")
                        .define('I', ItemInit.TESSAT_INGOT.get())
                        .define('/', Items.STICK)
                        .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                        .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemInit.TESSAT_SHEARS.get())
                        .pattern("I ")
                        .pattern(" I")
                        .define('I', ItemInit.TESSAT_INGOT.get())
                        .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                        .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemInit.TESSAT_FISHING_ROD.get())
                        .pattern("  /")
                        .pattern(" /S")
                        .pattern("/ S")
                        .define('S', Items.STRING)
                        .define('/', ItemInit.TESSAT_INGOT.get())
                        .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                        .save(pWriter);
            }
        }
    }
        //   /\
        //   ||
        //SHAPED-CRAFTING

        //SHAPELESS-CRAFTING
        //   ||
        //   \/
        {
        //TESSAT
        {
                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.TESSAT_INGOT.get(), 9)
                        .requires(BlockInit.TESSAT_BLOCK.get())
                        .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                        .save(pWriter, "b_tessat_ingot");

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.TESSAT_NUGGET.get(), 9)
                        .requires(ItemInit.TESSAT_INGOT.get())
                        .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                        .save(pWriter);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.RAW_TESSAT.get(), 9)
                        .requires(BlockInit.RAW_TESSAT_BLOCK.get())
                        .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                        .save(pWriter);
            }
        }
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
