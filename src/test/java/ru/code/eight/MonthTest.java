package ru.code.eight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MonthTest {
    @Test
    void test() {
       assertThat("Winter").isEqualTo(Month.howMonth(1));
       assertThat("Winter").isEqualTo(Month.howMonth(2));
       assertThat("Spring").isEqualTo(Month.howMonth(3));
       assertThat("Spring").isEqualTo(Month.howMonth(4));
       assertThat("Spring").isEqualTo(Month.howMonth(5));
       assertThat("Summer").isEqualTo(Month.howMonth(6));
       assertThat("Summer").isEqualTo(Month.howMonth(7));
       assertThat("Summer").isEqualTo(Month.howMonth(8));
       assertThat("Autumn").isEqualTo(Month.howMonth(9));
       assertThat("Autumn").isEqualTo(Month.howMonth(10));
       assertThat("Autumn").isEqualTo(Month.howMonth(11));
       assertThat("Winter").isEqualTo(Month.howMonth(12));
    }
}