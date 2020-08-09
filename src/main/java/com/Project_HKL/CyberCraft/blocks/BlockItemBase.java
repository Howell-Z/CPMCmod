package com.Project_HKL.CyberCraft.blocks;
import com.Project_HKL.CyberCraft.CyberCraft;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
public class BlockItemBase extends BlockItem
{
    public BlockItemBase(Block block)
    {
        super(block, new Item.Properties().group(CyberCraft.TAB));
    }
}
