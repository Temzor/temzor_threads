package ru.code.six;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void sampleTests() {
        // Test an empty string
        assertEquals("", RainTacos.rainTacos(""));
        // Test a flat landscape
        assertEquals("     \nTACOT\nOOOOO", RainTacos.rainTacos("     \n     \nOOOOO"));
        // Test a landscape with no tacos
        assertEquals("OOOOO\nOOOOO\nOOOOO", RainTacos.rainTacos("OOOOO\nOOOOO\nOOOOO"));
        // Test a landscape with a taco island
        assertEquals("       \n   O   \n  COT  \n AOOOA \nTTACOSC", RainTacos.rainTacos("       \n       \n   O   \n  OOO  \n TACOS "));
        // Test a deep trench
        assertEquals("* *\n* *\n* *\n* *\n* *\n* *\n* *\n* *\n* *\n*A*", RainTacos.rainTacos("* *\n* *\n* *\n* *\n* *\n* *\n* *\n* *\n* *\n* *"));
        // Test a long landscape
        assertEquals("TACOTACOTACOTA\n--------------", RainTacos.rainTacos("              \n--------------"));
        // Test a floating island
        assertEquals("    TA    \n    ==    \n          \n          \nTACO  COTA", RainTacos.rainTacos("          \n    ==    \n          \n          \n          "));
    }
}

