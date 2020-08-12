package com.Project_HKL.CyberCraft.init;
import com.Project_HKL.CyberCraft.CyberCraft;
import com.Project_HKL.CyberCraft.blocks.AsphaltRoad;
import com.Project_HKL.CyberCraft.blocks.WhiteDoubleRoadLines;
import com.Project_HKL.CyberCraft.blocks.WhiteRoadLine;
import com.Project_HKL.CyberCraft.blocks.YellowRoadLine;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
public class CyberCraftBlocks
{
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, CyberCraft.MOD_ID);
    //Blocks
    public static final RegistryObject<Block> ASPHALT_ROAD = BLOCKS.register("asphalt_road", AsphaltRoad::new);
    public static final RegistryObject<Block> WHITE_ROAD_LINE = BLOCKS.register("white_road_line", WhiteRoadLine::new);
    public static final RegistryObject<Block> YELLOW_ROAD_LINE = BLOCKS.register("yellow_road_line", YellowRoadLine::new);
    public static final RegistryObject<Block> WHITE_DOUBLE_ROAD_LINES = BLOCKS.register("white_double_road_lines", WhiteDoubleRoadLines::new);
}
