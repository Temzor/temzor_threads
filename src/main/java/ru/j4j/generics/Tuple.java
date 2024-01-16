package ru.j4j.generics;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Tuple<T> {
    private final T left;
    private final T right;
}
