package utill;

import com.example.examplemod.TechTools;
import com.example.examplemod.TechTools.TechToolsGroup;

import common.items.armor.ArmorMaterialList;
import common.items.tools.TechToolClasses;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.items.wrapper.EntityEquipmentInvWrapper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class itemdirec {

	public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "techtools");

	// Steel Tool
	public static Item steel_pickaxe;
	public static Item steel_sword;
	public static Item steel_shovel;
	public static Item steel_axe;
	// Bronze Tool
	public static Item bronze_sword;
	public static Item bronze_pickaxe;
	public static Item bronze_axe;
	public static Item bronze_shovel;
	// Silver Tool
	public static Item silver_sword;
	public static Item silver_pickaxe;
	public static Item silver_axe;
	public static Item silver_shovel;
	// Tin Tool
	public static Item tin_sword;
	public static Item tin_shovel;
	public static Item tin_pickaxe;
	public static Item tin_axe;
	//Copper Tool
	public static Item copper_axe;
	public static Item copper_sword;
	public static Item copper_pickaxe;
	public static Item copper_shovel;
	//Lead Tool
	public static Item lead_axe;
	public static Item lead_sword;
	public static Item lead_shovel;
	public static Item lead_pickaxe;
	//Vanadium Tool
	public static Item vanadium_pickaxe;
	public static Item vanadium_axe;
	public static Item vanadium_shovel;
	public static Item vanadium_sword;
	//Steel Armor
	public static Item steel_helmet;
	public static Item steel_chestplate;
	public static Item steel_leggings;
	public static Item steel_boots;
	
	
	
	
	
	static {
		// Steel Items
		ITEMS.register("steel_pickaxe", () -> steel_pickaxe = new PickaxeItem(TechToolClasses.STEEL, -2, -3.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("steel_sword", () -> steel_sword = new SwordItem(TechToolClasses.STEEL, 1, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("steel_shovel", () -> steel_shovel = new ShovelItem(TechToolClasses.STEEL, -5, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("steel_axe", () -> steel_axe = new AxeItem(TechToolClasses.STEEL, 2, -3.0F,
				new Properties().group(TechTools.TechTools_Group)));
		// Bronze Items
		ITEMS.register("bronze_sword", () -> bronze_sword = new SwordItem(TechToolClasses.BRONZE, -1, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("bronze_pickaxe", () -> bronze_pickaxe = new PickaxeItem(TechToolClasses.BRONZE, -2, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("bronze_axe", () -> bronze_axe = new AxeItem(TechToolClasses.BRONZE, 0, -3.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("bronze_shovel", () -> bronze_shovel = new ShovelItem(TechToolClasses.BRONZE, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		// Silver Items
		ITEMS.register("silver_sword", () -> silver_sword = new SwordItem(TechToolClasses.SILVER, -1, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("silver_pickaxe", () -> silver_pickaxe = new PickaxeItem(TechToolClasses.SILVER, -2, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("silver_axe", () -> silver_axe = new AxeItem(TechToolClasses.SILVER, 0, -3.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("silver_shovel", () -> silver_shovel = new ShovelItem(TechToolClasses.SILVER, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		//Tin Items
		ITEMS.register("tin_sword", () -> tin_sword = new SwordItem(TechToolClasses.TIN, -1, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("tin_pickaxe", () -> tin_pickaxe = new PickaxeItem(TechToolClasses.TIN, -2, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("tin_axe", () -> tin_axe = new AxeItem(TechToolClasses.TIN, 0, -3.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("tin_shovel", () -> tin_shovel = new ShovelItem(TechToolClasses.TIN, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		//Copper Items
		ITEMS.register("copper_shovel", () -> copper_shovel = new ShovelItem(TechToolClasses.COPPER, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("copper_sword", () -> copper_sword = new SwordItem(TechToolClasses.COPPER, -1, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("copper_axe", () -> copper_axe = new AxeItem(TechToolClasses.COPPER, 0, -3.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("copper_pickaxe", () -> copper_pickaxe = new PickaxeItem(TechToolClasses.COPPER, -2, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		//Lead Items
		ITEMS.register("lead_pickaxe", () -> lead_pickaxe = new PickaxeItem(TechToolClasses.LEAD, -2, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("lead_axe", () -> lead_axe = new AxeItem(TechToolClasses.LEAD, 0, -3.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("lead_sword", () -> lead_sword = new SwordItem(TechToolClasses.LEAD, -1, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("lead_shovel", () -> lead_shovel = new ShovelItem(TechToolClasses.LEAD, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		//Vanadium Items
		ITEMS.register("vanadium_pickaxe", () -> vanadium_pickaxe = new PickaxeItem(TechToolClasses.VANADIUM, -4, -1.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("vanadium_axe", () -> vanadium_axe = new AxeItem(TechToolClasses.VANADIUM, 0, -3.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("vanadium_shovel", () -> vanadium_shovel = new ShovelItem(TechToolClasses.VANADIUM, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("vanadium_sword", () -> vanadium_sword = new SwordItem(TechToolClasses.VANADIUM, 2, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		//Steel Armor
		ITEMS.register("steel_helmet", () -> steel_helmet = new ArmorItem(ArmorMaterialList.STEEL, EquipmentSlotType.HEAD, new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("steel_chestplate", () -> steel_chestplate = new ArmorItem(ArmorMaterialList.STEEL, EquipmentSlotType.CHEST, new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("steel_leggings", () -> steel_leggings = new ArmorItem(ArmorMaterialList.STEEL, EquipmentSlotType.LEGS, new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("steel_boots", () -> steel_boots = new ArmorItem(ArmorMaterialList.STEEL, EquipmentSlotType.FEET, new Properties().group(TechTools.TechTools_Group)));
		
		
		
	}
}
