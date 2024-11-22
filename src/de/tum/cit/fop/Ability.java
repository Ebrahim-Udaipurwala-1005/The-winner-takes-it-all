package de.tum.cit.fop;

public class Ability {

    private String name;
    private String specification;
    private int damage;
    private int heal;
    private int armor;

    public Ability(String name, String specification, int amount) {
        this.name = name;
        this.specification = specification;
        if (specification.equals("Mage")){
            this.specification = "Mage";
            this.damage = amount;
            this.heal = -1;
            this.armor = -1;
        }
        else if (specification.equals("Tank")){
            this.specification = "Tank";
            this.damage = -1;
            this.heal = -1;
            this.armor = amount;
        }
        else if (specification.equals("Healer")){
            this.specification = "Healer";
            this.damage = -1;
            this.heal = amount;
            this.armor = -1;
        }
        else if (specification.equals("Warrior")){
            this.specification = "Warrior";
            this.damage = amount;
            this.heal = -1;
            this.armor = -1;
        }
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
