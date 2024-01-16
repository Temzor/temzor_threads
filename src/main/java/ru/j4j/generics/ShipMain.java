package ru.j4j.generics;

public class ShipMain {
    public static void main(String[] args) {
        Human human = new Human();
        SpaceShip<Human> spaceShip = new SpaceShip<>(human);
        spaceShip.getLifeForm();
        Human humanInShip = spaceShip.getLifeForm();
    }
}
