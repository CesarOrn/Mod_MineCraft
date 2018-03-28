package fourshadow29.tut.init;

import java.util.ArrayList;
import java.util.List;

import fourshadow29.tut.Tut;
import fourshadow29.tut.objects.armour.ArmorBase;
import fourshadow29.tut.objects.items.ItemBase;
import fourshadow29.tut.objects.tools.ToolAxe;
import fourshadow29.tut.objects.tools.ToolHoe;
import fourshadow29.tut.objects.tools.ToolPickaxe;
import fourshadow29.tut.objects.tools.ToolShovel;
import fourshadow29.tut.objects.tools.ToolSword;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {

	public static final List<Item> ITEMS=new ArrayList<Item>();
	
	//material
	public static final ToolMaterial TOOL_COPPER= EnumHelper.addToolMaterial("tool_copper", 2, 181, 5.0F, 1.5F, 5);
	public static final ArmorMaterial ARMOR_COPPER= EnumHelper.addArmorMaterial("armour_copper", Tut.MODID+":copper", 13, new int[]{2, 5, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
	
	
	//item
	public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
	
	// tools
	public static final Item AXE_COPPER = new ToolAxe("axe_copper",TOOL_COPPER);
	public static final Item HOE_COPPER = new ToolHoe("hoe_copper", TOOL_COPPER);
	public static final Item PICKAXE_COPPER = new ToolPickaxe("pickaxe_copper", TOOL_COPPER);
	public static final Item SHOVEL_COPPER = new ToolShovel("shovel_copper", TOOL_COPPER);
	public static final Item SWORD_COPPER = new ToolSword("sword_copper", TOOL_COPPER);
	
	//armour
	public static final Item HELMET_COPPER = new ArmorBase("helmet_copper",ARMOR_COPPER,1,EntityEquipmentSlot.HEAD);
	public static final Item CHEST_COPPER = new ArmorBase("chestplate_copper",ARMOR_COPPER,1,EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_COPPER = new ArmorBase("leggings_copper",ARMOR_COPPER,2,EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_COPPER = new ArmorBase("boots_copper",ARMOR_COPPER,1,EntityEquipmentSlot.FEET);
}
