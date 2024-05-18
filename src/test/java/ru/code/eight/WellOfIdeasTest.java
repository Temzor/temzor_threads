package ru.code.eight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WellOfIdeasTest {
    @Test
    public void basicTests() {
        assertThat("Fail!").isEqualTo(WellOfIdeas.well(new String[]{"bad", "bad", "bad"}));
        assertThat("Publish!").isEqualTo(WellOfIdeas.well(new String[]{"good", "bad", "bad", "bad", "bad"}));
        assertThat("I smell a series!").isEqualTo(WellOfIdeas.well(new String[]{
                "good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
    }
}