package ru.code.seven;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlphabetTest {
    @Test
    void test1() {
        assertThat(4L).isEqualTo(Alphabet.alphabet(new long[] {2L, 3L, 4L, 1L, 12L, 6L, 2L, 4L}));
    }

    @Test
    void test2() {
        assertThat(7L).isEqualTo(Alphabet.alphabet(new long[] {2L, 6L, 7L, 3L, 14L, 35L, 15L, 5L}));
    }

    @Test
    void test3() {
        assertThat(5L).isEqualTo(Alphabet.alphabet(new long[] {20L, 10L, 6L, 5L, 4L, 3L, 2L, 12L}));
    }

    @Test
    void test4() {
        assertThat(7L).isEqualTo(Alphabet.alphabet(new long[] {2L, 6L, 18L, 3L, 6L, 7L, 42L, 14L}));
    }

    @Test
    void test5() {
        assertThat(20L).isEqualTo(Alphabet.alphabet(new long[] {7L, 96L, 8L, 240L, 12L, 140L, 20L, 56L}));
    }

    @Test
    void test6() {
        assertThat(7L).isEqualTo(Alphabet.alphabet(new long[] {20L, 30L, 6L, 7L, 4L, 42L, 28L, 5L}));
    }
}