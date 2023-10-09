package com.exoae.cms.datagen;

import com.exoae.cms.CMS;
import com.exoae.cms.init.BlockInit;
import com.exoae.cms.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CMS.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockInit.TESSAT_BLOCK.get(),
                        BlockInit.TESSAT_BRICKS.get(),
                        BlockInit.TESSAT_ORE.get(),
                        BlockInit.DEEPSLATE_TESSAT_ORE.get(),
                        BlockInit.RAW_TESSAT_BLOCK.get());

        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(BlockInit.OAK_CRATE.get(),
                        BlockInit.SPRUCE_CRATE.get(),
                        BlockInit.BIRCH_CRATE.get(),
                        BlockInit.JUNGLE_CRATE.get(),
                        BlockInit.ACACIA_CRATE.get(),
                        BlockInit.DARK_OAK_CRATE.get(),
                        BlockInit.MANGROVE_CRATE.get(),
                        BlockInit.CHERRY_CRATE.get(),
                        BlockInit.BAMBOO_CRATE.get(),
                        BlockInit.CRIMSON_CRATE.get(),
                        BlockInit.WARPED_CRATE.get(),
                        BlockInit.PALE_CRATE.get(),
                        BlockInit.PALE_PLANKS.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(BlockInit.TESSAT_BLOCK.get(),
                        BlockInit.TESSAT_ORE.get(),
                        BlockInit.DEEPSLATE_TESSAT_ORE.get(),
                        BlockInit.RAW_TESSAT_BLOCK.get());

        this.tag(ModTags.Blocks.NEEDS_TESSAT_TOOL)
                /*.add(BlockInit.TESSAT_BLOCK.get())*/;

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                /*.add(BlockInit.TESSAT_BLOCK.get())*/;

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                /*.add(BlockInit.TESSAT_BLOCK.get())*/;

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                /*.add(BlockInit.TESSAT_BLOCK.get())*/;

    }
}