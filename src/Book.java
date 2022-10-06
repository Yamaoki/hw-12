public class Book {
    private final String book;
    private final Author author;
    private int year;

    public Book(String book, Author author, int year) {
        this.book = book;
        this.author = author;
        this.year = year;
    }
    public String getBook() {
        return this.book;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
