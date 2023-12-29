package ru.j4j.stream;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Address {
    private String city;

    private String street;

    private int home;

    private int apartment;
}
