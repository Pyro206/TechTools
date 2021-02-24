package utill;

import com.example.examplemod.TechTools;
import com.example.examplemod.TechTools.TechToolsGroup;

import common.items.tools.TechToolClasses;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class itemdirec {

	public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "techtools");

	// Steel
	public static Item steel_pickaxe;
	public static Item steel_sword;
	public static Item steel_shovel;
	public static Item steel_axe;
	// Bronze
	public static Item bronze_sword;
	public static Item bronze_pickaxe;
	public static Item bronze_axe;
	public static Item bronze_shovel;
	// Silver
	public static Item silver_sword;
	public static Item silver_pickaxe;
	public static Item silver_axe;
	public static Item silver_shovel;
	// Tin
	public static Item tin_sword;
	public static Item tin_shovel;
	public static Item tin_pickaxe;
	public static Item tin_axe;
	//Copper
	public static Item copper_axe;
	public static Item copper_sword;
	public static Item copper_pickaxe;
	public static Item copper_shovel;
	//Lead
	public static Item lead_axe;
	public static Item lead_sword;
	public static Item lead_shovel;
	public static Item lead_pickaxe;
	//Vanadium
	public static Item vanadium_pickaxe;
	public static Item vanadium_axe;
	public static Item vanadium_shovel;
	public static Item vanadium_sword;
	
	
	
	
	static {
		// Steel
		ITEMS.register("steel_pickaxe", () -> steel_pickaxe = new PickaxeItem(TechToolClasses.STEEL, -2, -3.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("steel_sword", () -> steel_sword = new SwordItem(TechToolClasses.STEEL, 1, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("steel_shovel", () -> steel_shovel = new ShovelItem(TechToolClasses.STEEL, -5, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("steel_axe", () -> steel_axe = new AxeItem(TechToolClasses.STEEL, 2, -3.0F,
				new Properties().group(TechTools.TechTools_Group)));
		// Bronze
		ITEMS.register("bronze_sword", () -> bronze_sword = new SwordItem(TechToolClasses.BRONZE, -1, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("bronze_pickaxe", () -> bronze_pickaxe = new PickaxeItem(TechToolClasses.BRONZE, -2, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("bronze_axe", () -> bronze_axe = new AxeItem(TechToolClasses.BRONZE, 0, -3.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("bronze_shovel", () -> bronze_shovel = new ShovelItem(TechToolClasses.BRONZE, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		// Silver 
		ITEMS.register("silver_sowrd", () -> silver_sword = new SwordItem(TechToolClasses.SILVER, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("silver_pickaxe", () -> silver_pickaxe = new PickaxeItem(TechToolClasses.SILVER, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("silver_axe", () -> silver_axe = new AxeItem(TechToolClasses.SILVER, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("silver_shovel", () -> silver_shovel = new ShovelItem(TechToolClasses.SILVER, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		//Tin
		ITEMS.register("tin_sword", () -> tin_sword = new SwordItem(TechToolClasses.TIN, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("tin_pickaxe", () -> tin_pickaxe = new PickaxeItem(TechToolClasses.TIN, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("tin_axe", () -> tin_axe = new AxeItem(TechToolClasses.TIN, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("tin_shovel", () -> tin_shovel = new ShovelItem(TechToolClasses.TIN, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		//Copper
		ITEMS.register("copper_shovel", () -> copper_shovel = new ShovelItem(TechToolClasses.COPPER, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("copper_sword", () -> copper_sword = new SwordItem(TechToolClasses.COPPER, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("copper_axe", () -> copper_axe = new AxeItem(TechToolClasses.COPPER, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("copper_pickaxe", () -> copper_pickaxe = new PickaxeItem(TechToolClasses.COPPER, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		//Lead
		ITEMS.register("lead_pickaxe", () -> lead_pickaxe = new PickaxeItem(TechToolClasses.LEAD, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("lead_axe", () -> lead_axe = new AxeItem(TechToolClasses.LEAD, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("lead_sword", () -> lead_sword = new SwordItem(TechToolClasses.LEAD, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("lead_shovel", () -> lead_shovel = new ShovelItem(TechToolClasses.LEAD, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		//Vanadium
		ITEMS.register("vanadium_pickaxe", () -> vanadium_pickaxe = new PickaxeItem(TechToolClasses.VANADIUM, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("vanadium_axe", () -> vanadium_axe = new AxeItem(TechToolClasses.VANADIUM, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("vanadium_shovel", () -> vanadium_shovel = new ShovelItem(TechToolClasses.VANADIUM, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		ITEMS.register("vanadium_sword", () -> vanadium_sword = new SwordItem(TechToolClasses.VANADIUM, -4, -2.0F,
				new Properties().group(TechTools.TechTools_Group)));
		
		
	}
}
