package ru.j4j.array;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isFalse();
    }

    @Test
    public void whenPrefixMatchesThenReturnTrue() {
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        char[] pref = {'h', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isTrue();
    }

    @Test
    public void whenPrefixDoesNotMatchThenReturnFalse() {
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        char[] pref = {'h', 'a'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isFalse();
    }

    @Test
    public void whenPrefixIsLongerThanWordThenReturnFalse() {
        char[] word = {'h', 'i'};
        char[] pref = {'h', 'i', 't', 'h', 'e', 'r', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isFalse();
    }

    @Test
    public void whenPrefixIsEmptyThenReturnTrue() {
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        char[] pref = {};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isTrue();
    }

    @Test
    public void whenWordIsEmptyThenReturnFalse() {
        char[] word = {};
        char[] pref = {'h', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isFalse();
    }

    @Test
    public void whenBothWordAndPrefixAreEmptyThenReturnTrue() {
        char[] word = {};
        char[] pref = {};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isTrue();
    }
}