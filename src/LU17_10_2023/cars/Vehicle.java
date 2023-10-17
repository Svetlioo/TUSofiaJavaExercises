package LU17_10_2023.cars;

public abstract class Vehicle {
    protected int speed;


    protected void move() {
        System.out.println("Vehicle is moving");
    }

    public Vehicle(int speed) {
        this.speed = speed;
    }
}
