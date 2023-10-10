package net.exoae.cms.init;

import net.exoae.cms.CMS;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CMS.MOD_ID);

	//TESSATITEMS
	public static final RegistryObject<Item> TESSAT_INGOT = ITEMS.register("tessat_ingot",
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> RAW_TESSAT = ITEMS.register("raw_tessat",
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> TESSAT_NUGGET = ITEMS.register("tessat_nugget",
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> TESSAT_FRAME = ITEMS.register("tessat_frame",
			() -> new Item(new Item.Properties()));


	//TESSATTOOLS
	public static final RegistryObject<Item> TESSAT_SWORD = ITEMS.register("tessat_sword",
			() -> new SwordItem(ToolTiersInit.TESSAT, 4,2, new Item.Properties()));
	public static final RegistryObject<Item> TESSAT_SHOVEL = ITEMS.register("tessat_shovel",
			() -> new ShovelItem(ToolTiersInit.TESSAT, 0,0, new Item.Properties()));
	public static final RegistryObject<Item> TESSAT_PICKAXE = ITEMS.register("tessat_pickaxe",
			() -> new PickaxeItem(ToolTiersInit.TESSAT, 1,1, new Item.Properties()));
	public static final RegistryObject<Item> TESSAT_AXE = ITEMS.register("tessat_axe",
			() -> new AxeItem(ToolTiersInit.TESSAT, 7,1, new Item.Properties()));
	public static final RegistryObject<Item> TESSAT_HOE = ITEMS.register("tessat_hoe",
			() -> new HoeItem(ToolTiersInit.TESSAT, 0,0, new Item.Properties()));
	public static final RegistryObject<Item> TESSAT_SHEARS = ITEMS.register("tessat_shears",
			() -> new ShearsItem(new Item.Properties().durability(476)));
	/*public static final RegistryObject<Item> TESSAT_FISHING_ROD = ITEMS.register("tessat_fishing_rod",
			() -> new FishingRodItem(new Item.Properties().durability(256).requiredFeatures()));*/

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
