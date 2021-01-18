package com.gamingzacharyc.aetherium.data;

import com.gamingzacharyc.aetherium.data.client.modBlockStateProvider;
import com.gamingzacharyc.aetherium.data.client.modItemModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "aetherium", bus = Mod.EventBusSubscriber.Bus.MOD)
public final class dataGenClass {
    private  dataGenClass(){}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        gen.addProvider(new modItemModelProvider(gen, existingFileHelper));
        gen.addProvider(new modBlockStateProvider(gen, existingFileHelper));
    }
}