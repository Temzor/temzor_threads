package ru.j4j.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductLabelTest {
    @Test
    public void whenGeneratedLabels() {
        Label one = new Label("bread", 10);
        Label two = new Label("butter", 40);
        Label three = new Label("cherry", 75);
        Label four = new Label("watermelon", 35);
        List<Product> products = Arrays.asList(
                new Product("bread", 20f, 5, 4),
                new Product("butter", 80f, 30, 27),
                new Product("orange", 120f, 20, 3),
                new Product("coffee", 75f, 120, 30),
                new Product("potato", 45f, 90, 15),
                new Product("cherry", 150f, 10, 8),
                new Product("watermelon", 70f, 7, 7)
        );
        ProductLabel generator = new ProductLabel();
        List<String> strings = generator.generateLabels(products);
        List<String> expected = Arrays.asList(one.toString(), two.toString(), three.toString(), four.toString());
        assertThat(strings).hasSameElementsAs(expected);
    }
}