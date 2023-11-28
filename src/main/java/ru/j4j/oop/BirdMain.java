package ru.j4j.oop;

public class BirdMain {
    public static void main(String[] args) {
        Bird parrot = new Bird() {
            @Override
            public void fly() {
                System.out.println("Попугай пролетает над лужайкой");
            }

            public void flyInside() {
                System.out.println("Попугай летает только внутри анонимного класса");
            }
        };
    }
}
