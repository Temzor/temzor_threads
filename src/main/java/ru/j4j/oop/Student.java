package ru.j4j.oop;

public class Student {
    private final String name;
    private final String surname;
    private final int age;
    private final int numberCourse;
    private final String nameCourse;

    public Student(String name, String surname, int age, int numberCourse, String nameCourse) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.numberCourse = numberCourse;
        this.nameCourse = nameCourse;
    }

    public void music() {
        System.out.println("Tra tra tra");
    }

    void sing() {
        System.out.println("I believe I can fly\"");
    }

    @Override
    public String toString() {
        return String.format("Student(name=%s ,surname=%s ,age=%s ,numberCourse=%s ,nameCourse=%s)",
                this.name,
                this.surname,
                this.age,
                this.numberCourse,
                this.nameCourse);
    }
}
