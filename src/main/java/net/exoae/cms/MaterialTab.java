package net.exoae.cms;


import net.exoae.cms.init.BlockInit;
import net.exoae.cms.init.ItemInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MaterialTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CMS.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MATERIAL_TAB = CREATIVE_MODE_TABS.register("material_tab",
            () -> CreativeModeTab.builder().icon( () -> new ItemStack(ItemInit.TESSAT_INGOT.get()))
                    .title(Component.translatable("creativetab.material_tab"))
                    .displayItems((pParameters, pOutput) ->
                    {

                        //TESSATBLOCK
                        pOutput.accept(BlockInit.TESSAT_BLOCK.get());
                        pOutput.accept(BlockInit.TESSAT_BRICKS.get());
                        pOutput.accept(BlockInit.TESSAT_ORE.get());
                        pOutput.accept(BlockInit.DEEPSLATE_TESSAT_ORE.get());
                        pOutput.accept(BlockInit.RAW_TESSAT_BLOCK.get());

                        //LUMINABLOCK
                        pOutput.accept(BlockInit.LUMINA_BLOCK.get());
                        pOutput.accept(BlockInit.LUMINA_ORE.get());
                        pOutput.accept(BlockInit.DEEPSLATE_LUMINA_ORE.get());
                        pOutput.accept(BlockInit.LUMINA_LAMP.get());

                        //CRATES
                        pOutput.accept(BlockInit.OAK_CRATE.get());
                        pOutput.accept(BlockInit.SPRUCE_CRATE.get());
                        pOutput.accept(BlockInit.BIRCH_CRATE.get());
                        pOutput.accept(BlockInit.JUNGLE_CRATE.get());
                        pOutput.accept(BlockInit.ACACIA_CRATE.get());
                        pOutput.accept(BlockInit.DARK_OAK_CRATE.get());
                        pOutput.accept(BlockInit.MANGROVE_CRATE.get());
                        pOutput.accept(BlockInit.CHERRY_CRATE.get());
                        pOutput.accept(BlockInit.BAMBOO_CRATE.get());
                        pOutput.accept(BlockInit.CRIMSON_CRATE.get());
                        pOutput.accept(BlockInit.WARPED_CRATE.get());
                        pOutput.accept(BlockInit.PALE_CRATE.get());

                        //PLANKS
                        pOutput.accept(BlockInit.PALE_PLANKS.get());

                        //NON-BLOCK BLOCKS
                        pOutput.accept(BlockInit.PALE_FENCE.get());

                        //COLORED PLANKS
                        pOutput.accept(BlockInit.WHITE_PLANKS.get());
                        pOutput.accept(BlockInit.LIGHT_GRAY_PLANKS.get());
                        pOutput.accept(BlockInit.GRAY_PLANKS.get());
                        pOutput.accept(BlockInit.BLACK_PLANKS.get());
                        pOutput.accept(BlockInit.BROWN_PLANKS.get());
                        pOutput.accept(BlockInit.RED_PLANKS.get());
                        pOutput.accept(BlockInit.ORANGE_PLANKS.get());
                        pOutput.accept(BlockInit.YELLOW_PLANKS.get());
                        pOutput.accept(BlockInit.LIME_PLANKS.get());
                        pOutput.accept(BlockInit.GREEN_PLANKS.get());
                        pOutput.accept(BlockInit.CYAN_PLANKS.get());
                        pOutput.accept(BlockInit.LIGHT_BLUE_PLANKS.get());
                        pOutput.accept(BlockInit.BLUE_PLANKS.get());
                        pOutput.accept(BlockInit.PURPLE_PLANKS.get());
                        pOutput.accept(BlockInit.MAGENTA_PLANKS.get());
                        pOutput.accept(BlockInit.PINK_PLANKS.get());

                        //TESSATITEM
                        pOutput.accept(ItemInit.TESSAT_INGOT.get());
                        pOutput.accept(ItemInit.RAW_TESSAT.get());
                        pOutput.accept(ItemInit.TESSAT_NUGGET.get());
                        pOutput.accept(ItemInit.TESSAT_FRAME.get());

                        //LUMINAITEM
                        pOutput.accept(ItemInit.LUMINA.get());
                    }
                    ).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
