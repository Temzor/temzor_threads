package ru.j4j.collection;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class DepartmentsDescComparatorTest {
    @Test
    void compare() {
        int result = new DepartmentsDescComparator().compare(
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    void whenUpDepartmentGoBefore() {
        int result = new DepartmentsDescComparator().compare(
                "K2",
                "K2/SK1"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    void whenFirstDepartmentIsDifferentThenAsc() {
        int result = new DepartmentsDescComparator().compare(
                "K2/SK1/SSK1",
                "K1/SK1/SSK2"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    void whenFirstDepartmentIsDifferentThenDesc() {
        int result = new DepartmentsDescComparator().compare(
                "K1/SK1/SSK1",
                "K2/SK1"
        );
        assertThat(result).isGreaterThan(0);
    }
}