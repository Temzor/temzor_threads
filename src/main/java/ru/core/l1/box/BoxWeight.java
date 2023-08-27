package ru.core.l1.box;

public class BoxWeight extends Box {
    private double weight;

    public BoxWeight(double width, double height, double length, double weight) {
        super(width, height, length);
        this.weight = weight;
    }

    @Override
    public String showInfo() {
        return String.format("Box(width=%s ,height=%s ,length=%s, weight=%s)",
                super.getWidth(),
                super.getHeight(),
                super.getLength(),
                this.weight);
    }
}
