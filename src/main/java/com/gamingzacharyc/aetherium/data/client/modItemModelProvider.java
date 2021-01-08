package com.gamingzacharyc.aetherium.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class modItemModelProvider extends ItemModelProvider {
    public modItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, "aetherium", existingFileHelper);
    }

    @Override
    protected void registerModels(){
        withExistingParent("test_block", modLoc("block/test_block"));
        withExistingParent("test_block_two", modLoc("block/test_block_two"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        builder(itemGenerated, "item");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
