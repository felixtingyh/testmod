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

        public static final Item NEVER_GONNA_GIVE_YOU_UP_DISC = registerItem("music_disc_chirp",
                        new ModMusicDiscItem(7, ModSounds.NEVER_GONNA_GIVE_YOU_UP,
                                        new FabricItemSettings().group(ModItemGroup.NETHER_STAR).maxCount(1)) {
                                @Override
                                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip,
                                                TooltipContext context) {
                                        tooltip.add(new TranslatableText("item.testmod.music_disc_chirp.tooltip"));
                                }
                        });

        public static final Item PLASTIC = registerItem("plastic",
                        new Item(new FabricItemSettings().group(ModItemGroup.NETHER_STAR)));

        public static final Item COAL_DUST = registerItem("coal_dust",
                        new Item(new FabricItemSettings().group(ModItemGroup.NETHER_STAR)));

        public static final Item EMPTY_DISC = registerItem("empty_disc",
                        new Item(new FabricItemSettings().group(ModItemGroup.NETHER_STAR)));

        public static final Item CRABULONS_THEME_DISC = registerItem("crabulons_theme_disc",
                        new ModMusicDiscItem(7, ModSounds.CRABULONS_THEME,
                                        new FabricItemSettings().group(ModItemGroup.NETHER_STAR).maxCount(1)));

        public static final Item MEGALOVANIA_DISC = registerItem("megalovania_disc",
                        new ModMusicDiscItem(7, ModSounds.MEGALOVANIA,
                                        new FabricItemSettings().group(ModItemGroup.NETHER_STAR).maxCount(1)));

        private static Item registerItem(String name, Item item) {
                return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
        }

        public static void registerModItems() {
                TestMod.LOGGER.info("Registering Mod Items for " + TestMod.MOD_ID);
        }
}
