package common.items.armor;

import com.example.examplemod.TechTools;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import utill.itemdirec;

public enum ArmorMaterialList implements IArmorMaterial
{
	STEEL("steel", 3, new int[] {1200, 1200, 1200, 1200}, 25, itemdirec.steel_pickaxe, "", 1.0f, 2.0f);
	
       
	
	
	private static final int[] max_damage_array = new int[]{2, 6, 5, 2};
	private String name, equipSound;
	private int durability, enchantability;
	private Item repairItem;
	private int[] damageReductionAmounts;
	private float toughness;
	private float KnockbackResistance;
	
	private ArmorMaterialList(String name, int durability, int[] damageRedustionAmounts, int enchantability, Item repairItem, String equipSound, float toughness, float KnockbackResistance)
	{
		this.name = name;
		this.equipSound = equipSound;
		this.durability = durability;
		this.enchantability = enchantability;
		this.repairItem = repairItem;
		this.damageReductionAmounts = damageRedustionAmounts;
		this.toughness = toughness;
		this.KnockbackResistance = KnockbackResistance;
	}

	@Override
	public int getDurability(EquipmentSlotType slot) {
		// TODO Auto-generated method stub
		return this.damageReductionAmounts[slot.getIndex()];
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slot) {
		// TODO Auto-generated method stub
		return max_damage_array[slot.getIndex()] * this.durability;
	}

	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return this.enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() {
		// TODO Auto-generated method stub
		return new SoundEvent(new ResourceLocation(equipSound));
	}

	@Override
	public Ingredient getRepairMaterial() {
		// TODO Auto-generated method stub
		return Ingredient.fromItems(this.repairItem);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return TechTools.MOD_ID + ":" + this.name;
	}

	@Override
	public float getToughness() {
		// TODO Auto-generated method stub
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		// TODO Auto-generated method stub
		return this.KnockbackResistance;
	}
}
