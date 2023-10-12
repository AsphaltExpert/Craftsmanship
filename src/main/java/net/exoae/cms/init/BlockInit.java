package net.exoae.cms.init;

import net.exoae.cms.BlockModify.FlammableBlock;
import net.exoae.cms.CMS;
import java.util.function.Supplier;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS =
			DeferredRegister.create(ForgeRegistries.BLOCKS, CMS.MOD_ID);

	//START

	//TESSATBLOCKS

	public static final RegistryObject<Block> TESSAT_BLOCK = registerBlock("tessat_block",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));

	public static final RegistryObject<Block> TESSAT_BRICKS = registerBlock("tessat_bricks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));

	public static final RegistryObject<DropExperienceBlock> TESSAT_ORE = registerBlock("tessat_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).mapColor(MapColor.STONE), UniformInt.of(0,2)));

	public static final RegistryObject<DropExperienceBlock> DEEPSLATE_TESSAT_ORE = registerBlock("deepslate_tessat_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE).mapColor(MapColor.DEEPSLATE), UniformInt.of(0,2)));

	public static final RegistryObject<Block> RAW_TESSAT_BLOCK = registerBlock("raw_tessat_block",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.METAL)));

	//LUMIN
	public static final RegistryObject<Block> LUMINA_BLOCK = registerBlock("lumina_block",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.GLASS).lightLevel((p_50874_) -> {return 15;})));

	public static final RegistryObject<DropExperienceBlock> LUMINA_ORE = registerBlock("lumina_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).mapColor(MapColor.STONE).lightLevel(value -> 4), UniformInt.of(0,2)));

	public static final RegistryObject<DropExperienceBlock> DEEPSLATE_LUMINA_ORE = registerBlock("deepslate_lumina_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE).mapColor(MapColor.DEEPSLATE).lightLevel(value -> 4), UniformInt.of(0,2)));

	public static final RegistryObject<Block> LUMINA_LAMP = registerBlock("lumina_lamp",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)));

	//CRATES

	public static final RegistryObject<Block> OAK_CRATE = BLOCKS.register("oak_crate",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

	public static final RegistryObject<Block> SPRUCE_CRATE = BLOCKS.register("spruce_crate",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));

	public static final RegistryObject<Block> BIRCH_CRATE = BLOCKS.register("birch_crate",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));

	public static final RegistryObject<Block> JUNGLE_CRATE = BLOCKS.register("jungle_crate",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));

	public static final RegistryObject<Block> ACACIA_CRATE = BLOCKS.register("acacia_crate",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));

	public static final RegistryObject<Block> DARK_OAK_CRATE = BLOCKS.register("dark_oak_crate",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));

	public static final RegistryObject<Block> MANGROVE_CRATE = BLOCKS.register("mangrove_crate",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));

	public static final RegistryObject<Block> CHERRY_CRATE = BLOCKS.register("cherry_crate",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));

	public static final RegistryObject<Block> BAMBOO_CRATE = BLOCKS.register("bamboo_crate",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));

	public static final RegistryObject<Block> CRIMSON_CRATE = registerBlock("crimson_crate",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

	public static final RegistryObject<Block> WARPED_CRATE = registerBlock("warped_crate",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));

	public static final RegistryObject<Block> PALE_CRATE = BLOCKS.register("pale_crate",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));

	//PLANKS
	public static final RegistryObject<Block> PALE_PLANKS = BLOCKS.register("pale_planks",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));

	//NON-BLOCK BLOCKS
	public static final RegistryObject<Block> PALE_FENCE = BLOCKS.register("pale_fence",
			() -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_FENCE)));

	//COLORED PLANKS
	public static final RegistryObject<Block> WHITE_PLANKS = BLOCKS.register("white_planks",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
	public static final RegistryObject<Block> LIGHT_GRAY_PLANKS = BLOCKS.register("light_gray_planks",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
	public static final RegistryObject<Block> GRAY_PLANKS = BLOCKS.register("gray_planks",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
	public static final RegistryObject<Block> BLACK_PLANKS = BLOCKS.register("black_planks",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
	public static final RegistryObject<Block> BROWN_PLANKS = BLOCKS.register("brown_planks",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
	public static final RegistryObject<Block> RED_PLANKS = BLOCKS.register("red_planks",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
	public static final RegistryObject<Block> ORANGE_PLANKS = BLOCKS.register("orange_planks",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> YELLOW_PLANKS = BLOCKS.register("yellow_planks",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
	public static final RegistryObject<Block> LIME_PLANKS = BLOCKS.register("lime_planks",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
	public static final RegistryObject<Block> GREEN_PLANKS = BLOCKS.register("green_planks",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
	public static final RegistryObject<Block> CYAN_PLANKS = BLOCKS.register("cyan_planks",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
	public static final RegistryObject<Block> LIGHT_BLUE_PLANKS = BLOCKS.register("light_blue_planks",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
	public static final RegistryObject<Block> BLUE_PLANKS = BLOCKS.register("blue_planks",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
	public static final RegistryObject<Block> PURPLE_PLANKS = BLOCKS.register("purple_planks",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
	public static final RegistryObject<Block> MAGENTA_PLANKS = BLOCKS.register("magenta_planks",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
	public static final RegistryObject<Block> PINK_PLANKS = BLOCKS.register("pink_planks",
			() -> new FlammableBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
	//END

	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
	{
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn);
		return toReturn;
	}
	private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
	{
		return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
	}
	public static void register(IEventBus eventBus)
	{
		BLOCKS.register(eventBus);
	}
}
