package tutorial.generic;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class GenericBlock extends Block
{

    public GenericBlock (Material material)
    {
        super(material);
    }

    //If the block's drop is a block.
    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(Blocks.diamond_block);
    }
}