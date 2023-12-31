package ru.j4j.stream;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.stream.Stream;

enum Suit {
    Diamonds, Hearts, Spades, Clubs
}

enum Value {
    V_6, V_7, V_8
}

@AllArgsConstructor
@ToString
public class Card {
    private Suit suit;
    private Value value;

    public static void main(String[] args) {
        Stream.of(Suit.values())
                .flatMap(suitMap -> Stream.of(Value.values())
                        .map(valueMap -> new Card(suitMap, valueMap)))
                .forEach(System.out::println);
    }
}
