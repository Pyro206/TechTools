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
	private ResourceLocation sound;
	private SoundEvent event;
	private int durability, enchantability;
	private Item repairItem;
	private int[] damageReductionAmounts;
	private float toughness;
	private float KnockbackResistance;
	private Ingredient ingredient;
	
	private ArmorMaterialList(String name, int durability, int[] damageRedustionAmounts, int enchantability, Item repairItem, String equipSound, float toughness, float KnockbackResistance)
	{
		this.name = name;
		this.equipSound = equipSound;
		this.sound = new ResourceLocation(equipSound);
		this.event = new SoundEvent(this.sound);
		this.durability = durability;
		this.enchantability = enchantability;
		this.repairItem = repairItem;
		this.damageReductionAmounts = damageRedustionAmounts;
		this.toughness = toughness;
		this.KnockbackResistance = KnockbackResistance;
		this.ingredient = Ingredient.fromItems(this.repairItem);
	}

	@Override
	public int getDurability(EquipmentSlotType slot) {
		return this.damageReductionAmounts[slot.getIndex()];
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slot) {
		return max_damage_array[slot.getIndex()] * this.durability;
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() {
		return this.event;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.ingredient;
	}

	@Override
	public String getName() {
		return TechTools.MOD_ID + ":" + this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.KnockbackResistance;
	}
}
