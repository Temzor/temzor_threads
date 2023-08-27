package ru.core.l1.temp;

public class Box {
    private double width;
    private double height;
    private double length;

    public Box(double width, double height, double length) {

        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(Box box) {
        this.width = box.width;
        this.height = box.height;
        this.length = box.length;
    }

    public double volume() {
        return width * height * length;
    }

    public int compare(Box box) {
        double thisVolume = volume();
        double boxVolume = box.volume();
        if (thisVolume > boxVolume) {
            return 1;
        } else if (thisVolume < boxVolume) {
            return -1;
        } else {
            return 0;
        }
    }
}
