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

        //LUMINABLOCK
        blockWithItem(BlockInit.LUMINA_BLOCK);
        blockWithItem(BlockInit.LUMINA_LAMP);
        DropExperienceblockWithItem(BlockInit.LUMINA_ORE);
        DropExperienceblockWithItem(BlockInit.DEEPSLATE_LUMINA_ORE);

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

        //COLORED PLANKS
        blockWithItem(BlockInit.WHITE_PLANKS);
        blockWithItem(BlockInit.LIGHT_GRAY_PLANKS);
        blockWithItem(BlockInit.GRAY_PLANKS);
        blockWithItem(BlockInit.BLACK_PLANKS);
        blockWithItem(BlockInit.BROWN_PLANKS);
        blockWithItem(BlockInit.RED_PLANKS);
        blockWithItem(BlockInit.ORANGE_PLANKS);
        blockWithItem(BlockInit.YELLOW_PLANKS);
        blockWithItem(BlockInit.LIME_PLANKS);
        blockWithItem(BlockInit.GREEN_PLANKS);
        blockWithItem(BlockInit.CYAN_PLANKS);
        blockWithItem(BlockInit.LIGHT_BLUE_PLANKS);
        blockWithItem(BlockInit.BLUE_PLANKS);
        blockWithItem(BlockInit.PURPLE_PLANKS);
        blockWithItem(BlockInit.MAGENTA_PLANKS);
        blockWithItem(BlockInit.PINK_PLANKS);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    private void DropExperienceblockWithItem(RegistryObject<DropExperienceBlock> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
