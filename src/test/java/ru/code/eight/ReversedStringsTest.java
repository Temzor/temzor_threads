package ru.code.eight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReversedStringsTest {
    @Test
    void testReversedStrings() {
        assertThat("Kata").isEqualTo(ReversedStrings.reverse("ataK"));
    }
}