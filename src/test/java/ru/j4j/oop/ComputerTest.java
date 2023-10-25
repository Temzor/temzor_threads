package ru.j4j.oop;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComputerTest {
    @Test
    void whenTrue500Ryzen5600XThenEqualsTrue() {
        Computer computer = new Computer(true, 500, "Ryzen5600X");
        String expect = computer.returnInfo();
        String result  = "Multi monitor: " + true + "/nSSD: " + 500 + " GB" + "/nModel CPU: Ryzen5600X";
        assertThat(result).isEqualTo(expect);
    }

    @Test
    void whenFalse1000Ryzen7800HThenEqualsTrue() {
        Computer computer = new Computer(false, 1000, "Ryzen7800H");
        String expect = computer.returnInfo();
        String result  = "Multi monitor: " + false + "/nSSD: " + 1000 + " GB" + "/nModel CPU: Ryzen7800H";
        assertThat(result).isEqualTo(expect);
    }

}