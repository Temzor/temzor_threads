package ru.j4j.oop;

import static java.lang.Math.*;

public class Triangle {
    private final Point ab;
    private final Point bc;
    private final Point ca;

    public Triangle(Point ab, Point bc, Point ca) {
        this.ab = ab;
        this.bc = bc;
        this.ca = ca;
    }

    public double semiPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public double area() {
        double ab = this.ab.distance(this.bc);
        double bc = this.ab.distance(this.ca);
        double ca = this.bc.distance(this.ca);
        if (exist(ab, bc, ca)) {
            double p = semiPerimeter(ab, bc, ca);
            return sqrt(p * (p - ab) * (p - bc) * (p - ca));
        }
        return -1;
    }
}
