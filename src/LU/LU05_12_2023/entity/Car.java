package LU.LU05_12_2023.entity;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Car implements Runnable {
    private String name;
    private int currentPosition;
    private double currentSpeed;
    private RaceTrack raceTrack;

    private double acceleration;

    public Car(String name, double acceleration, RaceTrack raceTrack) {
        this.name = name;
        this.currentPosition = 1;
        this.currentSpeed = 1;
        this.raceTrack = raceTrack;
        this.acceleration = acceleration;
    }

    @Override
    public void run() {
        while (currentPosition < RaceTrack.TRACK_LENGTH) {
            move();
            checkObstacle();
            accelerate();
        }
        System.out.println(name + " finished the race!");
    }

    private void move() {
        currentPosition += (int) currentSpeed;
        System.out.println(name + " is at position " + currentPosition);
    }


    public void accelerate() {
        currentSpeed += this.acceleration;
    }

    private void checkObstacle() {
        ArrayList<Obstacle> obstacles = raceTrack.getTrackLayout();
        for (Obstacle obstacle : obstacles) {
            if (obstacle.getPosition() == currentPosition) {
                obstacle.applyEffect(this);
            }
        }
    }

    public void encounterObstacle(Obstacle obstacle) {
        if (obstacle.getEffect() == Effect.SLOW_DOWN) {
            if (currentPosition > 1) {
                currentSpeed--; // Speed reduction
            }

        } else if (obstacle.getEffect() == Effect.STOP_TO_0) {
            System.out.println(this.name + " is temporarily stopped due to an obstacle!");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public RaceTrack getRaceTrack() {
        return raceTrack;
    }

    public void setRaceTrack(RaceTrack raceTrack) {
        this.raceTrack = raceTrack;
    }
}
