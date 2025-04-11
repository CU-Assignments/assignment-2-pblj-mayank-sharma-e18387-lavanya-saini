import java.util.Scanner;
class Book {
    protected String title;
    protected String author;
    protected int bookId;
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
    public void displayDetails() {
        System.out.println("Book ID   : " + bookId);
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
    }
}
class Fiction extends Book {
    public Fiction(int bookId, String title, String author) {
        super(bookId, title, author);
    }
    @Override
    public void displayDetails() {
        System.out.println("\n--- Fiction Book Details ---");
        super.displayDetails();
    }
}
class NonFiction extends Book {
    public NonFiction(int bookId, String title, String author) {
        super(bookId, title, author);
    }
    @Override
    public void displayDetails() {
        System.out.println("\n--- Non-Fiction Book Details ---");
        super.displayDetails();
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fiction Book Details:");
        System.out.print("Book ID: ");
        int id1 = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Title: ");
        String title1 = sc.nextLine();
        System.out.print("Author: ");
        String author1 = sc.nextLine();
        Fiction fictionBook = new Fiction(id1, title1, author1);
        System.out.println("\nEnter Non-Fiction Book Details:");
        System.out.print("Book ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Title: ");
        String title2 = sc.nextLine();
        System.out.print("Author: ");
        String author2 = sc.nextLine();
        NonFiction nonFictionBook = new NonFiction(id2, title2, author2);
        fictionBook.displayDetails();
        nonFictionBook.displayDetails();
        sc.close();
    }
}
