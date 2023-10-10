package net.exoae.cms.datagen;

import net.exoae.cms.CMS;
import net.exoae.cms.init.ItemInit;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CMS.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ItemInit.RAW_TESSAT);
        simpleItem(ItemInit.TESSAT_INGOT);
        simpleItem(ItemInit.TESSAT_NUGGET);
        simpleItem(ItemInit.TESSAT_FRAME);

        handheldItem(ItemInit.TESSAT_SWORD);
        handheldItem(ItemInit.TESSAT_PICKAXE);
        handheldItem(ItemInit.TESSAT_AXE);
        handheldItem(ItemInit.TESSAT_SHOVEL);
        handheldItem(ItemInit.TESSAT_HOE);

        handheldItem(ItemInit.TESSAT_SHEARS);
        handheldItem(ItemInit.TESSAT_FISHING_ROD);
    }


    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CMS.MOD_ID, "item/" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(CMS.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CMS.MOD_ID, "item/" + item.getId().getPath()));
    }
}