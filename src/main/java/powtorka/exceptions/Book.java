package powtorka.exceptions;

public class Book {

    private String name;
    private int releaseYear;

    public Book(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
