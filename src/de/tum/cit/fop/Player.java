package de.tum.cit.fop;

import java.util.List;

public abstract class Player implements Interactions {
    // TODO: Add missing attributes.
    protected String name;
    protected String specification;
    protected int amountOfArmor;
    protected String weaponType;
    protected int strength;
    protected int intelligence;
    protected int agility;
    protected int spirit;
    protected double health;
    protected int level;
    protected Armor helmet;
    protected Armor chest;
    protected Armor hands;
    protected Armor legs;
    protected Armor boots;
    protected List<Armor> armor;
    protected Weapon weapon;

    // TODO: Implement part 3.
    protected Player(String name, String specification, int amountOfArmor, List<Armor> armor, Weapon weapon, String weaponType) {
        this.name = name;
        this.specification = specification;
        this.amountOfArmor = amountOfArmor;
        this.weaponType = weaponType;
        this.armor = armor;
        this.weapon = weapon;
        level = 1;
        health = 200;
    }

    protected boolean isDead() {
        return health <= 0;
    }

    protected void equipItems() {
        if (weapon.type.equals(weaponType) && weapon.specification.equals(specification)) {
            this.weapon.equipped = true;
            this.strength += weapon.strength;
            this.intelligence += weapon.intelligence;
            this.agility += weapon.agility;
            this.spirit += weapon.spirit;
        }
        for (Armor armor : armor) {
            armor.equipped = true;
            switch (armor.type) {
                case "Helmet":
                    if (helmet == null)
                        helmet = armor;
                    break;
                case "Chest":
                    if (chest == null)
                        chest = armor;
                    break;
                case "Hands":
                    if (hands == null)
                        hands = armor;
                    break;
                case "Legs":
                    if (legs == null)
                        legs = armor;
                    break;
                case "Boots":
                    if (boots == null)
                        boots = armor;
                    break;
                default:
                    armor.equipped = false;
            }
            if (armor.equipped) {
                this.strength += armor.strength;
                this.intelligence += armor.intelligence;
                this.agility += armor.agility;
                this.spirit += armor.spirit;
                this.amountOfArmor += armor.getAmountOfArmor();
            }
        }
    }
}