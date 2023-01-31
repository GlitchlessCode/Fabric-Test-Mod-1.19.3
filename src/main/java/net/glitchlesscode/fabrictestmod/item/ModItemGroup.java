package net.glitchlesscode.fabrictestmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.glitchlesscode.fabrictestmod.FabricTestMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup MATERIALS;

    public static void registerItemGroups() {
        MATERIALS = FabricItemGroup.builder(new Identifier(FabricTestMod.MOD_ID, "materials"))
            .displayName(Text.translatable("itemgroup.materials"))
            .icon(() -> new ItemStack(ModItems.GENERAL_MATERIAL)).build();
    }
}
