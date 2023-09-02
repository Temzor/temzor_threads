package ru.core.l1.threads;

public class MainH {
    static private boolean win = false;
    public static void main(String[] args) {
        int digit = (int) (Math.random() * 1_000_000_000);
        System.out.println("Digit: " + digit);
        Thread timer = new Thread(() -> {
            int i = 0;
            try {
                while (!win) {
                    System.out.println(i);
                    i++;
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread player = new Thread(() -> {
            while (!win) {
                int guessNumber = (int) (Math.random() * 1_000_000_000);
                if (guessNumber == digit) {
                    win = true;
                    System.out.println(guessNumber);
                }
            }
        });
        timer.start();
        player.start();
    }
}
