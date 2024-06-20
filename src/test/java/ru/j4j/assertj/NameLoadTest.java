package ru.j4j.assertj;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

import java.util.Map;

class NameLoadTest {

    @Test
    void testParseValidNames() {
        NameLoad nameLoad = new NameLoad();
        nameLoad.parse("name=John", "age=30");
        Map<String, String> resultMap = nameLoad.getMap();
        assertThat(resultMap)
                .hasSize(2)
                .containsEntry("name", "John")
                .containsEntry("age", "30");
    }

    @Test
    void testParseWithDuplicateKeys() {
        NameLoad nameLoad = new NameLoad();
        nameLoad.parse("key=value1", "key=value2");
        assertThat(nameLoad.getMap()).containsEntry("key", "value1+value2");
    }

    @Test
    void testParseEmptyNamesArray() {
        NameLoad nameLoad = new NameLoad();
        assertThatThrownBy(nameLoad::parse)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Names array is empty");
    }

    @Test
    void testParseNameWithoutEquals() {
        NameLoad nameLoad = new NameLoad();
        assertThatThrownBy(() -> nameLoad.parse("John"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("does not contain the symbol '='");
    }

    @Test
    void testParseNameWithoutKey() {
        NameLoad nameLoad = new NameLoad();
        assertThatThrownBy(() -> nameLoad.parse("=John"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("does not contain a key");
    }

    @Test
    void testParseNameWithoutValue() {
        NameLoad nameLoad = new NameLoad();
        assertThatThrownBy(() -> nameLoad.parse("name="))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("does not contain a value");
    }

    @Test
    void testGetMapWhenEmpty() {
        NameLoad nameLoad = new NameLoad();
        assertThatThrownBy(nameLoad::getMap)
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("collection contains no data");
    }
}