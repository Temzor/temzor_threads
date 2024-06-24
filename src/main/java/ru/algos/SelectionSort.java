package ru.algos;

public class SelectionSort {

    /**
     * Сортирует массив целых чисел методом выборки.
     *
     * @param arr массив целых чисел для сортировки
     */
    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    /**
     * Меняет местами два элемента в массиве.
     *
     * @param arr массив
     * @param i индекс первого элемента
     * @param j индекс второго элемента
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Исходный массив:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Отсортированный массив:");
        printArray(arr);
    }

    /**
     * Выводит массив на консоль.
     *
     * @param arr массив для вывода
     */
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}