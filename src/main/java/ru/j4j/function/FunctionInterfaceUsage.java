package ru.j4j.function;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class FunctionInterfaceUsage {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "New String For Interface";
        System.out.println(supplier.get());

        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> setSupplier = () -> new HashSet<>(list);
        Set<String> strings = setSupplier.get();
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
