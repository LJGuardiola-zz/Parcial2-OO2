package ar.edu.unrn.open_closed.a;

import java.util.Arrays;

public class AreaCalculator {
    public int computeArea(Rectangle... rectangles) {
        return Arrays.stream(rectangles)
                .mapToInt(
                        rectangle -> rectangle.getWidth() * rectangle.getHeight()
                ).sum();
    }
}
