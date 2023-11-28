package ru.j4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book one = new Book("Clean code", 800);
        Book two = new Book("Java", 1600);
        Book three = new Book("PMBOK", 1200);
        Book four = new Book("SCRUM", 15200);

        Book[] books = new Book[4];
        books[0] = one;
        books[1] = two;
        books[2] = three;
        books[3] = four;

        for (Book book : books) {
            System.out.printf("Book: %s, pages: %s;" + System.lineSeparator(), book.getNameBook(), book.getCountPages());
        }
        System.out.println("Replace book with index 0 and 3");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (Book book : books) {
            System.out.printf("Book: %s, pages: %s" + System.lineSeparator(), book.getNameBook(), book.getCountPages());
        }
        System.out.println("Find book \"Clean code\"");
        for (Book book : books) {
            if (book.getNameBook().equals("Clean code")) {
                System.out.printf("Book: %s, pages: %s" + System.lineSeparator(), book.getNameBook(), book.getCountPages());
            }
        }
    }
}
