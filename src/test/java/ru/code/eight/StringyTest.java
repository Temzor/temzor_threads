package ru.code.eight;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

class StringyTest {
    @Test
    public void startTest() {
        assertThat("10").isEqualTo(Stringy.stringy(2));
    }

    @Test
    public void lengthTests() {
        Random randGen = new Random();
        for (int i = 0; i < 10; i++) {
            int size = randGen.nextInt(50);
            assertThat("1010101010").isEqualTo(Stringy.stringy(10));
        }
    }
}