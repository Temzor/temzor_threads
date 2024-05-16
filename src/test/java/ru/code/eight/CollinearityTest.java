package ru.code.eight;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CollinearityTest {

        @DisplayName("Vectors directed in the same direction") @Order(1)
        @Test
        void sameDirection() {
            assertTrue(Collinearity.collinearity(1, 1, 1, 1), "collinearity(1, 1, 1, 1)");
            assertTrue(Collinearity.collinearity(1, 2, 2, 4), "collinearity(1, 2, 2, 4)");
        }

        @DisplayName("Vectors directed in opposite directions") @Order(2)
        @Test void oppositeDirection() {
            assertTrue(Collinearity.collinearity(1, 1, -1, -1), "collinearity(1, 1, -1, -1)");
            assertTrue(Collinearity.collinearity(1, -2, -2, 4), "collinearity(1, -2, -2, 4)");
        }

        @DisplayName("Vectors directed in different directions") @Order(3)
        @Test void differentDirection() {
            assertFalse(Collinearity.collinearity(1, 1, 6, 1), "collinearity(1, 1, 6, 1)");
            assertFalse(Collinearity.collinearity(1, 2, 1, -2), "collinearity(1, 2, 1, -2)");
        }

        @DisplayName("Vectors contain zeros") @Order(4)
        @Test void withZeros() {
            assertTrue(Collinearity.collinearity(4, 0, 11, 0), "collinearity(4, 0, 11, 0)");
            assertFalse(Collinearity.collinearity(0, 1, 6, 0), "collinearity(0, 1, 6, 0)");
            assertFalse(Collinearity.collinearity(4, 4, 0, 4), "collinearity(4, 4, 0, 4)");
        }

        @DisplayName("Vectors with x = 0  and y = 0") @Order(5)
        @Test void zeroVectors() {
            assertTrue(Collinearity.collinearity(0, 0, 0, 0), "collinearity(0, 0, 0, 0)");
            assertTrue(Collinearity.collinearity(0, 0, 1, 0), "collinearity(0, 0, 1, 0)");
            assertTrue(Collinearity.collinearity(5, 7, 0, 0), "collinearity(5, 7, 0, 0)");
        }

}