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

public class ToolTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CMS.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TOOL_TAB = CREATIVE_MODE_TABS.register("tool_tab",
            () -> CreativeModeTab.builder().icon( () -> new ItemStack(ItemInit.TESSAT_PICKAXE.get()))
                    .title(Component.translatable("creativetab.tool_tab"))
                    .displayItems((pParameters, pOutput) ->
                            {
                                //TESSATTOOLS
                                pOutput.accept(ItemInit.TESSAT_SWORD.get());
                                pOutput.accept(ItemInit.TESSAT_SHOVEL.get());
                                pOutput.accept(ItemInit.TESSAT_PICKAXE.get());
                                pOutput.accept(ItemInit.TESSAT_AXE.get());
                                pOutput.accept(ItemInit.TESSAT_HOE.get());
                                pOutput.accept(ItemInit.TESSAT_SHEARS.get());
                                //pOutput.accept(ItemInit.TESSAT_FISHING_ROD.get());
                            }
                    ).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
