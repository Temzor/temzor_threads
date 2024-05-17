package ru.code.eight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SchoolReportTest {
    @Test
    void testSchoolReport() {
        assertThat(2).isEqualTo(SchoolReport.getAverage(new int[]{2, 2, 2, 2}));
        assertThat(3).isEqualTo(SchoolReport.getAverage(new int[]{1, 2, 3, 4, 5}));
        assertThat(1).isEqualTo(SchoolReport.getAverage(new int[]{1, 1, 1, 1, 1, 1, 1, 2}));
    }
}