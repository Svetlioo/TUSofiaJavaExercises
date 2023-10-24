package LU24_10_2023.characters;

import LU24_10_2023.Character;

public class Human extends Character {
    public Human(String name) {
        super(name, 250, 20);
    }

    @Override
    public void useAbility(Character target) {
        System.out.printf("Using healing on %s%n", target.getName());
        target.setHealth(target.getHealth() + 20);
    }


}
