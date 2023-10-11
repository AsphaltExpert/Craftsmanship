package net.exoae.cms.datagen.loot;

import net.exoae.cms.init.BlockInit;
import net.exoae.cms.init.ItemInit;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        //TESSATBLOCK
        this.dropSelf(BlockInit.TESSAT_BLOCK.get());
        this.dropSelf(BlockInit.TESSAT_BRICKS.get());
        this.dropSelf(BlockInit.RAW_TESSAT_BLOCK.get());

        this.add(BlockInit.TESSAT_ORE.get(),
                block -> createTessatOreDrops(BlockInit.TESSAT_ORE.get(), ItemInit.RAW_TESSAT.get()));
        this.add(BlockInit.DEEPSLATE_TESSAT_ORE.get(),
                block -> createTessatOreDrops(BlockInit.DEEPSLATE_TESSAT_ORE.get(), ItemInit.RAW_TESSAT.get()));

        //LUMINABLOCK
        this.dropSelf(BlockInit.LUMINA_BLOCK.get());

        this.add(BlockInit.LUMINA_ORE.get(),
                block -> createLUMINAOreDrops(BlockInit.LUMINA_ORE.get(), ItemInit.LUMINA.get()));
        this.add(BlockInit.DEEPSLATE_LUMINA_ORE.get(),
                block -> createLUMINAOreDrops(BlockInit.DEEPSLATE_LUMINA_ORE.get(), ItemInit.LUMINA.get()));

        //CRATES
        this.dropSelf(BlockInit.OAK_CRATE.get());
        this.dropSelf(BlockInit.SPRUCE_CRATE.get());
        this.dropSelf(BlockInit.BIRCH_CRATE.get());
        this.dropSelf(BlockInit.JUNGLE_CRATE.get());
        this.dropSelf(BlockInit.ACACIA_CRATE.get());
        this.dropSelf(BlockInit.DARK_OAK_CRATE.get());
        this.dropSelf(BlockInit.MANGROVE_CRATE.get());
        this.dropSelf(BlockInit.CHERRY_CRATE.get());
        this.dropSelf(BlockInit.BAMBOO_CRATE.get());
        this.dropSelf(BlockInit.CRIMSON_CRATE.get());
        this.dropSelf(BlockInit.WARPED_CRATE.get());
        this.dropSelf(BlockInit.PALE_CRATE.get());

        //PLANKS
        this.dropSelf(BlockInit.PALE_PLANKS.get());

        //COLORED PLANKS
        this.dropSelf(BlockInit.WHITE_PLANKS.get());
        this.dropSelf(BlockInit.LIGHT_GRAY_PLANKS.get());
        this.dropSelf(BlockInit.GRAY_PLANKS.get());
        this.dropSelf(BlockInit.BLACK_PLANKS.get());
        this.dropSelf(BlockInit.BROWN_PLANKS.get());
        this.dropSelf(BlockInit.RED_PLANKS.get());
        this.dropSelf(BlockInit.ORANGE_PLANKS.get());
        this.dropSelf(BlockInit.YELLOW_PLANKS.get());
        this.dropSelf(BlockInit.LIME_PLANKS.get());
        this.dropSelf(BlockInit.GREEN_PLANKS.get());
        this.dropSelf(BlockInit.CYAN_PLANKS.get());
        this.dropSelf(BlockInit.LIGHT_BLUE_PLANKS.get());
        this.dropSelf(BlockInit.BLUE_PLANKS.get());
        this.dropSelf(BlockInit.PURPLE_PLANKS.get());
        this.dropSelf(BlockInit.MAGENTA_PLANKS.get());
        this.dropSelf(BlockInit.PINK_PLANKS.get());
    }

    protected LootTable.Builder createTessatOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
    protected LootTable.Builder createLUMINAOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}