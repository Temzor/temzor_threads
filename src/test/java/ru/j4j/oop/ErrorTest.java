package ru.j4j.oop;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ErrorTest {
    @Test
    void testWithArguments() {
        Error error = new Error(true, 404, "Not Found");
        String result = "Error { /nisActive = true" + "/nstatus = " + 404 + "/nmessage = " + "Not Found" + "/n}";
        String expect = error.showInfo();
        assertThat(result).isEqualTo(expect);
    }

    @Test
    void testWithoutArguments() {
        Error error = new Error();
        String result = "Error { /nisActive = false" + "/nstatus = " + 0 + "/nmessage = " + null + "/n}";
        String expect = error.showInfo();
        assertThat(result).isEqualTo(expect);
    }
}