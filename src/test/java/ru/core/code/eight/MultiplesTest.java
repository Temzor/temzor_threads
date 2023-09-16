package ru.core.code.eight;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ru.eight.Multiples;

class MultiplesTest {
    @Test
    public void whenFiveAdnTwentyFiveLimitThenResultCorrect() {
        assertThat(new int[] {5, 10, 15, 20, 25}).isEqualTo(Multiples.find(5, 25));
    }

}