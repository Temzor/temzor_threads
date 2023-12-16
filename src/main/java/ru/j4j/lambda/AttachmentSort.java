package ru.j4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );
        Comparator<Attachment> comparator = (left, right) -> Integer.compare(left.getSize(), right.getSize());
        attachments.sort(comparator);
        System.out.println(attachments);

        comparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment t1, Attachment t2) {
                return t1.getName().compareTo(t2.getName());
            }
        };
        attachments.sort(comparator);
        System.out.println(attachments);
        ArrayList<Integer> list = new ArrayList<Integer>() {
            @Override
            public boolean add(Integer o) {
                System.out.println("Add a new element to list: " + o);
                return super.add(o);
            }
        };
        list.add(100500);
    }
}