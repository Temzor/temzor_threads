package ru.code.eight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoverTest {
    @Test
    void remove() {
        assertThat(2).isEqualTo(Remover.removeElement(new int[]{3, 2, 2, 3}, 2));
    }
}