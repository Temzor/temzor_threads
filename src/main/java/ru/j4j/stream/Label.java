package ru.j4j.stream;

import lombok.*;


@ToString
@EqualsAndHashCode(callSuper = false)
@Data
@Getter
@AllArgsConstructor
public class Label {
    String name;
    float price;
}
