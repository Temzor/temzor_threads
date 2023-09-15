package ru.core.code.eight;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShortcutTest {

    @Test
    public void whenHelloThenHll() {
        assertThat(Shortcut.shortcut("hello")).isEqualTo("hll");
    }

    @Test
    public void whenManyWorldThenRegexRules() {
        assertThat(Shortcut.shortcut("how are you today?")).isEqualTo("hw r y tdy?");
    }

}