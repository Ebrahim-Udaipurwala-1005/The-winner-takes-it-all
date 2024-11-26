package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mage extends Player {
    // TODO: Implement part 4.
    private List<Ability> abilities;

    public Mage (String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType){
        super(name, "Mage", 5, armor, weapon, weaponType);
        super.intelligence = 10;
        super.strength = 2;
        super.agility = 4;
        super.spirit = 6;
        this.abilities = abilities;
        equipItems();
    }
    public List<Ability> getAbilities() {
        return abilities;
    }

    public void useAbility(Player target) {
        Random rand = new Random();
        List<Ability> mageAbilities = new ArrayList<Ability>();
        for (Ability ability : abilities) {
            if (ability.getSpecification().equals("Mage"))
                mageAbilities.add(ability);
        }
        if (mageAbilities.isEmpty()) {
            System.out.println(super.name + " has no spells to cast!");
            return;
        }
        Ability ability = mageAbilities.get(rand.nextInt(mageAbilities.size()));
        double damage = intelligence + ability.getDamage() + spirit * 0.5 - target.amountOfArmor;
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

    public void attack(Player target) {
        if (weapon == null) {
            System.out.println("You don't have a weapon to attack!");
            return;
        }
        double damage = this.strength * 0.4 + weapon.getDamage() + this.agility * 0.4 - target.amountOfArmor;
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