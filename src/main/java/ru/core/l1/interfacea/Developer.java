package ru.core.l1.interfacea;

public class Developer extends Worker implements CanCodding {
    public Developer(String name) {
        super(name);
    }


    @Override
    public void canCodding() {
        System.out.println("Write code");
    }
}
