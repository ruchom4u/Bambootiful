package com.bagel.bambootiful.core.registry;

import com.bagel.bambootiful.core.util.DataUtils;

import net.minecraftforge.fml.ModList;

public class BambooBlockData {
	public static void registerCompostables() {
		//DataUtils.registerCompostable(0.3F, BambooBlocks.DRIED_BAMBOO.get());
	}
	
	public static void registerFlammables() {
		DataUtils.registerFlammable(BambooBlocks.BAMBOO_PLANKS.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.BAMBOO_SLAB.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.BAMBOO_STAIRS.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.BAMBOO_FENCE.get(), 5, 20);
		DataUtils.registerFlammable(BambooBlocks.BAMBOO_FENCE_GATE.get(), 5, 20);
		
		if(ModList.get().isLoaded("quark")) {
			DataUtils.registerFlammable(BambooBlocks.VERTICAL_BAMBOO_PLANKS.get(), 5, 20);
			DataUtils.registerFlammable(BambooBlocks.BAMBOO_VERTICAL_SLAB.get(), 5, 20);
			DataUtils.registerFlammable(BambooBlocks.BAMBOO_BOOKSHELF.get(), 5, 20);
		}
	}
}
