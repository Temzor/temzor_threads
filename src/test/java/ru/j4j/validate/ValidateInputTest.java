package ru.j4j.validate;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ru.j4j.tracker.input.Input;
import ru.j4j.tracker.input.MockInput;
import ru.j4j.tracker.output.Output;
import ru.j4j.tracker.output.StubOutput;

class ValidateInputTest {
    @Test
    void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new MockInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenValidInput() {
        Output out = new StubOutput();
        Input in = new MockInput(
                new String[] {"1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenSomeValidInput() {
        Output out = new StubOutput();
        Input in = new MockInput(
                new String[] {"0", "1", "2"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int[] selected = new int[3];
        selected[0] = input.askInt("Enter menu:");
        selected[1] = input.askInt("Enter menu:");
        selected[2] = input.askInt("Enter menu:");
        int[] expected = {0, 1, 2};
        assertThat(selected).isEqualTo(expected);
    }

    @Test
    void whenMinusValidInput() {
        Output out = new StubOutput();
        Input in = new MockInput(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-1);
    }
}