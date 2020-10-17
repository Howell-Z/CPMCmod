package com.Project_HKL.CyberCraft.init;
import com.Project_HKL.CyberCraft.CyberCraft;
import com.Project_HKL.CyberCraft.blocks.Blocks.Asphalt;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
public class CyberCraftBlocks
{
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, CyberCraft.MOD_ID);
    //Blocks
    public static final RegistryObject<Block> ASPHALT_ROAD = BLOCKS.register("asphalt_road", Asphalt::new);
    public static final RegistryObject<Block> WHITE_ROAD_LINE = BLOCKS.register("white_road_line", Asphalt::new);
    public static final RegistryObject<Block> YELLOW_ROAD_LINE = BLOCKS.register("yellow_road_line", Asphalt::new);
    public static final RegistryObject<Block> WHITE_DOUBLE_ROAD_LINES = BLOCKS.register("white_double_road_lines", Asphalt::new);
    public static final RegistryObject<Block> WHITE_ROAD_LINE_STRAIGHT = BLOCKS.register("white_road_line_straight", Asphalt::new);
    public static final RegistryObject<Block> WHITE_ROAD_LINE_TURN_1 = BLOCKS.register("white_road_line_turn_1", Asphalt::new);
    public static final RegistryObject<Block> WHITE_ROAD_LINE_TURN_2 = BLOCKS.register("white_road_line_turn_2", Asphalt::new);
    public static final RegistryObject<Block> WHITE_ROAD_LINE_CROSS_1 = BLOCKS.register("white_road_line_cross_1", Asphalt::new);
    public static final RegistryObject<Block> WHITE_ROAD_LINE_CROSS_2 = BLOCKS.register("white_road_line_cross_2", Asphalt::new);
    public static final RegistryObject<Block> YELLOW_ROAD_LINE_TURN_1 = BLOCKS.register("yellow_road_line_turn_1", Asphalt::new);
    public static final RegistryObject<Block> YELLOW_ROAD_LINE_TURN_2 = BLOCKS.register("yellow_road_line_turn_2", Asphalt::new);
    public static final RegistryObject<Block> YELLOW_ROAD_LINE_STRAIGHT = BLOCKS.register("yellow_road_line_straight", Asphalt::new);
}
