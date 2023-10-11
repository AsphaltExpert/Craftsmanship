package net.exoae.cms.BlockModify;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;

public class FlammableFuelBlock {

    public class FlammableBlock extends Block {
        public FlammableBlock (Properties p_49795_) {
            super(p_49795_);
        }
        @Override
        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return true;
        }
        @Override
        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 10;
        }

        @Override
        public int getFireSpreadSpeed (BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 5;
        }
    }
    public class FuelBlock extends BlockItem {
        private int burnTime = 0;

        public FuelBlock(BlockBehaviour.Properties pProperties, int burnTime) {
            super(pProperties);
            this.burnTime = burnTime;
        }

        @Override
        public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
            return this.burnTime;
        }
    }
}
