package ru.j4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CheckPrimeNumberTest {
    @Test
    void when5ThenTrue() {
        int number = 5;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    @Test
    void when4ThenFalse() {
        int number = 4;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    @Test
    void when1ThenFalse() {
        int number = 1;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    @Test
    void when11ThenTrue() {
        int number = 11;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    @Test
    void when25ThenFalse() {
        int number = 25;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    @Test
    void when9ThenFalse() {
        int number = 9;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    @Test
    void when49ThenFalse() {
        int number = 49;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    @Test
    public void when2ThenPrime() {
        assertThat(CheckPrimeNumber.check(2)).isTrue();
    }

    @Test
    public void when3ThenPrime() {
        assertThat(CheckPrimeNumber.check(3)).isTrue();
    }

    @Test
    public void when4ThenNotPrime() {
        assertThat(CheckPrimeNumber.check(4)).isFalse();
    }

    @Test
    public void when1ThenNotPrime() {
        assertThat(CheckPrimeNumber.check(1)).isFalse();
    }

    @Test
    public void when0ThenNotPrime() {
        assertThat(CheckPrimeNumber.check(0)).isFalse();
    }

    @Test
    public void whenNegativeThenNotPrime() {
        assertThat(CheckPrimeNumber.check(-5)).isFalse();
    }
}