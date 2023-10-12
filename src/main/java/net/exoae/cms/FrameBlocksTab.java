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

public class FrameBlocksTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_FRAME_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CMS.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FRAME_TAB = CREATIVE_MODE_FRAME_TABS.register("frame_tab",
            () -> CreativeModeTab.builder().icon( () -> new ItemStack(ItemInit.TESSAT_FRAME.get()))
                    .title(Component.translatable("creativetab.frame_tab"))
                    .displayItems((pParameters, pOutput) ->
                    {
                        //TESSATITEM
                        pOutput.accept(ItemInit.TESSAT_FRAME.get());

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
                    }
                    ).build());

    public static void register(IEventBus feventBus) {
        CREATIVE_MODE_FRAME_TABS.register(feventBus);
    }
}
