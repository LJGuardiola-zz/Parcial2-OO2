package ar.edu.unrn.open_closed.c;

import ar.edu.unrn.open_closed.c.shapes.Shape;

import java.util.Arrays;

public class AreaCalculator {
    public double computeArea(Shape... shapes) {
        return Arrays.stream(shapes).mapToDouble(Shape::area).sum();
    }
}
