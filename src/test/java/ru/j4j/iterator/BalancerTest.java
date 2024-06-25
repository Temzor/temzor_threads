package ru.j4j.iterator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class BalancerTest {

    private List<List<Integer>> nodes;
    private Iterator<Integer> source;

    @BeforeEach
    void setUp() {
        nodes = new ArrayList<>();
        nodes.add(new ArrayList<>());
        nodes.add(new ArrayList<>());
        nodes.add(new ArrayList<>());

        source = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).iterator();
    }

    @Test
    void testSplit() {
        Balancer.split(nodes, source);

        assertThat(nodes.get(0)).containsExactly(1, 4, 7);
        assertThat(nodes.get(1)).containsExactly(2, 5, 8);
        assertThat(nodes.get(2)).containsExactly(3, 6, 9);
    }

    @Test
    void testSplitEmptySource() {
        source = new ArrayList<Integer>().iterator();
        Balancer.split(nodes, source);

        assertThat(nodes.get(0)).isEmpty();
        assertThat(nodes.get(1)).isEmpty();
        assertThat(nodes.get(2)).isEmpty();
    }

    @Test
    void testSplitSingleNode() {
        nodes = new ArrayList<>();
        nodes.add(new ArrayList<>());
        source = Arrays.asList(1, 2, 3).iterator();

        Balancer.split(nodes, source);

        assertThat(nodes.get(0)).containsExactly(1, 2, 3);
    }

    @Test
    void testSplitNullNodes() {
        assertThatThrownBy(() -> Balancer.split(null, source))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Nodes and source must not be null");
    }

    @Test
    void testSplitNullSource() {
        assertThatThrownBy(() -> Balancer.split(nodes, null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Nodes and source must not be null");
    }

    @Test
    void testSplitEmptyNodes() {
        nodes = new ArrayList<>();
        assertThatThrownBy(() -> Balancer.split(nodes, source))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Nodes list must not be empty");
    }
}