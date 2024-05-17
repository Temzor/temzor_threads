package ru.code.eight;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MilesPerGallonTest {
    @Test
    public void test1() {
        assertThat(3.54f).isCloseTo(MilesPerGallon.mpgToKPM(10), Percentage.withPercentage(0.01f));
    }

    @Test
    public void test2() {
        assertThat(7.08f).isCloseTo(MilesPerGallon.mpgToKPM(20), Percentage.withPercentage(0.01f));
    }

    @Test
    public void test3() {
        assertThat(10.62f).isCloseTo(MilesPerGallon.mpgToKPM(30), Percentage.withPercentage(0.01f));
    }
}