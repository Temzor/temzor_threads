package ru.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConverterTest {
    @Test
    void convertRublesToDollar() {
        assertThat(180f).isEqualTo(Converter.rubleToDollar(10800));
    }

    @Test
    void convertRublesToEuro() {
        assertThat(400f).isEqualTo(Converter.rubleToEuro(28000));
    }
}