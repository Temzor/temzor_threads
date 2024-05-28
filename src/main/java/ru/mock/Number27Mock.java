package ru.mock;

import java.util.HashSet;
import java.util.Set;

/**
 * Задача:
 * Дано корневое значение корня бинарного дерева поиска (BST) и целое число 𝑘.
 * Необходимо вернуть true, если в BST существуют два элемента, сумма которых равна
 * 𝑘, иначе вернуть false.
 * Пример 1:
 * Вход: корень = [5,3,6,2,4,null,7], 𝑘=9
 * Выход: true
 * Пример 2:
 * Вход: корень = [5,3,6,2,4,null,7], 𝑘=28
 * Выход: false
 * Условия:
 * Корень BST - допустимое дерево.
 */
public class Number27Mock {
        public static boolean findTarget(TreeNode root, int k) {
            Set<Integer> saverOperand = new HashSet<>();
            return find(root, k, saverOperand);
        }

        private static boolean find(TreeNode node, int k, Set<Integer> set) {
            if (node == null) {
                return false;
            }
            if (set.contains(k - node.val)) {
                return true;
            }
            set.add(node.val);
            return find(node.left, k, set) || find(node.right, k, set);
        }
    }


/*
  1. Используется хэш-сет (`set`) для хранения значений узлов, которые уже были посещены.
  2. В методе `find` проверяется, существует ли значение \( k - node.val \) в множестве. Если существует,
  то возвращается `true`.
  3. Если значение не найдено, текущее значение добавляется в множество.
  4. Рекурсивно вызывается метод для левого и правого поддеревьев.
  5. Если не найдено в обоих поддеревьях, возвращается `false`.
  Такое решение эффективно, поскольку использует время \( O(n) \) и пространство \( O(n) \)
  для хранения элементов в хэш-сете.
 */







