package ar.edu.unrn.open_closed.b;

import ar.edu.unrn.open_closed.b.shapes.Rectangle;
import ar.edu.unrn.open_closed.b.shapes.Triangle;

import java.util.Arrays;

public class AreaCalculator {
    public int computeArea(Object... shapes) {
        return Arrays.stream(shapes)
                .mapToInt(shape -> {
                    if (shape instanceof Rectangle) {
                        Rectangle rectangle = (Rectangle) shape;
                        return rectangle.getWidth() * rectangle.getHeight();
                    } else if (shape instanceof Triangle) {
                        Triangle triangle = (Triangle) shape;
                        return (triangle.getBase() * triangle.getHeight()) / 2;
                    } else throw new RuntimeException("Forma inválida.");
                }).sum();
    }
}

