package ru.core.l1.figureOOP;

public abstract class Figure {
    private final double a;
    private final double b;

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double area();

    public final double getA() {
        return a;
    }

    public final double getB() {
        return b;
    }
}
