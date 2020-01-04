package com.bagel.bambootiful;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntities
{
	
	public static EntityType<? extends BambooSpearEntity> BAMBOO_SPEAR;
	
    @SubscribeEvent
    public static void registerEntities(RegistryEvent.Register<EntityType<?>> event)
    {
    	//ModEntities.BAMBOO_SPEAR = EntityType.Builder.<BambooSpearEntity>create(BambooSpearEntity::new, EntityClassification.MISC).size(0.5F, 0.5F).build("bambootiful:bamboo_spear");
        //ModEntities.BAMBOO_SPEAR.setRegistryName("bamboo_spear");
        //ForgeRegistries.ENTITIES.register(ModEntities.BAMBOO_SPEAR);
    }

    public static <T extends Entity> EntityType<T> createEntity(EntityType.IFactory<T> factory, EntityClassification classification, String name, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates)
    {
        ResourceLocation location = new ResourceLocation("bambootiful", name);
        EntityType<T> type = EntityType.Builder.<T>create(factory, classification).setTrackingRange(trackingRange).setUpdateInterval(updateFrequency).setShouldReceiveVelocityUpdates(sendsVelocityUpdates).build(location.toString());
        type.setRegistryName(name);
        ForgeRegistries.ENTITIES.register(type);
        return type;
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRendering()
    {
        RenderingRegistry.registerEntityRenderingHandler(BambooSpearEntity.class, BambooSpearRenderer::new);
    }
}
