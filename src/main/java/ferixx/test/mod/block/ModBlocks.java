package ferixx.test.mod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import ferixx.test.mod.TestMod;
import ferixx.test.mod.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block NETHER_STAR_BLOCK = registerBlock("nether_star_block",
            new Block(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(50.0F, 1200.0F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.NETHERITE)),
            ModItemGroup.NETHER_STAR);

    public static final Block NETHER_STAR_BRICKS = registerBlock("nether_star_bricks",
            new Block(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(50.0F, 1200.0F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.NETHERITE)),
            ModItemGroup.NETHER_STAR);

    public static final Block GLASS_SLAB = registerBlock("glass_slab",
            new SlabBlock(FabricBlockSettings
                    .copy(Blocks.GLASS)
                    .strength(0.3F, 0.3F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()),
            ModItemGroup.NETHER_STAR);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TestMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        TestMod.LOGGER.info("Registering ModBlocks for " + TestMod.MOD_ID);
    }
}
