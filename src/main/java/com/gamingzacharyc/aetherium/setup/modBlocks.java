package com.gamingzacharyc.aetherium.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class modBlocks {
    public static final  RegistryObject<Block> TEST_BLOCK = register("test_block", () ->
            new Block(AbstractBlock.Properties.create(Material.CAKE).hardnessAndResistance(1, 0).harvestLevel(1).sound(SoundType.BAMBOO_SAPLING)));

    public static final  RegistryObject<Block> TEST_BLOCK_TWO = register("test_block_two", () ->
            new Block(AbstractBlock.Properties.create(Material.BAMBOO_SAPLING).hardnessAndResistance(1, 0).harvestLevel(1).sound(SoundType.CROP)));

    static void register() {}

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return registration.BLOCKS.register(name, block);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group((ItemGroup.MISC))));
        return ret;
    }
}
