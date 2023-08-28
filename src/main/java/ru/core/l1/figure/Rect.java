package ru.core.l1.figure;

public class Rect {
    private final double width;
    private final double length;

    public Rect(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double perimeter() {
        return 2 * (width + length);
    }

    public double squareRect() {
        return width * length;
    }
}
