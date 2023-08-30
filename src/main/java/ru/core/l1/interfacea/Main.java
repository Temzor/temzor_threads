package ru.core.l1.interfacea;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();
        Bird bird = new Bird();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(fish);
        animals.add(bird);

        for (Animal animal : animals) {
            animal.eat();
        }

        Dog firstDog = new Dog();
        Dog secondDog = new Dog();
        Dog thirdDog = new Dog();
        Dog fourthDog = new Dog();
        Dog fifthDog = new Dog();
        Cat firstCat = new Cat();
        Cat secondCat = new Cat();
        Cat thirdCat = new Cat();
        Cat fourthCat = new Cat();
        Cat fifthCat = new Cat();
        Bird firstBird = new Bird();
        Bird secondBird = new Bird();
        Bird thirdBird = new Bird();
        Bird fourthBird = new Bird();
        Bird fifthBird = new Bird();

        ArrayList<CanRun> canRunArrayList = new ArrayList<>();
        canRunArrayList.add(firstDog);
        canRunArrayList.add(secondDog);
        canRunArrayList.add(thirdDog);
        canRunArrayList.add(fourthDog);
        canRunArrayList.add(fifthDog);
        canRunArrayList.add(firstCat);
        canRunArrayList.add(secondCat);
        canRunArrayList.add(thirdCat);
        canRunArrayList.add(fourthCat);
        canRunArrayList.add(fifthCat);
        canRunArrayList.add(firstBird);
        canRunArrayList.add(secondBird);
        canRunArrayList.add(thirdBird);
        canRunArrayList.add(fourthBird);
        canRunArrayList.add(fifthBird);

        for (CanRun animal : canRunArrayList) {
            animal.run();
        }
        Flyable flyable = new Bird();
        flyable.fly();
    }
}
