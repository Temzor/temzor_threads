package ru.core.l1;

public class Box {
    double width;
    double height;
    double length;

    public Box() {

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
