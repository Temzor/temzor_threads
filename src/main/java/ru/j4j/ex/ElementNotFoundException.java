package ru.j4j.ex;

public class ElementNotFoundException extends Exception {

    public ElementNotFoundException(String elementNotFound) {
        super(elementNotFound);
    }
}
