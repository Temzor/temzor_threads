package ru.core.code.eight;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ru.eight.Billboard;

class BillboardTest {

    @Test
    void whenPrice30ThenDmitrii() {
        assertThat(Billboard.billboard("Dmitrii", 30)).isEqualTo(210);
    }

    @Test
    void whenNoPriceThenDan() {
        assertThat(Billboard.billboard("Dan")).isEqualTo(90);
    }

    @Test
    void whenNoPrice40ThenLiupold() {
        assertThat(Billboard.billboard("Hjalmar Liupold", 40)).isEqualTo(600);
    }
}