package ru.code.seven;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DingleMouseTest {
    @Test
    public void test1() {
        assertThat(new long[] {1, 1}).isEqualTo(DingleMouse.clonewars(1));
    }

    @Test
    public void test5() {
        assertThat(new long[] {16, 57}).isEqualTo(DingleMouse.clonewars(5));
    }

    @Test
    public void test10() {
        assertThat(new long[] {512, 2036}).isEqualTo(DingleMouse.clonewars(10));
    }
}