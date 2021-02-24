  package com.example.examplemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.datafix.fixes.ItemIntIDToString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import utill.itemdirec;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("techtools")
public class TechTools
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "techtools";
    public static final ItemGroup TechTools_Group = new TechToolsGroup("techtooltab");

    public TechTools() {
        // Register the setup method for modloading
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	bus.addListener(this::setup);
    	
        itemdirec.ITEMS.register(bus);
        
        

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){
    }
    
   public static class TechToolsGroup extends ItemGroup {

	public TechToolsGroup(String label)	 {
		super(label);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack createIcon() {
		// TODO Auto-generated method stub
		return Items.IRON_PICKAXE.getDefaultInstance();    
	  }
        
    }
 
}
