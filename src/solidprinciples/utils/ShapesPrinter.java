package solidprinciples.utils;

import solidprinciples.shapesInterfaces.Shape;

import java.util.List;

import static solidprinciples.utils.AreaCalculator.calculateArea;

public class ShapesPrinter {

    public static void printAreaInJson(List<Shape> shapes) {
        System.out.printf("{shapesArea : %.2f}\n", calculateArea(shapes));
    }

    public static void printAreaInCSV(List<Shape> shapes) {
        System.out.printf("shapesArea,%.2f\n", calculateArea(shapes));
    }

}