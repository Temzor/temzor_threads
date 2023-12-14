package ru.j4j.tracker.comporator;

import org.junit.jupiter.api.Test;
import ru.j4j.tracker.model.Item;


import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class ItemAscByNameTest {

    @Test
    void whenListFromSmallestToLargest() {
        List<Item> items = Arrays.asList(
                new Item("Petr"),
                new Item("Ivan"),
                new Item("Makar")
        );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("Ivan"),
                new Item("Makar"),
                new Item("Petr")
        );
        assertThat(items).isNotEmpty();
    }
}