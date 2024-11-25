package de.tum.cit.fop;

import java.util.List;

public class Warrior extends Player {
    private List<Ability> abilities;
    public Warrior(String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType) {
        super(name, "Warrior", 20, armor, weapon, weaponType);
        this.strength = 20;
        this.intelligence = 2;
        this.agility = 8;
        this.spirit = 2;
        this.abilities = abilities;
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
