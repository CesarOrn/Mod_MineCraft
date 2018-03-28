package fourshadow29.tut.objects.blocks;

import fourshadow29.tut.Tut;
import fourshadow29.tut.init.BlockInit;
import fourshadow29.tut.init.ItemInit;
import fourshadow29.tut.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Tut.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "invetory");
		
	}

}
