package ar.edu.unrn.open_closed.c.shapes;

public class Triangle implements Shape {

    private final int base, height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return base * height / 2.0;
    }

}
