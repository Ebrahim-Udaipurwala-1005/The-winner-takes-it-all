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

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    @Override
    public void attack(Player target) {
        if (weapon == null) {
            System.out.println("You don't have a weapon to attack!");
            return;
        }
        double damage = this.strength + weapon.getDamage() + this.agility * 0.8 - target.amountOfArmor;
        if (damage <= 0) {
            System.out.println("Target " + target.name + " didn't receive any damage!");
            return;
        }
        target.health -= damage;
        if (target.isDead()) {
            System.out.println(this.name + " killed " + target.name);
            level++;
        }
    }

    public void useAbility(Player target) {

    }
  // TODO: Implement part 4.

  // TODO: Implement part 5.

  // TODO: Implement part 6.
}
