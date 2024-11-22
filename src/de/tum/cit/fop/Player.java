package de.tum.cit.fop;

import java.util.List;

public abstract class Player implements Interactions {
    protected String name;
    protected String specification;
    protected int amountOfArmor;
    protected String weaponType;
    protected int strength;
    protected int intelligence;
    protected int agility;
    protected int spirit;
    protected double health = 200;
    protected int level = 1;
    protected Armor helmet;
    protected Armor chest;
    protected Armor hands;
    protected Armor legs;
    protected Armor boots;
    protected Weapon weapon;
    protected List<Armor> armor;

    protected Player(String name, String specification, int amountOfArmor, List<Armor> armor, Weapon weapon, String weaponType){
        this.name = name;
        this.specification = specification;
        this.amountOfArmor = amountOfArmor;
        this.armor = armor;
        this.weapon = weapon;
        this.weaponType = weaponType;
        equipItems();
    }

    public void equipItems(){
        for (Armor armor : armor) {
            if(armor.getType().equalsIgnoreCase("Helmet") && helmet == null){
                helmet = armor;
                updateStats(armor);
            }
            else if (armor.getType().equalsIgnoreCase("Chest") && chest == null){
                chest = armor;
                updateStats(armor);
            }
            else if (armor.getType().equalsIgnoreCase("Legs") && legs == null){
                legs = armor;
                updateStats(armor);
            }
            else if (armor.getType().equalsIgnoreCase("Boots") && boots == null){
                boots = armor;
                updateStats(armor);
            }
        }
        if(weapon != null && weapon.getType().equalsIgnoreCase(weaponType)){
            updateStats(weapon);
        }
    }

    private void updateStats(Item item){
        this.strength += item.getStrength();
        this.intelligence += item.getIntelligence();
        this.agility += item.getAgility();
        this.spirit += item.getSpirit();

        if (item instanceof Armor) {
            this.amountOfArmor += ((Armor) item).getAmountOfArmor();
        }
        else if (item instanceof Weapon){
            this.strength += ((Weapon)item).getDamage();
        }
    }

    protected boolean isDead(){
        return health <= 0;
    }

    @Override
    public abstract void attack(Player target);

    @Override
    public abstract void useAbility(Player target);

    // TODO: Add missing attributes.

  // TODO: Implement part 3.
}
