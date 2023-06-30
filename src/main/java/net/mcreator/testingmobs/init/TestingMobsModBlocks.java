
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testingmobs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.testingmobs.block.FjdsobuvspWoodBlock;
import net.mcreator.testingmobs.block.FjdsobuvspStairsBlock;
import net.mcreator.testingmobs.block.FjdsobuvspSlabBlock;
import net.mcreator.testingmobs.block.FjdsobuvspPressurePlateBlock;
import net.mcreator.testingmobs.block.FjdsobuvspPlanksBlock;
import net.mcreator.testingmobs.block.FjdsobuvspLogBlock;
import net.mcreator.testingmobs.block.FjdsobuvspLeavesBlock;
import net.mcreator.testingmobs.block.FjdsobuvspFenceGateBlock;
import net.mcreator.testingmobs.block.FjdsobuvspFenceBlock;
import net.mcreator.testingmobs.block.FjdsobuvspButtonBlock;
import net.mcreator.testingmobs.TestingMobsMod;

public class TestingMobsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TestingMobsMod.MODID);
	public static final RegistryObject<Block> FJDSOBUVSP_LOG = REGISTRY.register("fjdsobuvsp_log", () -> new FjdsobuvspLogBlock());
	public static final RegistryObject<Block> FJDSOBUVSP_WOOD = REGISTRY.register("fjdsobuvsp_wood", () -> new FjdsobuvspWoodBlock());
	public static final RegistryObject<Block> FJDSOBUVSP_PLANKS = REGISTRY.register("fjdsobuvsp_planks", () -> new FjdsobuvspPlanksBlock());
	public static final RegistryObject<Block> FJDSOBUVSP_LEAVES = REGISTRY.register("fjdsobuvsp_leaves", () -> new FjdsobuvspLeavesBlock());
	public static final RegistryObject<Block> FJDSOBUVSP_STAIRS = REGISTRY.register("fjdsobuvsp_stairs", () -> new FjdsobuvspStairsBlock());
	public static final RegistryObject<Block> FJDSOBUVSP_SLAB = REGISTRY.register("fjdsobuvsp_slab", () -> new FjdsobuvspSlabBlock());
	public static final RegistryObject<Block> FJDSOBUVSP_FENCE = REGISTRY.register("fjdsobuvsp_fence", () -> new FjdsobuvspFenceBlock());
	public static final RegistryObject<Block> FJDSOBUVSP_FENCE_GATE = REGISTRY.register("fjdsobuvsp_fence_gate", () -> new FjdsobuvspFenceGateBlock());
	public static final RegistryObject<Block> FJDSOBUVSP_PRESSURE_PLATE = REGISTRY.register("fjdsobuvsp_pressure_plate", () -> new FjdsobuvspPressurePlateBlock());
	public static final RegistryObject<Block> FJDSOBUVSP_BUTTON = REGISTRY.register("fjdsobuvsp_button", () -> new FjdsobuvspButtonBlock());
}
