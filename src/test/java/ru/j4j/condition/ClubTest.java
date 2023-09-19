package ru.j4j.condition;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClubTest {
    @Test
    void whenMoneyTrueFriendTrueThenTrue() {
        assertThat(Club.permission(true, true))
                .isEqualTo("I can go to the club.");
    }

    @Test
    void whenMoneyFalseFriendTrueThenTrue() {
        assertThat(Club.permission(false, true))
                .isEqualTo("I can go to the club.");
    }

    @Test
    void whenMoneyTrueFriendFalseThenTrue() {
        assertThat(Club.permission(true, false))
                .isEqualTo("I can go to the club.");
    }

    @Test
    void whenMoneyFalseFriendFalseThenFalse() {
        assertThat(Games.permission(false, false))
                .isEqualTo("I can't.");
    }

}