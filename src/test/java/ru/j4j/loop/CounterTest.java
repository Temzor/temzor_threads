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

    @Test
    void testStart5Finish5ByEven() {
        assertThat(Counter.sumByEven(5, 5)).isEqualTo(0);
    }

    @Test
    void testStart5Finish15yEven() {
        assertThat(Counter.sumByEven(5, 15)).isEqualTo(50);
    }

    @Test
    void testStartMinus5Finish2yEven() {
        assertThat(Counter.sumByEven(-5, 2)).isEqualTo(-4);
    }

    @Test
    void testStartMinus15FinishMinus20yEven() {
        assertThat(Counter.sumByEven(-15, -20)).isEqualTo(0);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }
}