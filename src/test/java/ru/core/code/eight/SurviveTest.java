package ru.core.code.eight;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.eight.Survive;

class SurviveTest {
    @Test @DisplayName("A true hero")
    void aTrueHero() {
        assertThat(Survive.hero(10, 5)).isTrue();
        assertThat(Survive.hero(100, 40)).isTrue();
        assertThat(Survive.hero(10, 4)).isTrue();
    }

    @Test @DisplayName("A false hero")
    void aFalseHero() {
        assertThat(Survive.hero(10, 6)).isFalse();
        assertThat(Survive.hero(100, 400)).isFalse();
        assertThat(Survive.hero(10, 18)).isFalse();
    }
}