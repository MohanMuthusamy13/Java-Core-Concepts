package solidprinciples.shapes;

import solidprinciples.shapesInterfaces.Shape;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public final class Circle implements Shape {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return PI * (pow(getRadius(), 2));
    }
}