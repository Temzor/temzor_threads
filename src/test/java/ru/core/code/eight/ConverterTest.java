package ru.core.code.eight;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConverterTest {
    @Test
    public void thenOneWhenOne() {
        assertThat(Converter.binToDecimal("1")).isEqualTo(1);
    }

    @Test
    public void thenZeroWhenZero() {
        assertThat(Converter.binToDecimal("0")).isEqualTo(0);
    }

    @Test
    public void then1001001When1001001() {
        assertThat(Converter.binToDecimal("1001001")).isEqualTo(73);
    }
}