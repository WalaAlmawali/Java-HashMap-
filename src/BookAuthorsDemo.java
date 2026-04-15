import java.util.*;
public class BookAuthorsDemo {
    public static void main (String[] args) {

        HashMap<String, String>  bookAuthorRecords = new HashMap<>();

        //Add   book-author record  in HashMap
        bookAuthorRecords.put("Harry Potter", "J.K. Rowling");
        bookAuthorRecords.put("The Hobbit", "J.R.R. Tolkien");
        bookAuthorRecords.put("1984", "George Orwell");
        bookAuthorRecords.put("Pride and Prejudice", "Jane Austen");
        bookAuthorRecords.put("The Alchemist", "Paulo Coelho");

        //  Display all elements in the HashMap
        System.out.println( bookAuthorRecords);
        
    }
}
