package ru.j4j.finder;

import org.junit.jupiter.api.Test;
import ru.j4j.finder.model.Task;

import static org.assertj.core.api.Assertions.assertThat;

class PriorityQueueTest {
    @Test
    public void whenHigherPrioritySecond() {
        var queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        var result = queue.take();
        assertThat(result.getDesc()).isEqualTo("urgent");
    }

    @Test
    public void whenHigherPriorityEquals() {
        var queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 5));
        queue.put(new Task("middle", 5));
        var result = queue.take();
        assertThat(result.getDesc()).isEqualTo("low");
    }
}