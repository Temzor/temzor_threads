package ru.code.eight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PowersOfTwoTest {
    @Test
    void whenTest() {
        assertThat(new long[] {1,2,4}).isEqualTo(PowersOfTwo.powersOfTwo(2));
        assertThat(new long[]{1}).isEqualTo(PowersOfTwo.powersOfTwo(0));
        assertThat(new long[]{1,2}).isEqualTo(PowersOfTwo.powersOfTwo(1));
        assertThat(new long[]{1,2,4,8,16}).isEqualTo(PowersOfTwo.powersOfTwo(4));
    }
}