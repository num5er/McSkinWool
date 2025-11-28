package com.num5er.tanwool.init;

import com.num5er.tanwool.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block TAN_WOOL_BLOCK = new BlockBase("tan_wool_block", Material.CARPET);
}
