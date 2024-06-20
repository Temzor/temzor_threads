package ru.j4j.assertj;

import org.assertj.core.data.Index;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class SimpleConvertTest {
    @Test
    void checkArray() {
        SimpleConvert simpleConvert = new SimpleConvert();
        String[] array = simpleConvert.toArray("first", "second", "three", "four", "five");
        assertThat(array).hasSize(5)
                .contains("second")
                .contains("first", Index.atIndex(0))
                .containsAnyOf("zero", "second", "six")
                .doesNotContain("first", Index.atIndex(1));
    }

    @Test
    void checkList() {
        SimpleConvert simpleConvert = new SimpleConvert();
        List<String> array = simpleConvert.toList("first", "second", "three", "four", "five");
        assertThat(array).hasSize(5)
                .contains("second")
                .contains("first", Index.atIndex(0))
                .containsAnyOf("zero", "second", "six")
                .doesNotContain("first", Index.atIndex(1))
                .first().isEqualTo("first");
    }

    @Test
    void checkSet() {
        SimpleConvert simpleConvert = new SimpleConvert();
        Set<String> array = simpleConvert.toSet("first", "second", "three", "four", "five");
        assertThat(array).hasSize(5)
                .contains("second")
                .containsAnyOf("zero", "second", "six");
    }

    private final SimpleConvert simpleConvert = new SimpleConvert();

    @Test
    void testToArray() {
        String[] result = simpleConvert.toArray("a", "b", "c");
        assertThat(result).containsExactly("a", "b", "c");
    }

    @Test
    void testToList() {
        List<String> result = simpleConvert.toList("a", "b", "c");
        assertThat(result).containsExactly("a", "b", "c");
    }

    @Test
    void testToSet() {
        Set<String> result = simpleConvert.toSet("a", "b", "c", "a");
        assertThat(result).containsExactlyInAnyOrder("a", "b", "c");
    }

    @Test
    void testToMap() {
        Map<String, Integer> result = simpleConvert.toMap("a", "b", "c");
        assertThat(result).containsExactlyInAnyOrderEntriesOf(Map.of("a", 0, "b", 1, "c", 2))
                .hasSize(3)
                .containsEntry("a", 0)
                .containsValues(0, 1)
                .doesNotContainKey("14")
                .doesNotContainValue(15)
                .containsEntry("b", 1);
    }

    @Test
    void testToMapWithDuplicates() {
        Map<String, Integer> result = simpleConvert.toMap("a", "b", "a");
        assertThat(result).containsExactlyInAnyOrderEntriesOf(Map.of("a", 0, "b", 1));
    }
}