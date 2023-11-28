package LU.LU28_11_2023;

import LU.LU28_11_2023.exceptions.InvalidNameException;
import LU.LU28_11_2023.services.HighScoresManager;

import java.util.Random;
import java.util.Scanner;

public class Game implements Playable {
    private final int number;
    private Scanner scanner;
    private int guesses;
    private String name;
    HighScoresManager scoresManager;

    public Game(Scanner scanner, HighScoresManager highScoresManager) {
        Random random = new Random();
        this.number = random.nextInt(1, 3);
        this.scanner = scanner;
        this.guesses = 0;
        this.scoresManager = highScoresManager;
    }


    @Override
    public void start() {
        System.out.println("Welcome to the numbers game!");
        this.name = getName();
        int input = 0;
        while (input != this.number) {
            try {
                System.out.println("Enter your guess:");
                input = Integer.parseInt(scanner.nextLine());
                guesses++;
                if (input < number) {
                    System.out.println("The number is a little bit higher!");
                }
                if (input > number) {
                    System.out.println("The number is a little bit lower!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter an integer!");
            }
        }
        System.out.printf("You guessed the number %d right!%n", this.number);


    }

    @Override
    public void end() {
        if (scoresManager.getUserScores().containsKey(this.name)) {
            if (scoresManager.getUserScores().get(this.name) < this.guesses) {
                scoresManager.addScore(this.name, this.guesses);
            }
        } else {
            scoresManager.addScore(this.name, this.guesses);
        }

    }

    @Override
    public void displayHighScores() {
        scoresManager.displayHighScores();
    }

    public String getName() {
        while (true) {
            System.out.println("Enter your name: ");
            try {
                String name = scanner.nextLine();
                if (!name.matches("[A-Za-z]+")) {
                    throw new InvalidNameException("Invalid name! Try again.");
                }
                return name;
            } catch (InvalidNameException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
