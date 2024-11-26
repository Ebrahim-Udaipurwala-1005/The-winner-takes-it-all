package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tank extends Player {
    // TODO: Implement part 4.
    private List<Ability> abilities;
    private Armor shield;
    public Tank (String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType, Armor shield) {
        super(name, "Tank", 30, armor, weapon, weaponType);
        super.strength = 15;
        super.intelligence = 4;
        super.agility = 6;
        super.spirit = 2;
        this.abilities = abilities;
        this.shield = shield;
        equipItems();
        equipShield();
    }

    private void equipShield() {
        if (shield.specification.equals("Tank")) {
            shield.equipped = true;
            super.strength += shield.strength;
            super.intelligence += shield.intelligence;
            super.agility += shield.agility;
            super.spirit += shield.spirit;
            super.amountOfArmor += shield.getAmountOfArmor();
        }
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public Armor getShield() {
        return shield;
    }

    @Override
    public void useAbility(Player target) {
        Random rand = new Random();
        List<Ability> tankAbilities = new ArrayList<Ability>();
        for (Ability ability : abilities) {
            if (ability.getSpecification().equals("Tank"))
                tankAbilities.add(ability);
        }
        if (tankAbilities.isEmpty()) {
            System.out.println(super.name + " has no skills to use!");
            return;
        }
        Ability ability = tankAbilities.get(rand.nextInt(tankAbilities.size()));
        super.amountOfArmor += ability.getArmor();
        System.out.println("Hey you! I am here, attack me!");
        target.attack(this);
    }

    public void attack(Player target) {
        if (weapon == null) {
            System.out.println("You don't have a weapon to attack!");
            return;
        }
        double damage = this.strength * 0.7 + weapon.getDamage() + this.agility * 0.6 - target.amountOfArmor;
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