package com.bagel.bambootiful;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems
{
	public static Item DRIED_BAMBOO;
	public static Item BAMBOO_SPEAR;
	
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
	{
        DRIED_BAMBOO = registerItem(new Item(new Item.Properties().group(ItemGroup.MISC)), "dried_bamboo");
        BAMBOO_SPEAR = registerItem(new BambooSpearItem(new Item.Properties().group(ItemGroup.MISC)), "bamboo_spear");
	}
    
    public static Item registerItem(Item item, String name)
    {
    	item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }
}