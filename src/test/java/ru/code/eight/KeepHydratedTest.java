package ru.code.eight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KeepHydratedTest {
    KeepHydrated kh = new KeepHydrated();

    @Test
    public void sampleTest1() {
        assertThat(1).isEqualTo(kh.liters(2));
    }

    @Test
    public void sampleTest2() {
        assertThat(0).isEqualTo(kh.liters(0.97));
    }

    @Test
    public void sampleTest3() {
        assertThat(7).isEqualTo(kh.liters(14.64));
    }

    @Test
    public void sampleTest4() {
        assertThat(800).isEqualTo(kh.liters(1600.20));
    }

    @Test
    public void sampleTest5() {
        assertThat(40).isEqualTo(kh.liters(80));
    }
}