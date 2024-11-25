package de.tum.cit.fop;

import java.util.List;

public class Mage extends Player {
    private List<Ability> abilities;
    public Mage(String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType) {
        super(name, "Mage", 5, armor, weapon, weaponType);
        this.strength = 2;
        this.intelligence = 10;
        this.agility = 4;
        this.spirit = 6;
        this.abilities = abilities;
        equipItems();
    }

    public void attack(Player target) {

    }

    public void useAbility(Player target) {

    }
}

    // TODO: Implement part 4.

  // TODO: Implement part 5.

  // TODO: Implement part 6.

