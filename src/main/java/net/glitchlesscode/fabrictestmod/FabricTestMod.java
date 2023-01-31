package net.glitchlesscode.fabrictestmod;

import net.fabricmc.api.ModInitializer;
import net.glitchlesscode.fabrictestmod.block.ModBlocks;
import net.glitchlesscode.fabrictestmod.item.ModItemGroup;
import net.glitchlesscode.fabrictestmod.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricTestMod implements ModInitializer {
	public static final String MOD_ID = "fabrictestmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}