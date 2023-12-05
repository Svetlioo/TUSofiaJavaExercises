package LU.LU05_12_2023.entity;

import java.util.*;

public class RaceTrack {
    public static final int TRACK_LENGTH = 100;
    ArrayList<Obstacle> trackLayout;
    private List<Obstacle> obstacles;
    private List<Car> cars;

    public List<Obstacle> getObstacles() {
        return obstacles;
    }

    public List<Car> getCars() {
        return cars;
    }

    public RaceTrack() {
        this.trackLayout = new ArrayList<>();
        cars = new ArrayList<>();
    }

    public void generateTrackLayout(int trackLength) {
        Random random = new Random();
        int numObstacles = random.nextInt(21) + 10; // Random number of obstacles between 10 and 30
        for (int i = 0; i < numObstacles; i++) {
            int position = random.nextInt(trackLength - 1) + 1;
            int effect = random.nextInt(2);
            switch (effect) {
                case 0 -> trackLayout.add(new Obstacle(position, Effect.STOP_TO_0));
                case 1 -> trackLayout.add(new Obstacle(position, Effect.SLOW_DOWN));
            }
        }
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void displayRaceProgress() {
        System.out.println("Race Progress:");
        for (Car car : cars) {
            System.out.println(car.getName() + ": " + car.getCurrentPosition());
        }
        System.out.println();
    }

    public Car determineWinner() {
        return Collections.max(cars, Comparator.comparingInt(Car::getCurrentPosition));
    }

    public ArrayList<Obstacle> getTrackLayout() {
        return trackLayout;
    }
}
