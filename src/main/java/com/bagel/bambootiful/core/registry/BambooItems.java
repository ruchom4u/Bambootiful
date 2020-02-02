package com.bagel.bambootiful.core.registry;

import com.bagel.bambootiful.core.Bambootiful;
import com.bagel.bambootiful.core.util.RegistryUtils;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BambooItems
{
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Bambootiful.MODID);
	
    public static RegistryObject<Item> DRIED_BAMBOO = RegistryUtils.createItem("dried_bamboo", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
    //BLOWPIPE = registerItem(new CrossbowItem(new Item.Properties().defaultMaxDamage(326).group(ItemGroup.COMBAT)), "blowpipe");
    //BAMBOO_SPEAR = registerItem(new BambooSpearItem(new Item.Properties().group(ItemGroup.MISC)), "bamboo_spear");
}