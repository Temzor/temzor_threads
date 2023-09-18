package ru.j4j.condition;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameTest {
    @Test
    void testSuperMario() {
        assertThat(Game.menu("super mario"))
                .isEqualTo("Start - super mario.");
    }

    @Test
    void testTetris() {
        assertThat(Game.menu("tetris"))
                .isEqualTo("Start - tetris.");
    }

    @Test
    void testDonTKnow() {
        assertThat(Game.menu("battle toads and double dragon"))
                .isEqualTo("I do not know what start.");
    }
}