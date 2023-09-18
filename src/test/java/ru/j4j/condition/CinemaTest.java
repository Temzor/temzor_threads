package ru.j4j.condition;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CinemaTest {
    @Test
    void whenAge18ThenWelcome() {
        assertThat(Cinema.access(18)).isEqualTo("Welcome to the cinema.");
    }

    @Test
    void whenAge16ThenAccessDenied() {
        assertThat(Cinema.access(16)).isEqualTo("It is not for you.");
    }

}