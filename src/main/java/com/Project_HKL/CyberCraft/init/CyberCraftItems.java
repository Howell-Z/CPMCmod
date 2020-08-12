package com.Project_HKL.CyberCraft.init;
import com.Project_HKL.CyberCraft.CyberCraft;
import com.Project_HKL.CyberCraft.blocks.BlockItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
public class CyberCraftItems
{
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, CyberCraft.MOD_ID);
    //BlockItems
    public static final RegistryObject<Item> ASPHALT_ROAD_ITEM = ITEMS.register("asphalt_road",
            () -> new BlockItemBase(CyberCraftBlocks.ASPHALT_ROAD.get()));
    public static final RegistryObject<Item> WHITE_ROAD_LINE_ITEM = ITEMS.register("white_road_line",
            () -> new BlockItemBase(CyberCraftBlocks.WHITE_ROAD_LINE.get()));
    public static final RegistryObject<Item> YELLOW_ROAD_LINE_ITEM = ITEMS.register("yellow_road_line",
            () -> new BlockItemBase(CyberCraftBlocks.YELLOW_ROAD_LINE.get()));
    public static final RegistryObject<Item> WHITE_DOUBLE_ROAD_LINES_ITEM = ITEMS.register("white_double_road_lines",
            () -> new BlockItemBase(CyberCraftBlocks.WHITE_DOUBLE_ROAD_LINES.get()));
}
