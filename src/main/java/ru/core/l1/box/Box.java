package ru.core.l1.box;

public class Box {
    private double width;
    private double height;
    private double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
        public String showInfo() {
        return String.format("Box(width=%s ,height=%s ,length=%s)",
                this.width,
                this.height,
                this.length);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }
}