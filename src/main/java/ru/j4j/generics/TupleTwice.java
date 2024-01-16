package ru.j4j.generics;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TupleTwice<T1, T2> {
    private final T1 left;
    private final T2 right;
}
