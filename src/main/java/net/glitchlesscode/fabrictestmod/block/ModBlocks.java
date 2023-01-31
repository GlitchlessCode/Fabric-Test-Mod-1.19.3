package net.glitchlesscode.fabrictestmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.glitchlesscode.fabrictestmod.FabricTestMod;
import net.glitchlesscode.fabrictestmod.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block GENERAL_MATERIAL_BLOCK = registerBlock("general_material_block", new Block(FabricBlockSettings.of(Material.METAL).strength(1.0f).requiresTool()), ModItemGroup.MATERIALS);
    public static final Block MODIFIED_MATERIAL_BLOCK = registerBlock("modified_material_block", new Block(FabricBlockSettings.of(Material.METAL).strength(1.0f).requiresTool()), ModItemGroup.MATERIALS);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(FabricTestMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(FabricTestMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        FabricTestMod.LOGGER.info("Registering ModBlocks for " + FabricTestMod.MOD_ID);
    }
}
