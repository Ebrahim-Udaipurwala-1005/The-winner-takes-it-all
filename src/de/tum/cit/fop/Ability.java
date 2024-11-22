package de.tum.cit.fop;

public class Ability {

    private String name;
    private String specification;
    private int damage;
    private int heal;
    private int armor;

    public Ability(String name, String specification, int damage, int heal, int armor) {
        this.name = name;
        this.specification = specification;
        this.damage = damage;
        this.heal = heal;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public String getSpecification() {
        return specification;
    }

    public int getDamage() {
        return damage;
    }

    public int getHeal() {
        return heal;
    }

    public int getArmor() {
        return armor;
    }

}
