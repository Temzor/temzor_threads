package ru.code.eight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class PaperTest {
    @Test
    void test() {
        assertThat(25).isEqualTo(Paper.paperWork(5,5));
        assertThat(0).isEqualTo(Paper.paperWork(-5,5));
    }
}