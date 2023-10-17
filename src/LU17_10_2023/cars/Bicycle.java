package LU17_10_2023.cars;

public class Bicycle extends Vehicle {

    public Bicycle(int speed) {
        super(speed);
    }

    protected void pedal() {
        System.out.println("Pedaling the bicycle");
    }
}
