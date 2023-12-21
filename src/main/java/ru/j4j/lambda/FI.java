package ru.j4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] attachments = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };
        Comparator<Attachment> comparator = Comparator.comparingInt(Attachment::getSize);
        Arrays.sort(attachments, comparator);
        System.out.println(Arrays.toString(attachments));
        String[] strings = {"cdefg", "bcd", "abcd"};
        Comparator<String> cmpText = Comparator.naturalOrder();
        Arrays.sort(strings, cmpText);
        System.out.println(Arrays.toString(strings));
        Comparator<String> cmpDescSize = (left, right) -> Integer.compare(right.length(), left.length());
        Arrays.sort(strings, cmpDescSize);
        System.out.println(Arrays.toString(strings));


    }
}
