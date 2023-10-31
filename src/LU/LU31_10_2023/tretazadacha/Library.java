package LU.LU31_10_2023.tretazadacha;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public void searchBook(String isbn) {
        if (books.isEmpty()) throw new NullPointerException();
        for (Book book : books) {
            if (book.getISBN().equalsIgnoreCase(isbn)) {
                System.out.println(book.getName() + " found!");
                return;
            }
        }
        System.out.printf("Book with ISBN \"%s\" not found!%n", isbn);
    }
}
