package ru.j4j.oop;

public class Computer {
    private final boolean multiMonitor;
    private final int ssd;
    private final String cpu;

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public String returnInfo() {
        return "Multi monitor: " + multiMonitor + "/nSSD: " + ssd + " GB" + "/nModel CPU: " + cpu;
    }
}
