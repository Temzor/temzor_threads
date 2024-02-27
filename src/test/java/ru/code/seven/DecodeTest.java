package ru.code.seven;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DecodeTest {
    @Test
    void test1() {
        assertThat("scout").isEqualTo(Decode.decode(new int[] {20, 12, 18, 30, 21}, 1939));
    }

    @Test
    void test2() {
        assertThat("masterpiece").isEqualTo(Decode.decode(new int[] {14, 10, 22, 29, 6, 27, 19, 18, 6, 12, 8},
                1939));
    }
}