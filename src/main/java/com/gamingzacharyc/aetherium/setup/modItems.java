package com.gamingzacharyc.aetherium.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class modItems {
    public static final RegistryObject<Item> TestItem = registration.ITEMS.register("test_item", () ->
            new Item(new Item.Properties().group(ItemGroup.FOOD)));

    static void register(){}
}
