package ru.core.l1;

public class Box {
    double width;
    double height;
    double length;

    public void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    double volume() {
        return width * height * length;
    }
}
