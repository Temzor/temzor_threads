package ru.j4j.iterator;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;


public class ArrayIteratorTest {

    @Test
    public void whenMultiCallhasNextThenTrue() {
        ArrayIterator iterator = new ArrayIterator(
                new int[] {1, 2, 3}
        );
        assertThat(iterator.hasNext()).isTrue();
    }

    @Test
    public void whenReadSequence() {
        ArrayIterator iterator = new ArrayIterator(
                new int[] {1, 2, 3}
        );
        assertThat(iterator.next()).isEqualTo(1);
        assertThat(iterator.next()).isEqualTo(2);
        assertThat(iterator.next()).isEqualTo(3);
    }

    @Test
    public void whenNextFromEmpty() {
        ArrayIterator iterator = new ArrayIterator(
                new int[] {}
        );
        assertThatThrownBy(iterator::next).isInstanceOf(NoSuchElementException.class);
    }
}