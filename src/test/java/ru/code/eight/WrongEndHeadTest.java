package ru.code.eight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WrongEndHeadTest {
    @Test
    void test() {
        assertThat(new String[]{"head", "body", "tail"}).isEqualTo(
                WrongEndHead.fixTheMeerkat(new String[]{"tail", "body", "head"}));
    }

}