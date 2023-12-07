package ru.j4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("fick@mail.ru", "Andrey Ficus");

        for (String s : map.keySet()) {
            System.out.println(map.get(s));
            System.out.println(s);
        }

        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey());
            System.out.println(s.getValue());
        }
    }
}
