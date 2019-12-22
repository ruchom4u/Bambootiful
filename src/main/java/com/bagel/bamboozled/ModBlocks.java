package com.bagel.bamboozled;

import net.minecraft.block.Block;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks
{
	public static Block BAMBOO_PLANKS;
	public static Block BAMBOO_STAIRS;
	public static Block BAMBOO_SLAB;
	public static Block BAMBOO_FENCE;
	public static Block BAMBOO_FENCE_GATE;
	public static Block BAMBOO_PILLAR;

	public static Block DRIED_BAMBOO_PLANKS;
	public static Block DRIED_BAMBOO_STAIRS;
	public static Block DRIED_BAMBOO_SLAB;
	public static Block DRIED_BAMBOO_FENCE;
	public static Block DRIED_BAMBOO_FENCE_GATE;
	
	public static Block THATCH;
	public static Block THATCH_STAIRS;
	public static Block THATCH_SLAB;
	
    @SuppressWarnings("deprecation")
	@SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        BAMBOO_PLANKS = registerBlock(new Block(Block.Properties.create(Material.WOOD, MaterialColor.LIME).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "bamboo_planks", ItemGroup.BUILDING_BLOCKS);
        BAMBOO_STAIRS = registerBlock(new StairsBlock(BAMBOO_PLANKS.getDefaultState(), Block.Properties.from(BAMBOO_PLANKS)), "bamboo_stairs", ItemGroup.BUILDING_BLOCKS);
        BAMBOO_SLAB = registerBlock(new SlabBlock(Block.Properties.from(BAMBOO_PLANKS)), "bamboo_slab", ItemGroup.BUILDING_BLOCKS); 
        //BAMBOO_FENCE = registerBlock(new FenceBlock(Block.Properties.from(Blocks.BAMBOO_PLANKS)), "bamboo_fence", ItemGroup.BUILDING_BLOCKS);
        //BAMBOO_FENCE_GATE = registerBlock(new FenceGateBlock(Block.Properties.from(Blocks.BAMBOO_PLANKS)), "bamboo_fence_gate", ItemGroup.BUILDING_BLOCKS);
        BAMBOO_PILLAR = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.LIME).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "bamboo_pillar", ItemGroup.BUILDING_BLOCKS);

        
        DRIED_BAMBOO_PLANKS = registerBlock(new Block(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "dried_bamboo_planks", ItemGroup.BUILDING_BLOCKS);
        DRIED_BAMBOO_STAIRS = registerBlock(new StairsBlock(DRIED_BAMBOO_PLANKS.getDefaultState(), Block.Properties.from(DRIED_BAMBOO_PLANKS)), "dried_bamboo_stairs", ItemGroup.BUILDING_BLOCKS);
        DRIED_BAMBOO_SLAB = registerBlock(new SlabBlock(Block.Properties.from(DRIED_BAMBOO_PLANKS)), "dried_bamboo_slab", ItemGroup.BUILDING_BLOCKS); 
        //DRIED_BAMBOO_FENCE = registerBlock(new FenceBlock(Block.Properties.from(Blocks.DRIED_BAMBOO_PLANKS)), "dried_bamboo_fence", ItemGroup.BUILDING_BLOCKS);
        //DRIED_BAMBOO_FENCE_GATE = registerBlock(new FenceGateBlock(Block.Properties.from(Blocks.DRIED_BAMBOO_PLANKS)), "dried_bamboo_fence_gate", ItemGroup.BUILDING_BLOCKS);
        
        THATCH = registerBlock(new Block(Block.Properties.create(Material.ORGANIC, MaterialColor.BROWN).hardnessAndResistance(0.3F).sound(SoundType.PLANT)), "thatch", ItemGroup.BUILDING_BLOCKS);
        THATCH_STAIRS = registerBlock(new StairsBlock(THATCH.getDefaultState(), Block.Properties.from(THATCH)), "thatch_stairs", ItemGroup.BUILDING_BLOCKS);
        THATCH_SLAB = registerBlock(new SlabBlock(Block.Properties.from(THATCH)), "thatch_slab", ItemGroup.BUILDING_BLOCKS); 

    }
   

    public static Block registerBlock(Block block, String name, ItemGroup group)
    {
        BlockItem itemBlock = new BlockItem(block, new Item.Properties().group(group));
        block.setRegistryName(name);
        itemBlock.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        return block;
    }

    public static Block registerBlockNoGroup(Block block, String name)
    {
        BlockItem itemBlock = new BlockItem(block, new Item.Properties().group(null));
        block.setRegistryName(name);
        itemBlock.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        return block;
    }
    
    public static Block registerBlock(Block block, BlockItem itemBlock, String name) {
        block.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);

        if (itemBlock != null) {
            itemBlock.setRegistryName(name);
            ForgeRegistries.ITEMS.register(itemBlock);
        }

        return block;
    }
}