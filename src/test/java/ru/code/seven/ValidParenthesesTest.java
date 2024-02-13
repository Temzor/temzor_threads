package ru.code.seven;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {
    @Test
    @DisplayName("Should return true for valid parentheses")
    void validCases() {
        runTest(true, "()");
        runTest(true, "((()))");
        runTest(true, "()()()");
        runTest(true, "(()())()");
        runTest(true, "()(())((()))(())()");
    }

    @Test
    @DisplayName("Should return false for invalid parentheses")
    void invalidCases() {
        runTest(false, ")(");
        runTest(false, "()()(");
        runTest(false, "((())");
        runTest(false, "())(()");
        runTest(false, ")()");
        runTest(false, ")");
    }

    @Test
    @DisplayName("Should return true for empty strings")
    void emptyString() {
        runTest(true, "");
    }

    private void runTest(boolean expected, String input) {
        assertThat(expected).isEqualTo(ValidParentheses.validParentheses(input));
    }
}