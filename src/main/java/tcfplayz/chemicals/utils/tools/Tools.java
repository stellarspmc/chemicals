package tcfplayz.chemicals.utils.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public abstract class Tools implements ToolMaterial {

    public Tools INSTANCE;

    private int durability;
    private float minespeed;
    private float attackDamage;
    private int miningLevel;
    private int enchantability;
    private Ingredient ingredient;

    public Tools(Tools tool, int durability, float minespeed, float attack, int mininglevel, int enchantability, Item repairitem) {
        this.durability = durability;
        this.minespeed = minespeed;
        this.attackDamage = attack;
        this.miningLevel = mininglevel;
        this.enchantability = enchantability;
        this.ingredient = Ingredient.ofItems(repairitem);
        this.INSTANCE = tool;
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return minespeed;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return miningLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return ingredient;
    }
}
