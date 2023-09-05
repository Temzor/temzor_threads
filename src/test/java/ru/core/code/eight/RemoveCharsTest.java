package ru.core.code.eight;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveCharsTest {
    @Test
    public void thenFullStringThenWithoutFirstSymbol() {
        assertThat(RemoveChars.remove("Moroz")).isEqualTo("oro");
    }

    @Test
    public void thenSmallStringThenWithFirstSymbol() {
        assertThat(RemoveChars.remove("Po")).isEqualTo("Po");
    }

}