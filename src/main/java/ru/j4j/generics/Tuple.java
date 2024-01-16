package ru.j4j.generics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class Tuple {
    private final Object left;
    private final Object right;
}
