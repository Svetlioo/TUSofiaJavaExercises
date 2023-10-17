package LU17_10_2023.cars;

public class SimpleCar extends Vehicle implements Honkable {
    public int getSpeed() {
        return speed;
    }
    public SimpleCar(int speed) {
        super(speed);

    }
    private void accelerate() {
        this.speed += 10;
    }

    @Override
    public void honk() {
        System.out.println("Honk!");
    }
}
