package ru.j4j.pojo;

public class Book {
    private final String nameBook;
    private final int countPages;

    public Book(String nameBook, int countPages) {
        this.nameBook = nameBook;
        this.countPages = countPages;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getCountPages() {
        return countPages;
    }
}
