package de.tum.cit.fop;

import java.util.List;

public class Tank extends Player {
    private List<Ability> abilities;
    private Armor shield;

    public Tank(String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType, Armor shield) {
        super(name, "Tank", 30, armor, weapon, weaponType);
        this.strength = 15;
        this.intelligence = 4;
        this.agility = 6;
        this.spirit = 2;
        this.abilities = abilities;
        this.shield = shield;
        equipItems();
    }

    public void attack(Player target) {

    }

    public void useAbility(Player target) {

    }


    // TODO: Implement part 4.

  // TODO: Implement part 5.

  // TODO: Implement part 6.
}
