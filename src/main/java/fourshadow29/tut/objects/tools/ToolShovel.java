package fourshadow29.tut.objects.tools;

import fourshadow29.tut.Tut;
import fourshadow29.tut.init.ItemInit;
import fourshadow29.tut.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class ToolShovel extends ItemSpade implements IHasModel {


	public ToolShovel(String name, ToolMaterial material) {		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Tut.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
}
