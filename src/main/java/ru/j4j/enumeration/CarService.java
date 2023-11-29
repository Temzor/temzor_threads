package ru.j4j.enumeration;

import static ru.j4j.enumeration.Status.*;

public class CarService {
    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Status Toyota: " + toyota);
        System.out.println("Status Volvo: " + volvo);

        Order order = new Order(1, "Mercedes-Benz GLS", IN_WORK);
        System.out.println("Заказ-наряд №" + order.getNumber() + " на автомобиль " + order.getCar()
                + ", статус ремонта: " + order.getStatus());

        System.out.println(order);

        Order orderFirst = new Order(1, "Mercedes-Benz GLS", IN_WORK);
        System.out.println("Заказ-наряд №" + orderFirst.getNumber() + " на автомобиль " + orderFirst.getCar()
                + ", статус ремонта: " + orderFirst.getStatus().getInfo());

        Status[] statuses = Status.values();
        for (Status s : statuses) {
            System.out.println("Название статуса: " + s.name() + ", Порядковый номер статуса: " + s.ordinal());
        }

        Status[] statusesFirst = Status.values();

    }
}
