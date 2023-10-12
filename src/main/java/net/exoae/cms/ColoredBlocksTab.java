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

public class ColoredBlocksTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_COLORED_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CMS.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COLORED_TAB = CREATIVE_MODE_COLORED_TABS.register("ccolored_tab",
            () -> CreativeModeTab.builder().icon( () -> new ItemStack(BlockInit.MAGENTA_PLANKS.get()))
                    .title(Component.translatable("creativetab.ccolored_tab"))
                    .displayItems((pParameters, pOutput) ->
                    {
                        //PLANKS
                        pOutput.accept(BlockInit.PALE_PLANKS.get());

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
                    }
                    ).build());

    public static void register(IEventBus ceventBus) {
        CREATIVE_MODE_COLORED_TABS.register(ceventBus);
    }
}
