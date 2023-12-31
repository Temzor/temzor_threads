package ru.code.six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RainTacosTest {
    @Test
    void sampleTests() {
        assertEquals("", RainTacos.rainTacos(""));
        assertEquals("     \nTACOT\nOOOOO", RainTacos.rainTacos("     \n     \nOOOOO"));
        assertEquals("OOOOO\nOOOOO\nOOOOO", RainTacos.rainTacos("OOOOO\nOOOOO\nOOOOO"));
        assertEquals("       \n   O   \n  COT  \n AOOOA \nTTACOSC", RainTacos.rainTacos(
                "       \n       \n   O   \n  OOO  \n TACOS "));
        assertEquals("* *\n* *\n* *\n* *\n* *\n* *\n* *\n* *\n* *\n*A*",
                RainTacos.rainTacos("* *\n* *\n* *\n* *\n* *\n* *\n* *\n* *\n* *\n* *"));
        assertEquals("TACOTACOTACOTA\n--------------", RainTacos.rainTacos("              "
                + "\n--------------"));
        assertEquals("    TA    \n    ==    \n          \n          \nTACO  COTA",
                RainTacos.rainTacos("          \n    ==    \n          \n          \n          "));
    }
}