package com.num5er.tanwool.blocks;

import com.num5er.tanwool.Main;
import com.num5er.tanwool.init.ModBlocks;
import com.num5er.tanwool.init.ModItems;
import com.num5er.tanwool.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
    public  BlockBase(String name, Material material)
    {
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRender(Item.getItemFromBlock(this), 0, "inventory");
    }
}
