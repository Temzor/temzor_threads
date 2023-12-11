package ru.j4j.tracker.comporator;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ru.j4j.tracker.model.Item;

import java.util.ArrayList;
import java.util.List;

class ItemDescByNameTest {
    @Test
    void compareDescItem() {
        ItemAscByName itemAscByName = new ItemAscByName();
        List<Item> result = new ArrayList<>(List.of(
                new Item("abc"),
                new Item("gjk"),
                new Item("def")
        ));

        List<Item> expect = List.of(
                new Item("gjk"),
                new Item("def"),
                new Item("abc")
        );
        result.sort(new ItemDescByName());
        assertThat(result).containsAll(expect);
    }
}