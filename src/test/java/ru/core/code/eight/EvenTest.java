package ru.core.code.eight;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ru.code.eight.Even;


class EvenTest {
    Even even = new Even();
    @Test
    public void whenEvenThenTrue() {
        assertThat(even.isEven(0)).isTrue();
    }

    @Test
    public void whenEvenThenFalse() {
        assertThat(even.isEven(0.5)).isFalse();
    }


    @Test
    public void whenEvenThenTrueToNegativeDigit() {
        assertThat(even.isEven(-4)).isTrue();
    }

}