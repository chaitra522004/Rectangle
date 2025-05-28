// Book class
class Book {
    String bookName;
    String author;
    String publisher;
    double price;
    int yearOfPublished;

    // Constructor
    Book(String bookName, String author, String publisher, double price, int yearOfPublished) {
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.yearOfPublished = yearOfPublished;
    }

    // Display method
    void display() {
        System.out.println("Book Details:");
        System.out.println("Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: $" + price);
        System.out.println("Year of Published: " + yearOfPublished);
    }
}

// BookSale class
class BookSale {
    String saleName;
    int numberOfSales;
    String saleId;

    // Constructor
    BookSale(String saleName, int numberOfSales, String saleId) {
        this.saleName = saleName;
        this.numberOfSales = numberOfSales;
        this.saleId = saleId;
    }

    // Display method
    void display() {
        System.out.println("\nSale Details:");
        System.out.println("Sale Name: " + saleName);
        System.out.println("Number of Sales: " + numberOfSales);
        System.out.println("Sale ID: " + saleId);
    }
}

// Main class
public class BookSystem {
    public static void main(String[] args) {
        // Creating book object
        Book book = new Book("Java Basics", "John Doe", "Tech Press", 299.99, 2023);
        book.display();

        // Creating sale object
        BookSale sale = new BookSale("Holiday Sale", 150, "SALE2025");
        sale.display();
}
}