package ferixx.test.mod.item;

import ferixx.test.mod.TestMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item THE_BLACK_BRICK = registerItem("the_black_brick",
            new SwordItem(ModToolMaterials.NETHER_STAR, 99, 0.3f,
                    new FabricItemSettings().group(ModItemGroup.NETHER_STAR)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TestMod.LOGGER.info("Registering Mod Items for " + TestMod.MOD_ID);
    }
}
