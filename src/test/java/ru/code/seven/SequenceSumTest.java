package ru.code.seven;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SequenceSumTest {
    @Test
    @DisplayName("Sample Test Cases")
    void testSomething() {
        assertThat(12).isEqualTo(SequenceSum.sequenceSum(2, 6, 2));
        assertThat(15).isEqualTo(SequenceSum.sequenceSum(1, 5, 1));
        assertThat(5).isEqualTo(SequenceSum.sequenceSum(1, 5, 3));
        assertThat(45).isEqualTo(SequenceSum.sequenceSum(0, 15, 3));
        assertThat(0).isEqualTo(SequenceSum.sequenceSum(16, 15, 3));
    }

}