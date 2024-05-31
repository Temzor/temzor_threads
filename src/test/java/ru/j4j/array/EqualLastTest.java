package ru.j4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EqualLastTest {

    @Test
    public void whenLastElementsAreEqualThenReturnTrue() {
        int[] left = {1, 2, 3};
        int[] right = {4, 5, 3};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isTrue();
    }

    @Test
    public void whenLastElementsAreNotEqualThenReturnFalse() {
        int[] left = {1, 2, 3};
        int[] right = {4, 5, 6};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isFalse();
    }

    @Test
    public void whenLeftArrayIsEmptyThenReturnFalse() {
        int[] left = {};
        int[] right = {1, 2, 3};
        try {
            EqualLast.check(left, right);
        } catch (ArrayIndexOutOfBoundsException e) {
            assertThat(e).isInstanceOf(ArrayIndexOutOfBoundsException.class);
        }
    }

    @Test
    public void whenRightArrayIsEmptyThenReturnFalse() {
        int[] left = {1, 2, 3};
        int[] right = {};
        try {
            EqualLast.check(left, right);
        } catch (ArrayIndexOutOfBoundsException e) {
            assertThat(e).isInstanceOf(ArrayIndexOutOfBoundsException.class);
        }
    }

    @Test
    public void whenBothArraysAreEmptyThenReturnFalse() {
        int[] left = {};
        int[] right = {};
        try {
            EqualLast.check(left, right);
        } catch (ArrayIndexOutOfBoundsException e) {
            assertThat(e).isInstanceOf(ArrayIndexOutOfBoundsException.class);
        }
    }

    @Test
    public void whenLastElementsAreEqualSingleElementArraysThenReturnTrue() {
        int[] left = {3};
        int[] right = {3};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isTrue();
    }

    @Test
    public void whenLastElementsAreNotEqualSingleElementArraysThenReturnFalse() {
        int[] left = {3};
        int[] right = {4};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isFalse();
    }
}