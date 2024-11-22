package de.tum.cit.fop;

public class Armor extends Item {
    private int amountOfArmor;
    public Armor(String armorType, String specification, int amountOfArmor, int strength, int intelligence, int agility, int spirit) {
        super(armorType);
        this.specification = specification;
        this.amountOfArmor = amountOfArmor;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        this.spirit = spirit;
    }
}
