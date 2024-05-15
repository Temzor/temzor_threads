package ru.code.eight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SmashWordsTest {
    @Test
    public void test_trimmed_values() {
        String result = SmashWords.smash("Hello", "World");
        assertThat("Hello World").isEqualTo(result);
    }

}