package ferixx.test.mod.util;

import ferixx.test.mod.item.ModItems;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.condition.KilledByPlayerLootCondition;
import net.minecraft.loot.condition.RandomChanceWithLootingLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier ZOMBIE_ID = new Identifier("minecraft", "entities/zombie");

    public static void modifyLootTables() {
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {

            if (ZOMBIE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(KilledByPlayerLootCondition.builder())
                        .with(ItemEntry.builder(ModItems.TEST_MUSIC_DISC))
                        .withCondition(RandomChanceWithLootingLootCondition.builder(0.1f, 0.05f).build())
                        .withFunction(
                                SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
        }));
    }
}
