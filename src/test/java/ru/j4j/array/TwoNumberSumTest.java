package ru.j4j.array;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoNumberSumTest {
    @Test
    void whenTwoEqualsNumbersYesTarget() {
        int[] array = {5, 5};
        int target = 10;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {0, 1};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenTwoEqualsNumbersNoTarget() {
        int[] array = {5, 5};
        int target = 12;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenWithNegativeNumbersYesTarget() {
        int[] array = {-7, -5, 0, 5, 8, 12};
        int target = 3;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {1, 4};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenWithoutNegativeNumbersYesTarget() {
        int[] array = {0, 2, 5, 8, 10, 12};
        int target = 15;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {2, 4};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenTwoEqualsNumbersNoTargetWithAlgoAccelerationCheck() {
        int[] array = {5, 5, 5, 5, 5};
        int target = 12;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenWithoutNegativeNumbersYesTargetWithAlgoAccelerationCheck() {
        int[] array = {0, 2, 5, 6, 8, 10, 12};
        int target = 11;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {2, 3};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testGetIndexesValidInput() {
        int[] array = {1, 2, 3, 4, 6};
        int target = 10;
        int[] expected = {3, 4};

        int[] result = TwoNumberSum.getIndexes(array, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testGetIndexesNoSolution() {
        int[] array = {1, 2, 3, 4, 6};
        int target = 12;

        int[] result = TwoNumberSum.getIndexes(array, target);
        assertThat(result).isEmpty();
    }

    @Test
    void testGetIndexesEmptyArray() {
        int[] array = {};
        int target = 5;

        int[] result = TwoNumberSum.getIndexes(array, target);
        assertThat(result).isEmpty();
    }

    @Test
    void testGetIndexesNullArray() {
        int[] result = TwoNumberSum.getIndexes(null, 5);
        assertThat(result).isEmpty();
    }

    @Test
    void testGetIndexesSingleElementArray() {
        int[] array = {5};
        int target = 5;

        int[] result = TwoNumberSum.getIndexes(array, target);
        assertThat(result).isEmpty();
    }
}