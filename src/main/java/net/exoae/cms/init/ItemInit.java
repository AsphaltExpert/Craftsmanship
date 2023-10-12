package net.exoae.cms.init;

import net.exoae.cms.BlockModify.FlammableBlock;
import net.exoae.cms.BlockModify.FuelBlockItem;
import net.exoae.cms.CMS;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
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

	//LUMINITEMS
	public static final RegistryObject<Item> LUMINA = ITEMS.register("lumina",
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

	//BlockItems (Crates / Colored Planks)
	public static final RegistryObject<Item> OAK_CRATE = ITEMS.register("oak_crate",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.OAK_CRATE.get(), 300));
	public static final RegistryObject<Item> SPRUCE_CRATE = ITEMS.register("spruce_crate",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.SPRUCE_CRATE.get(), 300));
	public static final RegistryObject<Item> BIRCH_CRATE = ITEMS.register("birch_crate",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.BIRCH_CRATE.get(), 300));
	public static final RegistryObject<Item> JUNGLE_CRATE = ITEMS.register("jungle_crate",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.JUNGLE_CRATE.get(), 300));
	public static final RegistryObject<Item> ACACIA_CRATE = ITEMS.register("acacia_crate",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.ACACIA_CRATE.get(), 300));
	public static final RegistryObject<Item> DARK_OAK_CRATE = ITEMS.register("dark_oak_crate",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.DARK_OAK_CRATE.get(), 300));
	public static final RegistryObject<Item> MANGROVE_CRATE = ITEMS.register("mangrove_crate",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.MANGROVE_CRATE.get(), 300));
	public static final RegistryObject<Item> CHERRY_CRATE = ITEMS.register("cherry_crate",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.CHERRY_CRATE.get(), 300));
	public static final RegistryObject<Item> BAMBOO_CRATE = ITEMS.register("bamboo_crate",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.BAMBOO_CRATE.get(), 300));
	public static final RegistryObject<Item> PALE_CRATE = ITEMS.register("pale_crate",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.PALE_CRATE.get(), 300));
	public static final RegistryObject<Item> PALE_PLANKS = ITEMS.register("pale_planks",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.PALE_PLANKS.get(), 300));
	public static final RegistryObject<Item> WHITE_PLANKS = ITEMS.register("white_planks",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.WHITE_PLANKS.get(), 300));
	public static final RegistryObject<Item> LIGHT_GRAY_PLANKS = ITEMS.register("light_gray_planks",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.LIGHT_GRAY_PLANKS.get(), 300));
	public static final RegistryObject<Item> GRAY_PLANKS = ITEMS.register("gray_planks",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.GRAY_PLANKS.get(), 300));
	public static final RegistryObject<Item> BLACK_PLANKS = ITEMS.register("black_planks",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.BLACK_PLANKS.get(), 300));
	public static final RegistryObject<Item> BROWN_PLANKS = ITEMS.register("brown_planks",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.BROWN_PLANKS.get(), 300));
	public static final RegistryObject<Item> RED_PLANKS = ITEMS.register("red_planks",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.RED_PLANKS.get(), 300));
	public static final RegistryObject<Item> ORANGE_PLANKS = ITEMS.register("orange_planks",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.ORANGE_PLANKS.get(), 300));
	public static final RegistryObject<Item> YELLOW_PLANKS = ITEMS.register("yellow_planks",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.YELLOW_PLANKS.get(), 300));
	public static final RegistryObject<Item> LIME_PLANKS = ITEMS.register("lime_planks",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.LIME_PLANKS.get(), 300));
	public static final RegistryObject<Item> GREEN_PLANKS = ITEMS.register("green_planks",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.GREEN_PLANKS.get(), 300));
	public static final RegistryObject<Item> CYAN_PLANKS = ITEMS.register("cyan_planks",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.CYAN_PLANKS.get(), 300));
	public static final RegistryObject<Item> LIGHT_BLUE_PLANKS = ITEMS.register("light_blue_planks",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.LIGHT_BLUE_PLANKS.get(), 300));
	public static final RegistryObject<Item> BLUE_PLANKS = ITEMS.register("blue_planks",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.BLUE_PLANKS.get(), 300));
	public static final RegistryObject<Item> PURPLE_PLANKS = ITEMS.register("purple_planks",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.PURPLE_PLANKS.get(), 300));
	public static final RegistryObject<Item> MAGENTA_PLANKS = ITEMS.register("magenta_planks",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.MAGENTA_PLANKS.get(), 300));
	public static final RegistryObject<Item> PINK_PLANKS = ITEMS.register("pink_planks",
			() -> new FuelBlockItem(new Item.Properties(), BlockInit.PINK_PLANKS.get(), 300));


	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
