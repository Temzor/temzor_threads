package ru.j4j.queue;

import java.util.PriorityQueue;

public class PriorityQueueRunner {
    public static void main(String[] args) {
        PriorityQueue<String> stringQueue = new PriorityQueue<>();
        stringQueue.offer("f");
        stringQueue.offer("a");
        stringQueue.offer("s");
        stringQueue.offer("e");
        System.out.println("Current element: " + stringQueue.poll());
        stringQueue.poll();
        System.out.println("Current element: " + stringQueue.poll());
        stringQueue.poll();
        System.out.println("Current element: " + stringQueue.poll());

        System.out.println("----------------------------------------------");

        PriorityQueue<Transaction> transactionPriorityQueue = new PriorityQueue<>(new TransactionSortDescByAmount());
        transactionPriorityQueue.offer(new Transaction(1, "id_1", 100));
        transactionPriorityQueue.offer(new Transaction(2, "id_2", 1_000));
        transactionPriorityQueue.offer(new Transaction(3, "id_3", 85));
        transactionPriorityQueue.offer(new Transaction(4, "id_4", 550));
        printTransactionElements(transactionPriorityQueue);

        System.out.println("----------------------------------------------");

        PriorityQueue<Transaction> transactions = new PriorityQueue<>(new TransactionSortDescByAmount());
        transactions.offer(new Transaction(1, "number_1", 100));
        transactions.offer(new Transaction(2, "number_2", 1000));
        transactions.offer(new Transaction(3, "number_3", 85));
        transactions.offer(new Transaction(4, "number_4", 550));
        System.out.println("Current element: " + transactions.peek());
        System.out.println("Current element: " + transactions.peek());
        transactions.poll();
        System.out.println("Current element: " + transactions.peek());
        transactions.poll();
        System.out.println("Current element: " + transactions.peek());

        System.out.println("----------------------------------------------");

        PriorityQueue<Transaction> transactionsSame = new PriorityQueue<>(new TransactionSortDescByAmount());
        transactionsSame.offer(new Transaction(1, "number_1", 100));
        transactionsSame.offer(new Transaction(2, "number_2", 1000));
        transactionsSame.offer(new Transaction(3, "number_3", 85));
        transactionsSame.offer(new Transaction(4, "number_4", 100));
        transactionsSame.offer(new Transaction(5, "number_5", 1000));
        transactionsSame.offer(new Transaction(6, "number_6", 550));
        transactionsSame.offer(new Transaction(7, "number_7", 100));
        transactionsSame.offer(new Transaction(8, "number_8", 1000));
        printTransactionElements(transactionsSame);

        System.out.println("----------------------------------------------");
    }


    private static void printStringElements(PriorityQueue<String> queue) {
        while (!queue.isEmpty()) {
            System.out.println("Current element: " + queue.poll());
        }
    }

    private static void printTransactionElements(PriorityQueue<Transaction> queue) {
        while (!queue.isEmpty()) {
            System.out.println("Current element: " + queue.poll());
        }
    }
}
