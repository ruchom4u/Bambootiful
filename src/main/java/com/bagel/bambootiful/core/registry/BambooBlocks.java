package com.bagel.bambootiful.core.registry;

import com.bagel.bambootiful.common.blocks.BookshelfBlock;
import com.bagel.bambootiful.common.blocks.VerticalSlabBlock;
import com.bagel.bambootiful.core.Bambootiful;
import com.bagel.bambootiful.core.util.RegistryUtils;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.LadderBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.TrapDoorBlock;
import net.minecraft.block.WoodButtonBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
@SuppressWarnings("deprecation")
public class BambooBlocks
{
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Bambootiful.MODID);

    public static RegistryObject<Block> BAMBOO_PLANKS 			= RegistryUtils.createBlock("bamboo_planks", () -> new Block(Block.Properties.create(Material.WOOD, MaterialColor.LIME).hardnessAndResistance(1.0F, 2.0F).sound(SoundType.WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> BAMBOO_PILLAR 			= RegistryUtils.createBlock("bamboo_pillar", () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.LIME).hardnessAndResistance(1.0F, 2.5F).sound(SoundType.WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> BAMBOO_SLAB 			= RegistryUtils.createBlock("bamboo_slab", () -> new SlabBlock(Block.Properties.from(BAMBOO_PLANKS.get())), ItemGroup.BUILDING_BLOCKS); 
    public static RegistryObject<Block> BAMBOO_PRESSURE_PLATE 	= RegistryUtils.createBlock("bamboo_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.from(BAMBOO_PLANKS.get()).doesNotBlockMovement()), ItemGroup.REDSTONE);
    public static RegistryObject<Block> BAMBOO_FENCE 			= RegistryUtils.createBlock("bamboo_fence", () -> new FenceBlock(Block.Properties.from(BAMBOO_PLANKS.get())), ItemGroup.DECORATIONS);
    public static RegistryObject<Block> BAMBOO_TRAPDOOR 		= RegistryUtils.createBlock("bamboo_trapdoor", () -> new TrapDoorBlock(Block.Properties.from(BAMBOO_PLANKS.get()).notSolid()), ItemGroup.REDSTONE);
    public static RegistryObject<Block> BAMBOO_FENCE_GATE 		= RegistryUtils.createBlock("bamboo_fence_gate", () -> new FenceGateBlock(Block.Properties.from(BAMBOO_PLANKS.get())), ItemGroup.REDSTONE);
    public static RegistryObject<Block> BAMBOO_BUTTON 			= RegistryUtils.createBlock("bamboo_button", () -> new WoodButtonBlock(Block.Properties.from(BAMBOO_PLANKS.get()).doesNotBlockMovement()), ItemGroup.REDSTONE);
	public static RegistryObject<Block> BAMBOO_STAIRS 			= RegistryUtils.createBlock("bamboo_stairs", () -> new StairsBlock(BAMBOO_PLANKS.get().getDefaultState(), Block.Properties.from(BAMBOO_PLANKS.get())), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> BAMBOO_DOOR 			= RegistryUtils.createBlock("bamboo_door", () -> new DoorBlock(Block.Properties.from(BAMBOO_PLANKS.get()).notSolid()), ItemGroup.REDSTONE);
    public static RegistryObject<Block> VERTICAL_BAMBOO_PLANKS 	= RegistryUtils.createBlockCompat("quark", "vertical_bamboo_planks", () -> new Block(Block.Properties.from(BAMBOO_PLANKS.get())),  ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> BAMBOO_VERTICAL_SLAB 	= RegistryUtils.createBlockCompat("quark", "bamboo_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(BAMBOO_PLANKS.get())), ItemGroup.BUILDING_BLOCKS); 
    public static RegistryObject<Block> BAMBOO_LADDER		 	= RegistryUtils.createBlockCompat("quark", "bamboo_ladder", () -> new LadderBlock(Block.Properties.from(Blocks.LADDER).notSolid()), ItemGroup.DECORATIONS); 
    public static RegistryObject<Block> BAMBOO_BOOKSHELF	 	= RegistryUtils.createBlockCompat("quark", "bamboo_bookshelf", () -> new BookshelfBlock(Block.Properties.from(Blocks.BOOKSHELF)), ItemGroup.DECORATIONS); 
    
    public static RegistryObject<Block> DRIED_BAMBOO_PLANKS 			= RegistryUtils.createBlock("dried_bamboo_planks", () -> new Block(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(1.0F, 2.0F).sound(SoundType.WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> DRIED_BAMBOO_PILLAR 			= RegistryUtils.createBlock("dried_bamboo_pillar", () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD, MaterialColor.LIME).hardnessAndResistance(1.0F, 2.5F).sound(SoundType.WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> DRIED_BAMBOO_SLAB 				= RegistryUtils.createBlock("dried_bamboo_slab", () -> new SlabBlock(Block.Properties.from(DRIED_BAMBOO_PLANKS.get())),  ItemGroup.BUILDING_BLOCKS); 
    public static RegistryObject<Block> DRIED_BAMBOO_PRESSURE_PLATE 	= RegistryUtils.createBlock("dried_bamboo_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.from(DRIED_BAMBOO_PLANKS.get()).doesNotBlockMovement()), ItemGroup.REDSTONE);
    public static RegistryObject<Block> DRIED_BAMBOO_FENCE 				= RegistryUtils.createBlock("dried_bamboo_fence", () -> new FenceBlock(Block.Properties.from(DRIED_BAMBOO_PLANKS.get())),  ItemGroup.DECORATIONS);
    public static RegistryObject<Block> DRIED_BAMBOO_TRAPDOOR 			= RegistryUtils.createBlock("dried_bamboo_trapdoor", () -> new TrapDoorBlock(Block.Properties.from(DRIED_BAMBOO_PLANKS.get()).notSolid()), ItemGroup.REDSTONE);
    public static RegistryObject<Block> DRIED_BAMBOO_FENCE_GATE 		= RegistryUtils.createBlock("dried_bamboo_fence_gate", () -> new FenceGateBlock(Block.Properties.from(DRIED_BAMBOO_PLANKS.get())),  ItemGroup.REDSTONE);
    public static RegistryObject<Block> DRIED_BAMBOO_BUTTON 			= RegistryUtils.createBlock("dried_bamboo_button", () -> new WoodButtonBlock(Block.Properties.from(DRIED_BAMBOO_PLANKS.get()).doesNotBlockMovement()),  ItemGroup.REDSTONE);
    public static RegistryObject<Block> DRIED_BAMBOO_STAIRS 			= RegistryUtils.createBlock("dried_bamboo_stairs", () -> new StairsBlock(DRIED_BAMBOO_PLANKS.get().getDefaultState(), Block.Properties.from(DRIED_BAMBOO_PLANKS.get())), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> DRIED_BAMBOO_DOOR 				= RegistryUtils.createBlock("dried_bamboo_door", () -> new DoorBlock(Block.Properties.from(BAMBOO_PLANKS.get()).notSolid()), ItemGroup.REDSTONE);
    public static RegistryObject<Block> VERTICAL_DRIED_BAMBOO_PLANKS 	= RegistryUtils.createBlockCompat("quark", "vertical_dried_bamboo_planks", () -> new Block(Block.Properties.from(DRIED_BAMBOO_PLANKS.get())), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> DRIED_BAMBOO_VERTICAL_SLAB 		= RegistryUtils.createBlockCompat("quark", "dried_bamboo_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(DRIED_BAMBOO_PLANKS.get())), ItemGroup.BUILDING_BLOCKS); 
    public static RegistryObject<Block> DRIED_BAMBOO_LADDER		 		= RegistryUtils.createBlockCompat("quark", "dried_bamboo_ladder", () -> new LadderBlock(Block.Properties.from(Blocks.LADDER).notSolid()), ItemGroup.DECORATIONS); 
    public static RegistryObject<Block> DRIED_BAMBOO_BOOKSHELF	 		= RegistryUtils.createBlockCompat("quark", "dried_bamboo_bookshelf", () -> new BookshelfBlock(Block.Properties.from(Blocks.BOOKSHELF)), ItemGroup.DECORATIONS); 
    
    public static RegistryObject<Block> THATCH 					= RegistryUtils.createBlock("thatch", () -> new Block(Block.Properties.create(Material.ORGANIC, MaterialColor.BROWN).hardnessAndResistance(0.2F).sound(SoundType.PLANT)), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> THATCH_STAIRS 			= RegistryUtils.createBlock("thatch_stairs", () -> new StairsBlock(THATCH.get().getDefaultState(), Block.Properties.from(THATCH.get())), ItemGroup.BUILDING_BLOCKS);
    public static RegistryObject<Block> THATCH_SLAB 			= RegistryUtils.createBlock("thatch_slab", () -> new SlabBlock(Block.Properties.from(THATCH.get())), ItemGroup.BUILDING_BLOCKS); 
    public static RegistryObject<Block> THATCH_VERTICAL_SLAB 	= RegistryUtils.createBlockCompat("quark", "thatch_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(THATCH.get())), ItemGroup.BUILDING_BLOCKS); 
}