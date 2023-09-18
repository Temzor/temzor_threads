package ru.j4j.testvision;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class JUnitExampleTest {
    @RepeatedTest(2)
    @DisplayName("When 14 multi 8 should be 112.")
    void when14and8Then112() {
        JUnitExample jUnitExample = new JUnitExample();
        int result = jUnitExample.multiply(14, 8);
        assertThat(result).isEqualTo(112);
    }

    @Disabled("Not show this test.")
    @RepeatedTest(2)
    @DisplayName("When 15 multi 5 should be 75.")
    void when15and5Then75() {
        JUnitExample jUnitExample = new JUnitExample();
        int result = jUnitExample.multiply(15, 5);
        assertThat(result).isEqualTo(75);
    }

    @Timeout(3)
    @Test
    void when5and5then25() throws InterruptedException {
        Thread.sleep(500);
        JUnitExample example = new JUnitExample();
        int result = example.multiply(5, 5);
        assertThat(result).isEqualTo(25);
    }
}