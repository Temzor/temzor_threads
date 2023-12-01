package ru.j4j.oop;

public class Student {
    private  String name;
    private  String surname;
    private  int age;
    private  int numberCourse;
    private  String nameCourse;

    public Student(String name, String surname, int age, int numberCourse, String nameCourse) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.numberCourse = numberCourse;
        this.nameCourse = nameCourse;
    }

    public Student() {

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
