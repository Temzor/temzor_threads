package ru.core.l1.interfacea;

import java.util.ArrayList;

public class MainWorker {
    public static void main(String[] args) {

        Developer developer = new Developer("Vasya");
        Driver driver = new Driver("Petya");
        Cooker cooker = new Cooker("Goga");

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(developer);
        workers.add(driver);
        workers.add(cooker);

        for (Worker worker : workers) {
            worker.voice();
        }

        developer.canCodding();
        driver.canDrive();
        cooker.canCook();
    }
}
