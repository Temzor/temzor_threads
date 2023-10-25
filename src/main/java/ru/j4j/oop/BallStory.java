package ru.j4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();
        hare.tryEat(ball);
        fox.tryEat(ball);
    }
}
