package LU17_10_2023.cars;

public class FamilyCar extends SimpleCar {
    private int seats;

    public FamilyCar(int speed, int seats) {
        super(speed);
        this.seats = seats;
    }

    public FamilyCar(int speed) {
        super(speed);
        this.seats = 4;
    }

    public void addSeat() {
        this.seats += 1;
    }
}
