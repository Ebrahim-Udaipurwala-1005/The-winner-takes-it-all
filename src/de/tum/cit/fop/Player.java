package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {
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
    protected Weapon weapon;
    protected List<Armor> armor;

    protected Player(String name, String specification, int amountOfArmor, List<Armor> armor, Weapon weapon, String weaponType){
        this.name = name;
        this.specification = specification;
        this.amountOfArmor = amountOfArmor;
        this.armor = armor;
        this.weapon = weapon;
        this.weaponType = weaponType;
    }

    // TODO: Add missing attributes.

  // TODO: Implement part 3.
}
