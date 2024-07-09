package ru.j4j.collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ListUtilsTest {

    private List<Integer> input;

    @BeforeEach
    void setUp() {
        input = new ArrayList<>(Arrays.asList(1, 3));
    }

    @Test
    void whenAddBeforeLast() {
        ListUtils.addBefore(input, 1, 2);
        assertThat(input).hasSize(3).containsSequence(1, 2, 3);
    }

    @Test
    void whenAddBeforeFirst() {
        ListUtils.addBefore(input, 0, 2);
        assertThat(input).hasSize(3).containsSequence(2, 1, 3);
    }

    @Test
    void whenAddBeforeWithInvalidIndex() {
        assertThatThrownBy(() -> ListUtils.addBefore(input, 2, 2))
                .isInstanceOf(IndexOutOfBoundsException.class);
    }

    @Test
    void whenAddAfterFirst() {
        ListUtils.addAfter(input, 0, 2);
        assertThat(input).hasSize(3).containsSequence(1, 2, 3);
    }

    @Test
    void whenAddAfterLast() {
        ListUtils.addAfter(input, 1, 2);
        assertThat(input).hasSize(3).containsSequence(1, 3, 2);
    }

    @Test
    void whenAddAfterWithInvalidIndex() {
        assertThatThrownBy(() -> ListUtils.addAfter(input, 2, 2))
                .isInstanceOf(IndexOutOfBoundsException.class);
    }

    @Test
    void whenRemoveIfThenEmptyResult() {
        ListUtils.removeIf(input, (p) -> p < 4);
        assertThat(input).isEmpty();
    }

    @Test
    void whenRemoveIfThenAllIsStay() {
        ListUtils.removeIf(input, (p) -> p > 4);
        assertThat(input).containsExactly(1, 3);
    }

    @Test
    void whenRemoveIf1Then3() {
        ListUtils.removeIf(input, (p) -> p == 1);
        assertThat(input).containsExactly(3);
    }

    @Test
    void whenReplaceIfThenAllIsStay() {
        ListUtils.replaceIf(input, (p) -> p > 4, 4);
        assertThat(input).containsExactly(1, 3);
    }

    @Test
    void whenReplaceIfThenAll4() {
        ListUtils.replaceIf(input, (p) -> p < 4, 4);
        assertThat(input).containsExactly(4, 4);
    }

    @Test
    void whenReplaceIf1Then4() {
        ListUtils.replaceIf(input, (p) -> p == 1, 4);
        assertThat(input).containsExactly(4, 3);
    }

    @Test
    void whenRemoveAllIsEmptyThenAllIsStay() {
        ListUtils.removeAll(input, List.of());
        assertThat(input).containsExactly(1, 3);
    }

    @Test
    void whenRemoveAllThenIsEmpty() {
        ListUtils.removeAll(input, List.of(1, 3));
        assertThat(input).isEmpty();
    }

    @Test
    void whenRemoveAll1Then3() {
        ListUtils.removeAll(input, List.of(1));
        assertThat(input).containsExactly(3);
    }
}