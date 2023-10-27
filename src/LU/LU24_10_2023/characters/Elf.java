package LU.LU24_10_2023.characters;

import LU.LU24_10_2023.Character;

import java.util.Random;

public class Elf extends Character {
    public Elf(String name) {
        super(name, 220, 25);
    }

    @Override
    public void useAbility(Character target) {
        System.out.println("Using dodge");
        Random random = new Random();
        boolean randomBool = random.nextBoolean();
        if (randomBool) {

        }
    }

}
