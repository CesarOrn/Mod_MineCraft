package fourshadow29.tut.objects.tools;

import fourshadow29.tut.Tut;
import fourshadow29.tut.init.ItemInit;
import fourshadow29.tut.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {
	
	public ToolPickaxe (String name,ToolMaterial material) {
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
		
	}
	@Override
	public void registerModels() {
		Tut.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
