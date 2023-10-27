package LU.LU17_10_2023.additionalexercises.Shape;

public class Circle extends Shape {
    double radius;

    @Override
    public double area() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double perimeter() {

        return 0;
    }
}
