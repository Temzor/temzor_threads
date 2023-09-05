package ru.core.code.eight;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DinglemouseTest {
    @Test
    public void whenStringContainsDotsThenResulTire() {
        System.out.println();
        assertThat("one-two-three").isEqualTo(Dinglemouse.replaceDots("one.two.three"));
    }
}