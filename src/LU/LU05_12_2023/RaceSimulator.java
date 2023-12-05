package LU.LU05_12_2023;

import LU.LU05_12_2023.entity.Car;
import LU.LU05_12_2023.entity.RaceTrack;

public class RaceSimulator {
    public static void main(String[] args) throws InterruptedException {
        RaceTrack raceTrack = new RaceTrack();
        raceTrack.generateTrackLayout(RaceTrack.TRACK_LENGTH);

        Car car1 = new Car("BMW E92 330xi", 2, raceTrack);
        Car car2 = new Car("Mercedes CLS 500", 3, raceTrack);
        Car car3 = new Car("Opel Combo Nardo Gray", 1, raceTrack);

        raceTrack.addCar(car1);
        raceTrack.addCar(car2);
        raceTrack.addCar(car3);
        Thread car1Thread = new Thread(car1);
        Thread car2Thread = new Thread(car2);
        Thread car3Thread = new Thread(car3);


        car1Thread.start();
        car2Thread.start();
        car3Thread.start();

        car1Thread.join();
        car2Thread.join();
        car3Thread.join();

        System.out.println("Race finished!");

        raceTrack.displayRaceProgress();

        Car winner = raceTrack.determineWinner();
        System.out.println("Winner: " + winner.getName() + " at position " + winner.getCurrentPosition());
    }
}

