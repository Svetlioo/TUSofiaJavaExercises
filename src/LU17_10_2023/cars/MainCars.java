package LU17_10_2023.cars;

public class MainCars {
    public static void main(String[] args) {
        SimpleCar car1 = new SimpleCar(0);
        car1.move();
        car1.honk();
        System.out.println(car1.getSpeed());
        FamilyCar car2 = new FamilyCar(0);
        System.out.println(car1.getClass());
        System.out.println(car2.getClass());
        System.out.println((car1 instanceof SimpleCar));
    }
}
