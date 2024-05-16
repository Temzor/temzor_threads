package ru.code.eight;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EasyLogsTest {
    @Test
    void whenWithTests() {
        assertThat(0.7781512503836435).
                isCloseTo(EasyLogs.logs(10, 2, 3), Percentage.withPercentage(0.0000001));
        assertThat(1.1132827525593785).
                isCloseTo(EasyLogs.logs(5, 2, 3), Percentage.withPercentage(0.0000001));
        assertThat(0.25938375012788123).
                isCloseTo(EasyLogs.logs(1000, 2, 3), Percentage.withPercentage(0.0000001));
    }
}