package com.gamingzacharyc.aetherium.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import com.gamingzacharyc.aetherium.setup.modBlocks;

public class modBlockStateProvider extends BlockStateProvider {
    public modBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelp){
        super(gen, "aetherium", exFileHelp);
    }

    @Override
    protected void registerStatesAndModels(){
        simpleBlock(modBlocks.TEST_BLOCK.get());
        simpleBlock(modBlocks.TEST_BLOCK_TWO.get());
    }
}
