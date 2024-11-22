package de.tum.cit.fop;

public abstract class Item {
    protected String specification;
    protected String type;
    protected boolean equipped;
    protected int strength;
    protected int intelligence;
    protected int agility;
    protected int spirit;

    public Item(String specification, String type, boolean equipped, int strength, int intelligence, int agility, int spirit) {
        this.specification = specification;
        this.type = type;
        this.equipped = equipped;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        this.spirit = spirit;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEquipped() {
        return equipped;
    }

    public void setEquipped(boolean equipped) {
        this.equipped = equipped;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getSpirit() {
        return spirit;
    }

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }

    // TODO: Implement part 2.
}
