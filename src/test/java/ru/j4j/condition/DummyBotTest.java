package ru.j4j.condition;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DummyBotTest {
    @Test
    void whenHiBotWhenAnswerHi() {
        assertThat(DummyBot.answer("Hi, bot."))
                .isEqualTo("Hi, SmartAss.");
    }

    @Test
    void whenHiBotWhenAnswerBye() {
        assertThat(DummyBot.answer("Bye."))
                .isEqualTo("See you later.");
    }

    @Test
    void whenHiBotWhenAnswerUnknown() {
        assertThat(DummyBot.answer("Ha-ha-ha-ha."))
                .isEqualTo("I don't know. Please, ask another question.");
    }

}