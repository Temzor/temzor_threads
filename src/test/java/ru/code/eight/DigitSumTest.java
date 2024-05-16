package ru.code.eight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DigitSumTest {
    @Test
    void testDigitSum() {
        assertThat(15).isEqualTo(DigitSum.digitSum(12345));
        assertThat(19).isEqualTo(DigitSum.digitSum(181216));
        assertThat(38).isEqualTo(DigitSum.digitSum(6418496));
    }
}