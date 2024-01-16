package ru.j4j.generics;

import lombok.Getter;

@Getter
public class TupleTriple<T1, T2, T3> extends TupleTwice<T1, T3> {
    private final T2 middle;

    public TupleTriple(T1 left, T2 middle, T3 right) {
        super(left, right);
        this.middle = middle;
    }
}
