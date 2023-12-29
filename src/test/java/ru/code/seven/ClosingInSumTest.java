package ru.code.seven;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ClosingInSumTest {
    @Test
    @DisplayName("Fixed Basic Tests")
    void testFixedBasic() {
        assertThat(ClosingInSum.closingInSum(121L)).isEqualTo(13);
        assertThat(ClosingInSum.closingInSum(5332824166496569L)).isEqualTo(331);
        assertThat(ClosingInSum.closingInSum(1795459644013947776L)).isEqualTo(548);
        assertThat(ClosingInSum.closingInSum(2801980378842185820L)).isEqualTo(426);
        assertThat(ClosingInSum.closingInSum(3440584288422776554L)).isEqualTo(430);
        assertThat(ClosingInSum.closingInSum(1985124000275401986L)).isEqualTo(342);
    }

}