package ru.j4j.converter;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConverterTest {
    @Test
    public void whenRubleToEuro() {
        assertThat(Converter.rubleToEuro(140)).isEqualTo(2);
    }

    @Test
    public void whenRubleToDollar() {
        assertThat(Converter.rubleToDollar(180)).isEqualTo(3);
    }

}