package ru.j4j.condition;

public class DummyBot {
    public static String answer(String question) {
        if ("Hi, bot.".equals(question)) {
            return "Hi, SmartAss.";
        } else if ("Bye.".equals(question)) {
            return "See you later.";
        } else {
            return "I don't know. Please, ask another question.";
        }
    }
}
