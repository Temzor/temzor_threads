package ru.j4j.oop;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DummyDicTest {
    @Test
    void testOnceEngWord() {
        String wordEng = "Abc";
        String result = "Неизвестное слово: " + wordEng;
        String expect = DummyDic.engToRus("Abc");
        assertThat(result).isEqualTo(expect);
    }
}