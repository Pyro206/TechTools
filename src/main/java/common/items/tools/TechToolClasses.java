package common.items.tools;

import java.util.function.Supplier;

import utill.itemdirec;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum TechToolClasses implements IItemTier {
    STEEL(2, 1200, 4.0F, 5.0f, 5, () -> { return Ingredient.fromItems(itemdirec.steel_pickaxe); }),
    BRONZE(2, 500, 3.0F, 5.0f, 5, () -> { return Ingredient.fromItems(itemdirec.bronze_sword); }),
    TIN(2, 260, 3.0F, 5.0f, 5, () -> { return Ingredient.fromItems(itemdirec.tin_sword); }),
    COPPER(2, 400, 3.0F, 5.0f, 5, () -> { return Ingredient.fromItems(itemdirec.copper_sword); }),
    LEAD(1, 250, 2.0F, 5.0f, 5, () -> { return Ingredient.fromItems(itemdirec.lead_sword); }),
    VANADIUM(4, 1000, 6.0F, 6.0f, 5, () -> { return Ingredient.fromItems(itemdirec.vanadium_sword); }),
    SILVER(3, 600, 5.0F, 5.0f, 5, () -> { return Ingredient.fromItems(itemdirec.silver_pickaxe); });
	

    private final int harvestLevel;
    private final int maxUses;
    private final float efficency;
    private final float attackDammage;
    private final int enchantability;
    private final Supplier<Ingredient>reapairMat;

    public TechToolClasses(int harvestLevel, int maxUses, float efficency, float attackDammage, int enchantability, Supplier<Ingredient>reapairMat) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficency = efficency;
        this.attackDammage = attackDammage;
        this.enchantability = enchantability;
        this.reapairMat = reapairMat;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficency;
    }

    @Override
    public float getAttackDamage() {
        return attackDammage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return  reapairMat.get();
    }

}
