package ru.j4j.polymorph;

public class Main {
    public static void main(String[] args) {
        Vehicle townCar = new TownCar();
        SportCar sportCar = new SportCar();
        System.out.println("-=Town car=-");
        townCar.changeGear();
        townCar.accelerate();
        townCar.steer();
        townCar.brake();
        System.out.println("-=Sport car=-");
        sportCar.changeGear();
        sportCar.accelerate();
        sportCar.steer();
        sportCar.brake();
        sportCar.refill();

        ((Vehicle) sportCar).changeGear();
        ((Vehicle) sportCar).accelerate();
        ((Vehicle) sportCar).steer();
        ((Vehicle) sportCar).brake();
        ((Fuel) sportCar).refill();

        Vehicle.getDragCoefficient();

    }
}
