package ru.core.l1.figure;

public class Rect {
    private final float width;
    private final float length;

    public Rect(float width, float length) {
        this.width = width;
        this.length = length;
    }

    public float perimeter() {
        return 2 * (width + length);
    }

    public float squareRect() {
        return width * length;
    }
}
