package LU.LU17_10_2023.additionalexercises.Car;

public class Car {
    protected String brand;
    protected int speed;
    protected String fuel;
    protected int mileage;

    public void accelerate() {
        this.speed++;
    }

    public void refuel() {
        this.mileage++;
    }

    public Car(String brand, int speed, String fuel, int mileage) {
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
        this.mileage = mileage;
    }

    public void drive(int distance) {
        if (distance / 7 > this.mileage) {
            System.out.println("Not enough fuel for this drive!");
            return;
        }
        this.mileage -= distance / 7;
    }
}
