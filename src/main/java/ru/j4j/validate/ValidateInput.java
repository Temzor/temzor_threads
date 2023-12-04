package ru.j4j.validate;

import ru.j4j.tracker.input.Input;
import ru.j4j.tracker.output.Output;

public class ValidateInput implements Input {
    private final Output out;
    private final Input in;
    public ValidateInput(Output out, Input in) {
        this.out = out;
        this.in = in;
    }
    @Override
    public String askStr(String question) {
        return in.askStr(question);
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = in.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Пожалуйста, введите корректные данные");

            }
        } while (invalid);
        return value;
    }
}

