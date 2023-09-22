package ru.j4j.loop;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoopForTest {
    @Test
    void testSum5() {
        assertThat(LoopFor.loop(5)).isEqualTo(15);
    }

    @Test
    void testSum0() {
        assertThat(LoopFor.loop(0)).isEqualTo(0);
    }

    @Test
    void testIndexMinus6() {
        assertThat(LoopFor.loop(-6)).isEqualTo(0);
    }
}