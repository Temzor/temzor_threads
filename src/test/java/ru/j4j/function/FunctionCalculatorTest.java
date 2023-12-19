package ru.j4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FunctionCalculatorTest {
    @Test
    void whenLinearFunctionThenLinearResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result).containsAll(expected);
    }

    @Test
    void whenExponentialFunctionThenExponentialResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(1, 3, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(2D, 4D);
        assertThat(result).containsAll(expected);
    }

    @Test
    void whenQuadraticLinearFunctionThenQuadraticResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(18, 21, x -> Math.pow(x, 2));
        List<Double> expected = Arrays.asList(324D, 361D, 400D);
        assertThat(result).containsAll(expected);
    }
}