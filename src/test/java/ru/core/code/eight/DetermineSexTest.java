package ru.core.code.eight;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ru.code.eight.DetermineSex;

class DetermineSexTest {
    @Test
    public void whenXXThenSon() {
        assertThat(DetermineSex.chromosomeCheck("XX"))
                .isEqualTo("Congratulations! You're going to have a son.");
    }

    @Test
    public void whenXYThenDaughter() {
        assertThat(DetermineSex.chromosomeCheck("XY"))
                .isEqualTo("Congratulations! You're going to have a daughter.");
    }

}