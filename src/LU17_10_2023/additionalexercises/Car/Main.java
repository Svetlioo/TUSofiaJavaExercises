package LU17_10_2023.additionalexercises.Car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car1 = new ElectricCar("Tesla", 200, "Nema", 800, 12, 1.20);
        Car car2 = new Car("Mercedes", 250, "Nafta", 5);
        Car car3 = new Car("Bmw", 260, "Nafta", 160);
        Car car4 = new Car("Mercedes", 270, "Nafta", 1200);
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        for (Car car : cars) {
            if ((car instanceof ElectricCar)) {
                ((ElectricCar) car).driveElectric(50);
            } else {
                car.drive(60);
            }
        }

    }
}
