
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testingmobs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.testingmobs.TestingMobsMod;

public class TestingMobsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TestingMobsMod.MODID);
	public static final RegistryObject<Item> FJDSOBUVSP_LOG = block(TestingMobsModBlocks.FJDSOBUVSP_LOG);
	public static final RegistryObject<Item> FJDSOBUVSP_WOOD = block(TestingMobsModBlocks.FJDSOBUVSP_WOOD);
	public static final RegistryObject<Item> FJDSOBUVSP_PLANKS = block(TestingMobsModBlocks.FJDSOBUVSP_PLANKS);
	public static final RegistryObject<Item> FJDSOBUVSP_LEAVES = block(TestingMobsModBlocks.FJDSOBUVSP_LEAVES);
	public static final RegistryObject<Item> FJDSOBUVSP_STAIRS = block(TestingMobsModBlocks.FJDSOBUVSP_STAIRS);
	public static final RegistryObject<Item> FJDSOBUVSP_SLAB = block(TestingMobsModBlocks.FJDSOBUVSP_SLAB);
	public static final RegistryObject<Item> FJDSOBUVSP_FENCE = block(TestingMobsModBlocks.FJDSOBUVSP_FENCE);
	public static final RegistryObject<Item> FJDSOBUVSP_FENCE_GATE = block(TestingMobsModBlocks.FJDSOBUVSP_FENCE_GATE);
	public static final RegistryObject<Item> FJDSOBUVSP_PRESSURE_PLATE = block(TestingMobsModBlocks.FJDSOBUVSP_PRESSURE_PLATE);
	public static final RegistryObject<Item> FJDSOBUVSP_BUTTON = block(TestingMobsModBlocks.FJDSOBUVSP_BUTTON);
	public static final RegistryObject<Item> ENCHANTEDICE_SPAWN_EGG = REGISTRY.register("enchantedice_spawn_egg", () -> new ForgeSpawnEggItem(TestingMobsModEntities.ENCHANTEDICE, -1, -1, new Item.Properties()));

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
