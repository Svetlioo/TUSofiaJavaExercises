package LU.LU24_10_2023.characters;

import LU.LU24_10_2023.Character;

public class Orc extends Character {
    public Orc(String name) {
        super(name, 180, 30);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
    }

    @Override
    public void useAbility(Character target) {
        System.out.println("Using berserk");
        target.setDamage(target.getDamage() + 10);
    }
}
