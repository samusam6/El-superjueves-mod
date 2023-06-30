
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testingmobs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.testingmobs.TestingMobsMod;

public class TestingMobsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TestingMobsMod.MODID);
	public static final RegistryObject<Item> ENCHANTEDICE_SPAWN_EGG = REGISTRY.register("enchantedice_spawn_egg", () -> new ForgeSpawnEggItem(TestingMobsModEntities.ENCHANTEDICE, -1, -1, new Item.Properties()));
}