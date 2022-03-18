package ferixx.test.mod.item;

import ferixx.test.mod.TestMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup NETHER_STAR = FabricItemGroupBuilder.build(new Identifier(TestMod.MOD_ID, "nether_star"),
            () -> new ItemStack(Items.NETHER_STAR));
}
