package ru.j4j.array;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckTest {
    @Test
    void whenDataMonoByTrueThenTrue() {
        boolean[] data = new boolean[]{true, true, true};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    @Test
    void whenDataNotMonoByTrueThenFalse() {
        boolean[] data = new boolean[]{true, false, true};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }

    @Test
    void whenDataMonoByFalseThenTrue() {
        boolean[] data = new boolean[]{false, false, false};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    @Test
    void whenDataNotMonoByFalseThenFalse() {
        boolean[] data = new boolean[]{false, true, false};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }

    @Test
    public void whenAllElementsTrueThenReturnTrue() {
        boolean[] data = {true, true, true};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    @Test
    public void whenAllElementsFalseThenReturnTrue() {
        boolean[] data = {false, false, false};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotAllElementsSameThenReturnFalse() {
        boolean[] data = {true, false, true};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }

    @Test
    public void whenSingleElementTrueThenReturnTrue() {
        boolean[] data = {true};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    @Test
    public void whenSingleElementFalseThenReturnTrue() {
        boolean[] data = {false};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    @Test
    public void whenEmptyArrayThenReturnTrue() {
        boolean[] data = {};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    @Test
    public void whenFirstElementDifferentThenReturnFalse() {
        boolean[] data = {false, true, true};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }

    @Test
    public void whenLastElementDifferentThenReturnFalse() {
        boolean[] data = {true, true, false};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }
}