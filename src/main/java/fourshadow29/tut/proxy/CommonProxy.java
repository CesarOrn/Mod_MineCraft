package fourshadow29.tut.proxy;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	  @EventHandler
	    public void preInit(FMLPreInitializationEvent event)
	    {
	        
	    }
	    
	    

	    @EventHandler
	    public void init(FMLInitializationEvent event)
	    {
	        // some example code
	    }
	    
	    @EventHandler
	    public void postInit(FMLPostInitializationEvent event) {
	    	
	    }
	    
	    public void registerItemRenderer(Item item,int meta,String id) {
	  		
	  	}
}
