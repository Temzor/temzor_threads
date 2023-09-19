package ru.j4j.condition;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LogicNotTest {

    @Test
    void isEven() {
        assertThat(LogicNot.isEven(4)).isTrue();
    }

    @Test
    void isPositive() {
        assertThat(LogicNot.isPositive(12)).isTrue();
    }

    @Test
    void notEven() {
        assertThat(LogicNot.notEven(3)).isTrue();
    }

    @Test
    void notPositive() {
        assertThat(LogicNot.notPositive(-6)).isTrue();
    }

    @Test
    void notEvenAndPositive() {
        assertThat(LogicNot.notEvenAndPositive(7)).isTrue();
    }

    @Test
    void evenOrNotPositive() {
        assertThat(LogicNot.evenOrNotPositive(-5)).isTrue();
    }
}