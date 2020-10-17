package com.Project_HKL.CyberCraft;
import com.Project_HKL.CyberCraft.init.CyberCraftBlocks;
import com.Project_HKL.CyberCraft.init.CyberCraftItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Mod("cyber_craft")
public class CyberCraft
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "cyber_craft";
    public CyberCraft()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        CyberCraftBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        CyberCraftItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void setup(final FMLCommonSetupEvent event)
    {}
    private void doClientStuff(final FMLClientSetupEvent event)
    {}
    //Custom ItemGroup Tab
    public static final ItemGroup TAB = new ItemGroup("CPMCmod:Asphalt")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(CyberCraftBlocks.ASPHALT_ROAD.get());
        }
    };
}
