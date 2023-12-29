package ru.j4j.stream;

import lombok.*;

@ToString
@EqualsAndHashCode(callSuper = false)
@Data
@Getter
@AllArgsConstructor
public class Product {
    String name;
    float price;
    int standard;
    int actual;

}
