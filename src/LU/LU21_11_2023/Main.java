package LU.LU21_11_2023;

import LU.LU21_11_2023.models.Character;
import LU.LU21_11_2023.models.Game;
import LU.LU21_11_2023.models.Monster;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Character character = new Character("Djamaikata", 100, 20, 1);
        Monster monster = new Monster("Dgeto", 800, 4);
        game.addCharacter(character);
        game.addMonster(monster);
        int maxAttacks = 0;
        while (maxAttacks++ < 20) {
            game.attack(character, monster);
        }
        System.out.println("Monster has successfully survived 20 attacks! Monster wins!");

    }
}
