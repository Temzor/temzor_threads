package ru.core.code.eight;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ru.code.eight.RemoveEveryOther;

class RemoveEveryOtherTest {
    @Test
    void whenThreeElementsThenOutTwoElements() {
        assertThat(RemoveEveryOther.removeEveryOther(new Object[] {"Hello", "Goodbye", "Hello Again"}))
                .isEqualTo(new Object[] {"Hello", "Hello Again"});
    }

    @Test
    void whenTwoElementsThenOutOneElement() {
        assertThat(RemoveEveryOther.removeEveryOther(new Object[] {new Object[] {1, 2}}))
                .isEqualTo(new Object[] {new Object[] {1, 2}});
    }

    @Test
    void whenTenElementsThenOutFiveElements() {
        assertThat(RemoveEveryOther.removeEveryOther(new Object[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}))
                .isEqualTo(new Object[] {1, 3, 5, 7, 9});
    }
    @Test
    void whenOneElementThenOutOneElement() {
        assertThat(RemoveEveryOther.removeEveryOther(new Object[] {"Goodbye"}))
                .isEqualTo(new Object[] {"Goodbye"});
    }

    @Test
    void whenEmptyElementThenOutEmptyElement() {
        assertThat(RemoveEveryOther.removeEveryOther(new Object[] {}))
                .isEqualTo(new Object[] {});
    }

}