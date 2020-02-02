package com.bagel.bambootiful.core;

import com.bagel.bambootiful.core.registry.BambooBlockData;
import com.bagel.bambootiful.core.registry.BambooBlocks;
import com.bagel.bambootiful.core.registry.BambooItems;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("bambootiful")
public class Bambootiful
{
    //private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "bambootiful";

    public Bambootiful() {
    	IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        DistExecutor.runWhenOn(Dist.CLIENT, () -> this::initSetupClient);
        
        BambooBlocks.BLOCKS.register(modEventBus);
        BambooItems.ITEMS.register(modEventBus);
        //BambooBiomes.BIOMES.register(modEventBus);
        //BambooEntities.ENTITY_TYPES.register(modEventBus);
        //BambooEffects.EFFECTS.register(modEventBus);
        //BambooEffects.POTIONS.register(modEventBus);
        
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    public void initSetupClient()
    {
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }
    
    
    private void setup(final FMLCommonSetupEvent event)
	{    	
        //BambootifulBiomes.registerBiomesToDictionary();
    	BambooBlockData.registerCompostables();
    	BambooBlockData.registerFlammables();
    	//BambootifulBlockData.registerStrippables();
    	//BambootifulEffects.registerBrewingRecipes();	
	}
    
    
    private void clientSetup(final FMLClientSetupEvent event) 
    {
    	RenderTypeLookup.setRenderLayer(BambooBlocks.BAMBOO_DOOR.get(),RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BambooBlocks.DRIED_BAMBOO_DOOR.get(),RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BambooBlocks.BAMBOO_TRAPDOOR.get(),RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BambooBlocks.DRIED_BAMBOO_TRAPDOOR.get(),RenderType.cutout());
		if (ModList.get().isLoaded("quark")) {
			RenderTypeLookup.setRenderLayer(BambooBlocks.BAMBOO_LADDER.get(),RenderType.cutout());
			RenderTypeLookup.setRenderLayer(BambooBlocks.DRIED_BAMBOO_LADDER.get(),RenderType.cutout());
		}
    	//ColorUtils.registerBlockColors();
    	//RenderingRegistry.registerEntityRenderingHandler(BambootifulBoatEntity.class, BambootifulBoatRenderer::new);
    }
    
}
