package net.exoae.cms.BlockModify;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

import javax.annotation.Nullable;

public class FuelBlockItem extends BlockItem {
    private int burnTime = 0;

        public FuelBlockItem(Item.Properties pProperties, int burnTime) {
            super(Block, pProperties);
            this.burnTime = burnTime;
        }
        @Override
        public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
            return this.burnTime;
        }
    }
