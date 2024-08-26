import java.util.ArrayList;
import java.util.Scanner;

class Book{
    String title;
    String author;

    public Book(String title,String author){
        this.title = title;
        this.author = author;
    }
}

class Library{
    ArrayList<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public void addBook(String title,String author){
        Book newBook = new Book(title,author);
        books.add(newBook);
        System.out.println("Book "+title+" by "+author+" added Successfully.");
    }

    public Book searchByTitle(String title){
        for(Book book : books){
            if(title.toLowerCase().equals(book.title.toLowerCase())){
                return book;
            }
        }
        return null;
    }
    

    public Book searchByAuthor(String author){
        for (Book book : books){
            if(author.toLowerCase().equals(book.author.toLowerCase())){
                return book;
            }
        }
        return null;
    }

    public void listAllBooks(){
        for(Book book : books){
            System.out.println("Title : "+book.title+", Author : "+book.author);
        }
    }
    
    public static void main(String[]args){
        Library catalog  = new Library();
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("1. Add a book");
            System.out.println("2. Search a book by Title");
            System.out.println("3. Search a book by Author");
            System.out.println("4. List all books");
            System.out.println("5. Exit");
            System.out.print("Enter a Option : ");

            int option;
            
            try{
                option = sc.nextInt();
            } catch (Exception e){
                System.out.println("Invalid Option Entered...");
                break;
            }

            switch(option){
                case 1:
                    System.out.print("Enter a Title : ");
                    String title = sc.next();
                    System.out.print("Enter a Author : ");
                    String author = sc.next();
                    catalog.addBook(title,author);
                    break;

                case 2:
                    System.out.print("Enter a book title to Search : ");
                    String searchByTitle = sc.next();
                    Book foundBook = catalog.searchByTitle(searchByTitle);
                    if(foundBook != null){
                        System.out.println("Book Found : "+foundBook.title+" by "+foundBook.author);;
                    } else {
                        System.out.println("Book not Found");
                    }
                    break;

                case 3:
                    System.out.println("Enter a book author to Search : ");
                    String searchByAuthor = sc.next();
                    foundBook = catalog.searchByAuthor(searchByAuthor);
                    if(foundBook!=null){
                        System.out.println("Book Found : "+foundBook.title+" by "+foundBook.author);
                    } else { 
                        System.out.println("Book not Found");
                    }
                    break;

                case 4:
                    catalog.listAllBooks();
                    break;

                case 5:
                    System.out.println("Exiting....");
                    return;

                default:
                    System.out.println("Invalid Option Selected");        
            }
        }
    }
}
