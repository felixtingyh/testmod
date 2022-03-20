package ferixx.test.mod.item;

import java.util.List;

import org.jetbrains.annotations.Nullable;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import ferixx.test.mod.TestMod;
import ferixx.test.mod.item.custom.ModMusicDiscItem;
import ferixx.test.mod.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item THE_BLACK_BRICK = registerItem("the_black_brick",
            new SwordItem(ModToolMaterials.NETHER_STAR, 99, 0.3f,
                    new FabricItemSettings().group(ModItemGroup.NETHER_STAR)));

    public static final Item TEST_MUSIC_DISC = registerItem("test_music_disc",
            new ModMusicDiscItem(7, ModSounds.TEST_MUSIC,
                    new FabricItemSettings().group(ModItemGroup.NETHER_STAR).maxCount(1)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip,
                        TooltipContext context) {
                    tooltip.add(new TranslatableText("item.testmod.test_music_disc.tooltip"));
                }
            });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TestMod.LOGGER.info("Registering Mod Items for " + TestMod.MOD_ID);
    }
}
