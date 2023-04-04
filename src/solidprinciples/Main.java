package solidprinciples;

import solidprinciples.shapes.Circle;
import solidprinciples.shapes.Square;
import solidprinciples.shapesInterfaces.Shape;
import solidprinciples.utils.ShapesPrinter;

import java.util.Arrays;
import java.util.List;

public class  Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        List<Shape> shapes = Arrays.asList(circle, square);


        ShapesPrinter.printAreaInJson(shapes);
    }
}