package ferixx.test.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TestMod implements ModInitializer {
	
	public static final Block NETHER_STAR_BLOCK = new Block(FabricBlockSettings
	.of(Material.METAL)
	.strength(50.0F, 1200.0F)
	.sounds(BlockSoundGroup.NETHERITE)
	.requiresTool()
	);
	
	public static final Block NETHER_STAR_BRICKS = new Block(FabricBlockSettings
	.of(Material.METAL)
	.strength(50.0F, 1200.0F)
	.sounds(BlockSoundGroup.NETHERITE)
	.requiresTool()
	);

	public static final Item THE_BLACK_BRICK = new Item(new Item.Settings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("testmod", "nether_star_block"), NETHER_STAR_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("testmod", "nether_star_block"), new BlockItem(NETHER_STAR_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
		
		Registry.register(Registry.BLOCK, new Identifier("testmod", "nether_star_bricks"), NETHER_STAR_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("testmod", "nether_star_bricks"), new BlockItem(NETHER_STAR_BRICKS, new Item.Settings().group(ItemGroup.MISC)));
	
		Registry.register(Registry.ITEM, new Identifier("testmod", "the_black_brick"), THE_BLACK_BRICK);
	
	}
}// pp
