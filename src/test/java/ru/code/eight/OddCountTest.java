package ru.code.eight;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class OddCountTest {
    @Test
    public void fixedTests() {
        assertThat(7).isEqualTo(OddCount.oddCount(15));
        assertThat(7511).isEqualTo(OddCount.oddCount(15023));
    }
}