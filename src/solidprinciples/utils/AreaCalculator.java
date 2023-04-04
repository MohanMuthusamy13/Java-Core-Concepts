package solidprinciples.utils;

import solidprinciples.shapesInterfaces.Shape;

import java.util.List;

public final class AreaCalculator {

    public static double calculateArea(List<Shape> shapes) {
        int sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }
}