package ru.j4j.oop;

public class StNested {

    private static int num1;
    public int num2;

    public StNested() {
    }

    static class StaticNested {

        void setStaticOuterVariable(int value) {
            num1 = value;
        }

    }

    public static void main(String[] args) {
        num1 = 1;
        StaticNested nested = new StaticNested();
        nested.setStaticOuterVariable(2);
        System.out.println("num1 = " + num1);
    }
}
