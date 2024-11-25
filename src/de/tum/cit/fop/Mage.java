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

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    @Override
    public void attack(Player target){
        if (weapon == null){
            System.out.println("You don't have a weapon to attack!");
            return;
        }

        double damage = (strength * 0.4) + weapon.getDamage() + (agility * 0.4) - target.amountOfArmor;

        if (damage <= 0){
            System.out.println("Target " + target.name + " didn't receive any damage!");
            return;
        }

        target.health -= damage;

        if (target.health <= 0){
            target.health = 0;
            System.out.println(name + " killed " + target.name);
            this.level++;
        }
    }

    public void useAbility(Player target) {

    }
}

    // TODO: Implement part 4.

  // TODO: Implement part 5.

  // TODO: Implement part 6.

