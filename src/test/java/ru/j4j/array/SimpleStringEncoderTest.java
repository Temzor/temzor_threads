package ru.j4j.array;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleStringEncoderTest {
    @Test
    void whenStringabcThenResultabc() {
        String input = "abc";
        String expected = "abc";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStringaaabbcThenResulta3b2c() {
        String input = "aaabbc";
        String expected = "a3b2c";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStringabbcccThenResulta2b3c() {
        String input = "abbccc";
        String expected = "ab2c3";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStringaaabccThenResulta3bc2() {
        String input = "aaabcc";
        String expected = "a3bc2";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStringaaabbbcccThenResulta3b3c3() {
        String input = "aaabbbccc";
        String expected = "a3b3c3";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStringaaaaaaaaaaaabbbcddddThenResulta12b3cd4() {
        String input = "aaaaaaaaaaaabbbcdddd";
        String expected = "a12b3cd4";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStringaaabbbbaaabbcccdddddThenResulta3b4a3b2c3d5() {
        String input = "aaabbbbaaabbcccddddd";
        String expected = "a3b4a3b2c3d5";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testEncodeWithRepeatingCharacters() {
        String input = "aaabbc";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo("a3b2c");
    }

    @Test
    void testEncodeWithSingleCharacters() {
        String input = "abc";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo("abc");
    }

    @Test
    void testEncodeWithEmptyString() {
        String input = "";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo("");
    }

    @Test
    void testEncodeWithNullInput() {
        String input = null;
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo("");
    }

    @Test
    void testEncodeWithConsecutiveAndSingleCharacters() {
        String input = "aabcccccaaa";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo("a2bc5a3");
    }
}