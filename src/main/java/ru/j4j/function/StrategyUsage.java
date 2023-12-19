package ru.j4j.function;

import java.util.function.Function;
import java.util.function.Predicate;

public class StrategyUsage {

    public boolean contains(String string, String key) {
        return check(s -> s.contains(key), string);
    }

    public boolean check(Predicate<String> predicate, String string) {
        return predicate.test(string);
    }

    public String transform(Function<String, String> function, String string) {
        return function.apply(string);
    }

    public static void main(String[] args) {
        StrategyUsage usage = new StrategyUsage();
        System.out.println(
                "Результат работы: " + usage.check(
                        String::isEmpty, ""
                )
        );
        System.out.println(
                "Результат работы: " + usage.check(
                        string -> string.startsWith("Fun"), "Functional interface"
                )
        );
        System.out.println(
                "Результат работы: " + usage.check(
                        string -> string.contains("rn"), "Surname Name"
                )
        );

        System.out.println(
                "Строка после преобразования: " + usage.transform(
                        String::toUpperCase, "aBCdEfghKLmnpRstU"
                )
        );
        System.out.println(
                usage.transform(
                        string -> string.concat("работает корректно."), "Строка после преобразования: "
                )
        );
        System.out.println(
                "Строка после преобразования: " + usage.transform(
                        String::trim, "    aBC dEfghK Lmnp RstU        "
                )
        );
    }
}
