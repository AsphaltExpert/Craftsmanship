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
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_MATERIAL_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CMS.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MATERIAL_TAB = CREATIVE_MODE_MATERIAL_TABS.register("amaterial_tab",
            () -> CreativeModeTab.builder().icon( () -> new ItemStack(ItemInit.TESSAT_INGOT.get()))
                    .title(Component.translatable("creativetab.amaterial_tab"))
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

                        //PLANKS
                        pOutput.accept(BlockInit.PALE_PLANKS.get());

                        //NON-BLOCK BLOCKS
                        pOutput.accept(BlockInit.PALE_FENCE.get());

                        //TESSATITEM
                        pOutput.accept(ItemInit.TESSAT_INGOT.get());
                        pOutput.accept(ItemInit.RAW_TESSAT.get());
                        pOutput.accept(ItemInit.TESSAT_NUGGET.get());
                        pOutput.accept(ItemInit.TESSAT_FRAME.get());

                        //LUMINAITEM
                        pOutput.accept(ItemInit.LUMINA.get());
                    }
                    ).build());

    public static void register(IEventBus meventBus) {
        CREATIVE_MODE_MATERIAL_TABS.register(meventBus);
    }
}
