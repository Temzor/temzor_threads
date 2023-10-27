package ru.j4j.oop;

public class Battery {
    public int load;

    public Battery(int load) {
        this.load = load;
    }

    public String about() {
        return "My charge: " + load + "%";
    }

    public void exchange(Battery battery) {
        battery.load = battery.load + this.load;
        this.load = 0;
    }
}
