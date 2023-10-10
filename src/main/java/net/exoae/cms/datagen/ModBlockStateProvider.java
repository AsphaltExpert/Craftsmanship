package net.exoae.cms.datagen;

import net.exoae.cms.BlockModify.FlammableBlock;
import net.exoae.cms.CMS;
import net.exoae.cms.init.BlockInit;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, CMS.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //TESSATBLOCK
        blockWithItem(BlockInit.TESSAT_BLOCK);
        blockWithItem(BlockInit.TESSAT_BRICKS);
        DropExperienceblockWithItem(BlockInit.TESSAT_ORE);
        DropExperienceblockWithItem(BlockInit.DEEPSLATE_TESSAT_ORE);
        blockWithItem(BlockInit.RAW_TESSAT_BLOCK);

        //CRATES
        blockWithItem(BlockInit.OAK_CRATE);
        blockWithItem(BlockInit.SPRUCE_CRATE);
        blockWithItem(BlockInit.BIRCH_CRATE);
        blockWithItem(BlockInit.JUNGLE_CRATE);
        blockWithItem(BlockInit.ACACIA_CRATE);
        blockWithItem(BlockInit.DARK_OAK_CRATE);
        blockWithItem(BlockInit.MANGROVE_CRATE);
        blockWithItem(BlockInit.CHERRY_CRATE);
        blockWithItem(BlockInit.BAMBOO_CRATE);
        blockWithItem(BlockInit.CRIMSON_CRATE);
        blockWithItem(BlockInit.WARPED_CRATE);
        blockWithItem(BlockInit.PALE_CRATE);

        //PLANKS
        blockWithItem(BlockInit.PALE_PLANKS);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    private void DropExperienceblockWithItem(RegistryObject<DropExperienceBlock> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
