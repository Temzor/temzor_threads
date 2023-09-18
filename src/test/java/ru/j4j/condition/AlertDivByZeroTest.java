package ru.j4j.condition;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlertDivByZeroTest {
    @Test
    void whenNumberIs5ThenPositive() {
        assertThat(AlertDivByZero.possibleDiv(5))
                .isEqualTo("This is positive number");
    }

    @Test
    void whenNumberIs0ThenZero() {
        assertThat(AlertDivByZero.possibleDiv(0))
                .isEqualTo("Could not div by 0.");
    }
    @Test
    void whenNumberIsMinus2ThenZero() {
        assertThat(AlertDivByZero.possibleDiv(-2))
                .isEqualTo("This is negative number");
    }
}