package ru.j4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;


class MortgageImplTest {
    @Test
    void whenAmount1000Salary1200Percent1ThenYear1() {
        int amount = 1000;
        int salary = 1200;
        double percent = 1;
        int result = MortgageImpl.calculateYears(amount, salary, percent);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenAmount100Salary120Percent50ThenYear2() {
        int amount = 100;
        int salary = 120;
        double percent = 50;
        int result = MortgageImpl.calculateYears(amount, salary, percent);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenAmount1000Salary1200Percent20ThenYear1() {
        int amount = 1000;
        int salary = 1200;
        double percent = 20;
        int result = MortgageImpl.calculateYears(amount, salary, percent);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenPrincipalAndPaymentPositiveThenCalculateYearsSuccessfully() {
        assertThat(MortgageImpl.calculateYears(100_000, 12_000, 5)).isPositive();
    }

    @Test
    void whenAnnualInterestRateZeroThenCalculateYearsAsExpected() {
        assertThat(MortgageImpl.calculateYears(100_000, 25_000, 0)).isEqualTo(4);
    }

    @Test
    void whenExactPaymentForNoInterestThenCalculateYearsToOne() {
        assertThat(MortgageImpl.calculateYears(10_000, 10_000, 0)).isOne();
    }

    @Test
    void whenNegativePrincipalThenThrowIllegalArgumentException() {
        assertThatThrownBy(() -> MortgageImpl.calculateYears(-100_000, 10_000, 5))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Некорректные входные данные");
    }

    @Test
    void whenNegativeAnnualPaymentThenThrowIllegalArgumentException() {
        assertThatThrownBy(() -> MortgageImpl.calculateYears(100_000, -10_000, 5))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Некорректные входные данные");
    }

    @Test
    void whenNegativeInterestRateThenThrowIllegalArgumentException() {
        assertThatThrownBy(() -> MortgageImpl.calculateYears(100_000, 10_000, -5))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Некорректные входные данные");
    }

    @Test
    void whenPrincipalIsZeroThenThrowIllegalArgumentException() {
        assertThatThrownBy(() -> MortgageImpl.calculateYears(0, 10_000, 5))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Некорректные входные данные");
    }

    @Test
    void whenPaymentZeroThenThrowIllegalArgumentException() {
        assertThatThrownBy(() -> MortgageImpl.calculateYears(100_000, 0, 5))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Некорректные входные данные");
    }
}