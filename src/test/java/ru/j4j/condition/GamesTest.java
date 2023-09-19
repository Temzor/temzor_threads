package ru.j4j.condition;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GamesTest {
    @Test
    void whenMoneyTrueParentTrueThenTrue() {
        assertThat(Games.permission(true, true))
                .isEqualTo("I can go to the computer club.");
    }

    @Test
    void whenMoneyFalseParentTrueThenFalse() {
        assertThat(Games.permission(true, false))
                .isEqualTo("I can't.");
    }

    @Test
    void whenMoneyTrueParentFalseThenFalse() {
        assertThat(Games.permission(false, true))
                .isEqualTo("I can't.");
    }

    @Test
    void whenMoneyFalseParentFalseThenFalse() {
        assertThat(Games.permission(false, false))
                .isEqualTo("I can't.");
    }
}