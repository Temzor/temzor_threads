package ru.j4j.tracker.comporator;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import ru.j4j.tracker.model.Item;

import java.util.ArrayList;


class ItemAscByNameTest {

    @Test
    void compareAscItem() {
        ItemAscByName itemAscByName = new ItemAscByName();
        List<Item> result = new ArrayList<>(List.of(
                new Item("abc"),
                new Item("gjk"),
                new Item("def")
        ));

        List<Item> expect = List.of(
                new Item("abc"),
                new Item("def"),
                new Item("gjk")
        );
        result.sort(new ItemAscByName());
        assertThat(result).containsAll(expect);
    }
}