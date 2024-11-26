package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Warrior extends Player {
    // TODO: Implement part 4.
    private List<Ability> abilities;

    public Warrior (String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType){
        super(name, "Warrior", 15, armor, weapon, weaponType);
        super.strength = 20;
        super.agility = 8;
        super.intelligence = 2;
        super.spirit = 2;
        this.abilities = abilities;
        equipItems();
    }
    public List<Ability> getAbilities() {
        return abilities;
    }

    public void useAbility(Player target) {
        Random rand = new Random();
        List<Ability> warriorAbilities = new ArrayList<Ability>();
        for (Ability ability : abilities) {
            if (ability.getSpecification().equals("Warrior"))
                warriorAbilities.add(ability);
        }
        if (warriorAbilities.isEmpty()) {
            System.out.println(super.name + " has no skills to use!");
            return;
        }
        Ability ability = warriorAbilities.get(rand.nextInt(warriorAbilities.size()));
        double damage = strength * 2 + ability.getDamage() - target.amountOfArmor;
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

    // TODO: Implement part 5.

    // TODO: Implement part 6.
}