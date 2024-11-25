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

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public Armor getShield() {
        return shield;
    }

    public void setShield(Armor shield) {
        this.shield = shield;
    }

    private void equipShield(Armor shield){

    }

    @Override
    public void attack(Player target){
        if (weapon == null){
            System.out.println("You don't have a weapon to attack!");
            return;
        }

        double damage = (strength * 0.7) + weapon.getDamage() + (agility * 0.6) - target.amountOfArmor;

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


    // TODO: Implement part 4.

  // TODO: Implement part 5.

  // TODO: Implement part 6.
}
