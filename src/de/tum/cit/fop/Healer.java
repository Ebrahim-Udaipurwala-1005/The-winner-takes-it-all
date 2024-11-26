package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Healer extends Player {
    // TODO: Implement part 4.
    private List<Ability> abilities;
    public Healer (String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType){
        super(name, "Healer", 9, armor, weapon, weaponType);
        super.strength = 3;
        super.agility = 3;
        super.intelligence = 5;
        super.spirit = 10;
        this.abilities = abilities;
        equipItems();
    }
    public List<Ability> getAbilities() {
        return abilities;
    }

    public void useAbility(Player target) {
        Random rand = new Random();
        List<Ability> healerAbilities = new ArrayList<Ability>();
        for (Ability ability : abilities) {
            if (ability.getSpecification().equals("Healer"))
                healerAbilities.add(ability);
        }
        if (healerAbilities.isEmpty()) {
            System.out.println(super.name + " has no spells to cast!");
            return;
        }
        if (target.isDead()) {
            System.out.println("Can not heal " + target.name + ", " + target.name + " is dead!");
            return;
        }
        Ability ability = healerAbilities.get(rand.nextInt(healerAbilities.size()));
        target.health += spirit + ability.getHeal() + intelligence * 0.5;
        if (target.isDead()) {
            System.out.println("Can not heal " + target.name + ", " + target.name + " is dead!");
        }
    }

    @Override
    public void attack(Player target) {
        if (weapon == null) {
            System.out.println("You don't have a weapon to attack!");
            return;
        }
        double damage = this.strength * 0.2 + weapon.getDamage() + this.agility * 0.1 - target.amountOfArmor;
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