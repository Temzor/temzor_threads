package ru.j4j.generics;

import lombok.Getter;


@Getter
public class SpaceShip<T extends LifeForm> {
    private final T lifeForm;

    public SpaceShip(T lifeForm) {
        this.lifeForm = lifeForm;
    }

    public void showLifeForm() {
        System.out.println(lifeForm.getNameForm());
    }
}
