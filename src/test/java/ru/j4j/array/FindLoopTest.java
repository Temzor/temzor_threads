package ru.j4j.array;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas8ThenResultEqualFinish() {
        int[] data = new int[]{5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int el = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = new int[]{5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int el = 4;
        int start = 1;
        int finish = 8;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[]{8, 2, 10, 2, 4};
        int el = 8;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenElementFound_thenReturnIndex() {
        int[] data = {5, 10, 3, 7};
        int result = FindLoop.indexOf(data, 10);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void whenElementNotFound_thenReturnMinusOne() {
        int[] data = {5, 10, 3, 7};
        int result = FindLoop.indexOf(data, 8);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void whenElementFoundAtStart_thenReturnIndex0() {
        int[] data = {5, 10, 3, 7};
        int result = FindLoop.indexOf(data, 5);
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void whenElementFoundAtEnd_thenReturnLastIndex() {
        int[] data = {5, 10, 3, 7};
        int result = FindLoop.indexOf(data, 7);
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void whenElementFoundInRange_thenReturnIndex() {
        int[] data = {5, 10, 3, 7, 4};
        int result = FindLoop.indexInRange(data, 3, 1, 3);
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void whenElementNotFoundInRange_thenReturnMinusOne() {
        int[] data = {5, 10, 3, 7, 4};
        int result = FindLoop.indexInRange(data, 4, 1, 3);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void whenElementFoundAtStartOfRange_thenReturnStartIndex() {
        int[] data = {5, 10, 3, 7, 4};
        int result = FindLoop.indexInRange(data, 10, 1, 4);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void whenElementFoundAtEndOfRange_thenReturnEndIndex() {
        int[] data = {5, 10, 3, 7, 4};
        int result = FindLoop.indexInRange(data, 4, 1, 4);
        assertThat(result).isEqualTo(4);
    }
}