package ru.j4j.oop;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JukeboxTest {
    @Test
    void whenOneThenOneResultTrue() {
        String result = "Пусть бегут неуклюже";
        String expect = Jukebox.music(1);
        assertThat(result).isEqualTo(expect);
    }

    @Test
    void whenTwoThenTwoResultTrue() {
        String result = "Спокойной ночи";
        String expect = Jukebox.music(2);
        assertThat(result).isEqualTo(expect);
    }

    @Test
    void whenDefaultThenDefaultResultTrue() {
        String result = "Песня не найдена";
        String expect = Jukebox.music(16);
        assertThat(result).isEqualTo(expect);
    }
}