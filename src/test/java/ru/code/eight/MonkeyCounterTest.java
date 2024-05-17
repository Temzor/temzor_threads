package ru.code.eight;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MonkeyCounterTest {
    @Test
    void testMonkeyCounter() {
        assertThat(new int[]{1, 2}).isEqualTo(MonkeyCounter.monkeyCount(2));
        assertThat(new int[]{1, 2, 3}).isEqualTo(MonkeyCounter.monkeyCount(3));
        assertThat(new int[]{1, 2, 3, 4, 5}).isEqualTo(MonkeyCounter.monkeyCount(5));
    }
}