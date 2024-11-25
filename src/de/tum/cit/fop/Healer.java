package de.tum.cit.fop;

import java.util.List;

public class Healer extends Player {
    private List<Ability> abilities;
    public Healer(String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType) {
        super(name, "Healer", 9, armor, weapon, weaponType);
        this.strength = 3;
        this.intelligence = 5;
        this.agility = 3;
        this.spirit = 10;
        this.abilities = abilities;
        equipItems();
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public void attack(Player target) {

    }

    public void useAbility(Player target) {

    }
  // TODO: Implement part 4.

  // TODO: Implement part 5.

  // TODO: Implement part 6.
}
