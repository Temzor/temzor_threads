package ru.j4j.loop;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CounterTest {
    @Test
    void testStart5Finish5() {
        assertThat(Counter.sum(5, 5)).isEqualTo(5);
    }

    @Test
    void testStart5Finish15() {
        assertThat(Counter.sum(5, 15)).isEqualTo(110);
    }

    @Test
    void testStartMinus5Finish2() {
        assertThat(Counter.sum(-5, 2)).isEqualTo(-12);
    }

    @Test
    void testStartMinus15FinishMinus20() {
        assertThat(Counter.sum(-15, -20)).isEqualTo(0);
    }
}