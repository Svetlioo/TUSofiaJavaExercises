package LU.LU24_10_2023;

import LU.LU24_10_2023.characters.Elf;
import LU.LU24_10_2023.characters.Human;
import LU.LU24_10_2023.characters.Orc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Character human1 = new Human("Nekuv chovek");
        Character orc1 = new Orc("Nekuv ork");
        Character elf1 = new Elf("Nekuv elf");
        ArrayList<Character> characters = new ArrayList<>();
        addCharacters(characters, human1, orc1, elf1);
        int fightCount = 0;
        while (fightCount++ < 10) {
            int excludingCurrent = 0;
            for (Character currentCharacter : characters) {
                System.out.println(currentCharacter.showInfo());
                if (!currentCharacter.isAlive()) {
                    System.out.println("Character cannot attack!");
                    continue;
                }
                Scanner sc = new Scanner(System.in);
                displayAtackingOpponents(characters, excludingCurrent);
                System.out.println("Press any other number for special attack");
                String choice = sc.nextLine();
                if (Integer.parseInt(choice) > 1 && Integer.parseInt(choice) < characters.size()) {
                    currentCharacter.attack(characters.get(Integer.parseInt(choice) - 1));
                } else {
                    currentCharacter.useAbility(currentCharacter);
                }
                excludingCurrent++;

            }
        }
        System.out.println("Results: ");
        for (Character character: characters) {
            System.out.println(character.showInfo());
        }

    }

    public static void addCharacters(ArrayList<Character> characters, Character... allCharacters) {
        characters.addAll(Arrays.asList(allCharacters));
    }

    public static void displayAtackingOpponents(ArrayList<Character> characters, int excludingCurrent) {
        ArrayList<Character> newArr = new ArrayList<>();
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < characters.size(); i++) {
            if (i != excludingCurrent) {
                newArr.add(characters.get(i));
                indexes.add(i);
            }

        }
        for (int i = 0; i < newArr.size(); i++) {
            System.out.printf("Press %d to attack %s%n", indexes.get(i) + 1, newArr.get(i).getName());

        }
    }
}
