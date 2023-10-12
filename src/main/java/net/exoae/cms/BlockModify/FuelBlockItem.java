package net.exoae.cms.BlockModify;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import javax.annotation.Nullable;

public class FuelBlockItem extends BlockItem {
    private int burnTime = 0;

        public FuelBlockItem(BlockBehaviour.Properties pProperties, int burnTime) {
            super(pProperties);
            this.burnTime = burnTime;
        }
        @Override
        public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
            return this.burnTime;
        }
    }
