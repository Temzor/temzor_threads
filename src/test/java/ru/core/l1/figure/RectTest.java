package ru.core.l1.figure;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Test;

class RectTest {
    @Test
    void testToRect() {
        Rect rect = new Rect(18.12f, 23.68f);
        assertThat(rect.squareRect()).isCloseTo(429f, Percentage.withPercentage(0.1f));
        assertThat(rect.perimeter()).isCloseTo(83f, Percentage.withPercentage(0.8f));
    }
}