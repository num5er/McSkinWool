package com.num5er.tanwool.blocks;

import com.num5er.tanwool.init.ModBlocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

import javax.annotation.Nonnull;
import java.util.Collections;
import java.util.List;

public class TanBlock extends BlockBase implements IShearable {

    public TanBlock(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.CLOTH);
        setHardness(0.8f);
        //setResistance(0.8f);
        setHarvestLevel("shears", 0); //Does not work.
        setLightLevel(0);
        //setLightOpacity(0);
        //setBlockUnbreakable()

    }

    @Override
    public boolean isShearable(@Nonnull ItemStack item, IBlockAccess world, BlockPos pos) {
        return true;
    }

    @Nonnull
    @Override
    public List<ItemStack> onSheared(@Nonnull ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
        return Collections.singletonList(new ItemStack(ModBlocks.TAN_WOOL_BLOCK));
    }


    public float getPlayerRelativeBlockHardness(IBlockState state, EntityPlayer player, World world, BlockPos pos) {

        ItemStack held = player.getHeldItemMainhand();

        // Check if holding shears
        if (held.getItem() instanceof ItemShears) {

            // Return a high break speed - the higher the value, the faster it breaks.
            // For reference:
            //   stone with pickaxe ≈ 0.2F
            //   instant break = 1.0F
            //   wool with shears would be around 0.3F to 0.4F
            return 0.2F;
        }

        return .05f;
    }

}
