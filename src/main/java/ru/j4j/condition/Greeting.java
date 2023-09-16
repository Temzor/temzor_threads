package ru.j4j.condition;

public class Greeting {
    private static final String IDEA = "I like Java!";


    public static void main(String[] args) {
        System.out.println(IDEA);

    }

    public String getIdea() {
        return IDEA;
    }
}
