public class Book {

    // Private data members - Encapsulation
    private String title;
    private String author;
    private double price;
    private String isbn;

    // Static members
    static String libraryName = "Sunrise Public Library";
    static int bookCount = 0;

    // Parameterized constructor
    public Book(String title, String author, double price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;

        // Increase count whenever a book is created
        bookCount++;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Getter for ISBN
    public String getIsbn() {
        return isbn;
    }
}