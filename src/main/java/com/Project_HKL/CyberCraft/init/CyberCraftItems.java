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
    public static final RegistryObject<Item> WHITE_ROAD_LINE_STRAIGHT_ITEM = ITEMS.register("white_road_line_straight",
            () -> new BlockItemBase(CyberCraftBlocks.WHITE_ROAD_LINE_STRAIGHT.get()));
    public static final RegistryObject<Item> WHITE_ROAD_LINE_TURN_1_ITEM = ITEMS.register("white_road_line_turn_1",
            () -> new BlockItemBase(CyberCraftBlocks.WHITE_ROAD_LINE_TURN_1.get()));
    public static final RegistryObject<Item> WHITE_ROAD_LINE_TURN_2_ITEM = ITEMS.register("white_road_line_turn_2",
            () -> new BlockItemBase(CyberCraftBlocks.WHITE_ROAD_LINE_TURN_2.get()));
    public static final RegistryObject<Item> WHITE_ROAD_LINE_CROSS_1_ITEM = ITEMS.register("white_road_line_cross_1",
            () -> new BlockItemBase(CyberCraftBlocks.WHITE_ROAD_LINE_CROSS_1.get()));
    public static final RegistryObject<Item> WHITE_ROAD_LINE_CROSS_2_ITEM = ITEMS.register("white_road_line_cross_2",
            () -> new BlockItemBase(CyberCraftBlocks.WHITE_ROAD_LINE_CROSS_2.get()));
    public static final RegistryObject<Item> YELLOW_ROAD_LINE_TURN_1_ITEM = ITEMS.register("yellow_road_line_turn_1",
            () -> new BlockItemBase(CyberCraftBlocks.YELLOW_ROAD_LINE_TURN_1.get()));
    public static final RegistryObject<Item> YELLOW_ROAD_LINE_TURN_2_ITEM = ITEMS.register("yellow_road_line_turn_2",
            () -> new BlockItemBase(CyberCraftBlocks.YELLOW_ROAD_LINE_TURN_2.get()));
    public static final RegistryObject<Item> YELLOW_ROAD_LINE_STRAIGHT_ITEM = ITEMS.register("yellow_road_line_Straight",
            () -> new BlockItemBase(CyberCraftBlocks.YELLOW_ROAD_LINE_STRAIGHT.get()));
}
