
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testingmobs.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TestingMobsModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(TestingMobsModBlocks.FJDSOBUVSP_FENCE_GATE.get().asItem());
			tabData.accept(TestingMobsModBlocks.FJDSOBUVSP_PRESSURE_PLATE.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(TestingMobsModItems.ENCHANTEDICE_SPAWN_EGG.get());
		}

		if (tabData.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(TestingMobsModBlocks.FJDSOBUVSP_LEAVES.get().asItem());
			tabData.accept(TestingMobsModBlocks.FJDSOBUVSP_FENCE.get().asItem());
		}
	}
}
