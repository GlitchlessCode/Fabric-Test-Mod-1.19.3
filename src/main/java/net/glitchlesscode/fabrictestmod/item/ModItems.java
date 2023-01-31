package net.glitchlesscode.fabrictestmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.glitchlesscode.fabrictestmod.FabricTestMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GENERAL_MATERIAL = registerItem("general_material", new Item(new FabricItemSettings()));
    public static final Item MODIFIED_MATERIAL = registerItem("modified_material", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FabricTestMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.MATERIALS, GENERAL_MATERIAL);
        addToItemGroup(ModItemGroup.MATERIALS, MODIFIED_MATERIAL);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        FabricTestMod.LOGGER.info("Registering ModItems for " + FabricTestMod.MOD_ID);

        addItemsToItemGroup();
    }
}
