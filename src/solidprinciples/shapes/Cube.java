package solidprinciples.shapes;

import solidprinciples.shapesInterfaces.Shape;
import solidprinciples.shapesInterfaces.ThreeDimensionalShapes;

public class Cube implements Shape, ThreeDimensionalShapes {

    private final int length;

    public Cube(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double area() {
        return 6 * Math.pow(getLength(), 2);
    }

    @Override
    public double volume() {
        return Math.pow(getLength(), 3);
    }
}