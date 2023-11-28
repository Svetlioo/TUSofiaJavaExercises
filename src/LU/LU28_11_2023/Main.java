package LU.LU28_11_2023;


import LU.LU28_11_2023.services.HighScoresManager;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            HighScoresManager highScoresManager = new HighScoresManager();
            while (true) {
                Game game = new Game(scanner, highScoresManager);
                game.start();
                game.end();
                System.out.println("=============================");
                System.out.println("Would you like to play again?");
                System.out.println("Press anything for yes, Press n for no");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("n")) break;
            }
            highScoresManager.displayHighScores();
            highScoresManager.saveHighScoresToJson("src/LU/LU28_11_2023/scores.json");


        }
    }


}
