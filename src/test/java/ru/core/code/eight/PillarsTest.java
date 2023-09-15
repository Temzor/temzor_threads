package ru.core.code.eight;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PillarsTest {
    @Test
    void basicTest1() {
        assertThat(0).isEqualTo(Pillars.pillars(1, 10, 10));
    }

    @Test
    void basicTest2() {
        assertThat(2000).isEqualTo(Pillars.pillars(2, 20, 25));
    }

    @Test
    void basicTest3() {
        assertThat(15270).isEqualTo(Pillars.pillars(11, 15, 30));
    }
}