package ru.j4j.iterator;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.*;

class ArrayIteratorTest {
    @Test
    void whenMultiCallHasNextThenTrue() {
        ArrayIterator iterator = new ArrayIterator(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        boolean result = iterator.hasNext();
        assertThat(result).isTrue();
        iterator.next();
        assertThat(iterator.hasNext()).isTrue();
    }
    @Test
    void whenReadSequence() {
        ArrayIterator iterator = new ArrayIterator(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        assertThat(iterator.next()).isEqualTo(1);
        assertThat(iterator.next()).isEqualTo(2);
        assertThat(iterator.next()).isEqualTo(3);
    }

    @Test
    void whenNextFromEmpty() {
        ArrayIterator iterator = new ArrayIterator(
                new int[] {}
        );
        assertThatThrownBy(iterator::next).isInstanceOf(NoSuchElementException.class);
    }
}