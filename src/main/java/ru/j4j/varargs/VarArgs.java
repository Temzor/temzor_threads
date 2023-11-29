package ru.j4j.varargs;

public class VarArgs {
    public static String text(String... strings) {
        StringBuilder builder = new StringBuilder();
        for (String st : strings) {
            builder.append(st);
        }
        return builder + " Количество соединенных элементов: " + strings.length;
    }

    public static String text(int x, String... strings) {
        StringBuilder builder = new StringBuilder();
        builder.append(x);
        for (String s : strings) {
            builder.append(s);
        }
        return builder.toString();
    }

    public static String text(int x) {
        StringBuilder builder = new StringBuilder();
        builder.append(x);
        return String.valueOf(x);
    }
    public static void main(String[] args) {
        System.out.println(text());
        System.out.println(text("aaa"));
        System.out.println(text("aaa", "bbb", "ccc"));
        System.out.println(text("aaa", "bbb", "ccc", "ddd", "eee"));
        System.out.println(text(30, "aaa", "bbb"));
    }
}
