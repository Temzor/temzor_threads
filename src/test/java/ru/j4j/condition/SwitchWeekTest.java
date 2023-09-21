package ru.j4j.condition;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwitchWeekTest {
    @Test
    void whenOneThenMonday() {
        assertThat(SwitchWeek.nameOf(1)).isEqualTo("Понедельник");
    }

    @Test
    void whenTwoThenTuesday() {
        assertThat(SwitchWeek.nameOf(2)).isEqualTo("Вторник");
    }

    @Test
    void whenThreeThenWednesday() {
        assertThat(SwitchWeek.nameOf(3)).isEqualTo("Среда");
    }

    @Test
    void whenFourThenThursday() {
        assertThat(SwitchWeek.nameOf(4)).isEqualTo("Четверг");
    }

    @Test
    void whenFiveThenFriday() {
        assertThat(SwitchWeek.nameOf(5)).isEqualTo("Пятница");
    }
    @Test
    void whenSixThenSaturday() {
        assertThat(SwitchWeek.nameOf(6)).isEqualTo("Суббота");
    }

    @Test
    void whenSevenThenSunday() {
        assertThat(SwitchWeek.nameOf(7)).isEqualTo("Воскресенье");
    }

    @Test
    void whenEightThenError() {
        assertThat(SwitchWeek.nameOf(8)).isEqualTo("Ошибка");
    }
}