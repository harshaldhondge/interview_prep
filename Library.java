// Task-1 : Library Catalog System

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        Book newBook = new Book(title, author);
        books.add(newBook);
        System.out.println("Book '" + title + "' by " + author + " added to the library.");
    }

    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (title.toLowerCase().equals(book.title.toLowerCase())) {
                return book;
            }
        }
        return null;
    }

    public Book searchByAuthor(String author) {
        for (Book book : books) {
            if (author.toLowerCase().equals(book.author.toLowerCase())) {
                return book;
            }
        }
        return null;
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.title + ", Author: " + book.author);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add book");
            System.out.println("2. Search by title");
            System.out.println("3. Search by author");
            System.out.println("4. List all books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.next();
                    System.out.print("Enter author: ");
                    String author = scanner.next();
                    library.addBook(title, author);
                    break;

                case 2:
                    System.out.print("Enter title to search: ");
                    String searchTitle = scanner.next();
                    Book foundBook = library.searchByTitle(searchTitle);
                    if (foundBook != null) {
                        System.out.println("Book found: " + foundBook.title + " by " + foundBook.author);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter author to search: ");
                    String searchAuthor = scanner.next();
                    foundBook = library.searchByAuthor(searchAuthor);
                    if (foundBook != null) {
                        System.out.println("Book found: " + foundBook.title + " by " + foundBook.author);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    library.listBooks();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;
                    
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
