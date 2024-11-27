package de.tum.cit.fop;

public class Weapon extends Item {
    // TODO: Implement part 2.
    private int damage;

    public Weapon(String weaponType, String specification, int damage, int strength, int intelligence, int agility, int spirit) {
        super(weaponType);
        this.damage = damage;
        this.specification = specification;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        this.spirit = spirit;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}