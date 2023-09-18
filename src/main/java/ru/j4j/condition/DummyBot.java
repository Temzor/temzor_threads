package ru.j4j.condition;

public class DummyBot {
    public static String answer(String question) {
        if (question.equals("Hi, bot.")) {
            return "Hi, SmartAss.";
        } else if (question.equals("Bye.")) {
            return "See you later.";
        } else {
            return "I don't know. Please, ask another question.";
        }
    }
}
