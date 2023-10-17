package LU17_10_2023.additionalexercises.Car;

public class ElectricCar extends Car {
    private double batteryLevel;
    private double efficiency;

    public ElectricCar(String brand, int speed, String fuel, int mileage, double batteryLevel, double efficiency) {
        super(brand, speed, fuel, mileage);
        this.batteryLevel = batteryLevel;
        this.efficiency = efficiency;
    }

    public void charge() {
        this.batteryLevel++;
    }

    public void driveElectric(int distance) {
        if (this.batteryLevel < distance * this.efficiency) {
            System.out.println("Not enough baterry for this drive!");
            return;
        }
        this.batteryLevel -= distance * this.efficiency;
    }

}
