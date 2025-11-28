package com.num5er.tanwool.items;

import com.num5er.tanwool.Main;
import com.num5er.tanwool.init.ModItems;
import com.num5er.tanwool.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRender(this, 0, "inventory");
    }
}
