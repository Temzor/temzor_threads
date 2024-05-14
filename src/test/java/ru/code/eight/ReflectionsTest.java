package ru.code.eight;


import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReflectionsTest {
    @Test
    void whenBasicTest() {

        assertThat(new int[]{2, 2}).isEqualTo(Reflections.reflectPoint(new int[]{0, 0}, new int[]{1, 1}));
        assertThat(new int[]{-6, -18}).isEqualTo(Reflections.reflectPoint(new int[]{2, 6}, new int[]{-2, -6}));
        assertThat(new int[]{-30, 30}).isEqualTo(Reflections.reflectPoint(new int[]{10, -10}, new int[]{-10, 10}));
        assertThat(new int[]{-25, 37}).isEqualTo(Reflections.reflectPoint(new int[]{1, -35}, new int[]{-12, 1}));
        assertThat(new int[]{-1014, -443}).isEqualTo(Reflections.reflectPoint(new int[]{1000, 15}, new int[]{-7, -214}));
        assertThat(new int[]{0, 0}).isEqualTo(Reflections.reflectPoint(new int[]{0, 0}, new int[]{0, 0}));
    }
}