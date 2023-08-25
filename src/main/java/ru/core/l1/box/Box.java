package ru.core.l1.box;

public class Box {
    double width;
    double height;
    double length;

    Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box(double size) {
        width = size;
        height = size;
        length = size;
    }

    Box() {
        width = 0;
        height = 0;
        length = 0;
    }

    Box(Box box) {
        this.width = box.width;
        this.height = box.height;
        this.length = box.length;
    }

    //Ваше решение может отличаться, я сделал так: если мы просто у новой коробки укажем длину и ширину и высоту равную сумме двух коробок,
    //то получившаяся коробка по объему однозначно получится больше суммы тех двух коробок.
    Box(Box box1, Box box2) {
        this.width = box1.width + box2.width;
        this.length = box1.length + box2.length;
        this.height = box1.height + box2.height;
    }

    void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box increase(int i) {
        return new Box(width *i, height * i, length * i);
    }

    Box sumBox(Box box) {
        return new Box(this.width + box.width, this.height + box.height, this.length + box.length);
    }

    double volume() {
        return width * height * length;
    }

    void showVolume() {
        System.out.println(volume());
    }

    int compare(Box box) {
        double thisVolume = volume();
        double boxVolume = box.volume();
        int result;
        if (thisVolume > boxVolume) {
            result = 1;
        } else if (thisVolume < boxVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }
}