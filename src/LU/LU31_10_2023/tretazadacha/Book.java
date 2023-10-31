package LU.LU31_10_2023.tretazadacha;

public class Book {
    private String name;

    private String ISBN;

    public String getName() {
        return name;
    }

    public Book(String name, String ISBN) {
        this.name = name;
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }
}
