package ru.code.eight;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CollatzConjectureTest {
    @Test
    void sampleTests() {
        assertThat(CollatzConjecture.hotpo(1)).isEqualTo(0);
        assertThat(CollatzConjecture.hotpo(5)).isEqualTo(5);
        assertThat(CollatzConjecture.hotpo(6)).isEqualTo(8);
        assertThat(CollatzConjecture.hotpo(23)).isEqualTo(15);
    }
}