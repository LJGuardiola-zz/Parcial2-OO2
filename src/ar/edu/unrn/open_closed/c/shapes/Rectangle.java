package ar.edu.unrn.open_closed.c.shapes;

public class Rectangle implements Shape {

    private final int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

}

