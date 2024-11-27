package de.tum.cit.fop;

public class Ability {

    private String name;
    private String specification;
    private int damage;
    private int heal;
    private int armor;

    // TODO: Constructor
    public Ability(String name, String specification, int amount) {
        this.name = name;
        this.specification = specification;
        switch (specification) {
            case "Mage", "Warrior":
                this.damage = amount;
                heal = -1;
                armor = -1;
                break;
            case "Tank":
                this.armor = amount;
                damage = -1;
                heal = -1;
                break;
            case "Healer":
                this.heal = amount;
                armor = -1;
                damage = -1;
                break;
            default:
                damage = -1;
                heal = -1;
                armor = -1;
        }
    }

    public String getName() {
        return this.name;
    }

    public String getSpecification() {
        return this.specification;
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