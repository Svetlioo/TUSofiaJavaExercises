package LU.LU28_11_2023.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class HighScoresManager {
    private Map<String, Integer> userScores;
    private TreeSet<UserScore> highScores;

    public Map<String, Integer> getUserScores() {
        return userScores;
    }

    public TreeSet<UserScore> getHighScores() {
        return highScores;
    }

    public HighScoresManager() {
        this.userScores = new HashMap<>();
        this.highScores = new TreeSet<>((o1, o2) -> Integer.compare(o1.getScore(), o2.getScore()));
    }

    public void addScore(String username, int score) {
        userScores.put(username, score);
        highScores.clear();
        for (Map.Entry<String, Integer> entry : userScores.entrySet()) {
            highScores.add(new UserScore(entry.getKey(), entry.getValue()));
        }

    }

    public void displayHighScores() {
        System.out.println("Current High Scores:");
        int rank = 1;
        for (UserScore userScore : highScores) {
            System.out.println(rank + ". " + userScore.getUsername() + " - " + userScore.getScore());
            rank++;
        }
    }

    private static class UserScore {
        private String username;
        private int score;

        public UserScore(String username, int score) {
            this.username = username;
            this.score = score;
        }

        public String getUsername() {
            return username;
        }

        public int getScore() {
            return score;
        }

    }

    public void saveHighScoresToJson(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            List<UserScore> highScoresList = new ArrayList<>(highScores);
            String json = gson.toJson(highScoresList);
            writer.write(json);
            System.out.println("High scores saved to file!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}

