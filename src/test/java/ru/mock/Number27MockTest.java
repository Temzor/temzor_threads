package ru.mock;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Number27MockTest {
    @Test
    void testTrue() {
        TreeNode expected = new TreeNode(5);
        expected.left = new TreeNode(3);
        expected.left.left = new TreeNode(2);
        expected.left.right = new TreeNode(4);
        expected.right = new TreeNode(6);
        expected.right.right = new TreeNode(7);

        int k = 9;

        assertThat(Number27Mock.findTarget(expected, k)).isTrue();
    }

    @Test
    void testFalse() {
        TreeNode expected = new TreeNode(5);
        expected.left = new TreeNode(3);
        expected.left.left = new TreeNode(2);
        expected.left.right = new TreeNode(4);
        expected.right = new TreeNode(6);
        expected.right.right = new TreeNode(7);

        int k = 28;

        assertThat(Number27Mock.findTarget(expected, k)).isFalse();
    }
}