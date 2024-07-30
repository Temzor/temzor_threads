package ru.core.classes;

public class StaticNestedClassCar {
    String color;
    String model;
    Engine engine;
    int engineVolume;

    public StaticNestedClassCar(String color, String model, Engine engine, int engineVolume) {
        this.color = color;
        this.model = model;
        this.engine = engine;
        this.engineVolume = engineVolume;
    }


    @Override
    public String toString() {
        String sb = "Car has is {" + "color='" + color + '\''
                + ", model='" + model + '\''
                + ", engine=" + engine
                + ", engineVolume=" + engineVolume
                + '}';
        return sb;
    }

    public static class Engine {
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            String sb = "Engine has is {" + "horsePower=" + horsePower
                    + '}';
            return sb;
        }
    }
}
