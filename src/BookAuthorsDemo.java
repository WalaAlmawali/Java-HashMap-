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

        // display author of one specific book
        System.out.println("\nAuthor of '1984': " + bookAuthorRecords.get("1984"));

        //  check if a book exists
        System.out.println("\nis Harry Potter exist in the map? " + bookAuthorRecords.containsKey("Harry Potter"));

        //  check a book that does NOT exist
        System.out.println("\nis The Da Vinci Code exist in the map? " + bookAuthorRecords.containsKey("The Da Vinci Code"));

        // Update the author of one book  with the same key
        bookAuthorRecords.put("The Hobbit", "J.R.R. Tolkien (Updated Edition)");

        // Display the updated HashMap
        System.out.println("\nAfter updating 'The Hobbit':");
        System.out.println(bookAuthorRecords);

        // Remove one book record
        bookAuthorRecords.remove("Pride and Prejudice");

        // Display the HashMap after removal
        System.out.println("\nAfter removing 'Pride and Prejudice':");
        System.out.println(bookAuthorRecords);

        // Use size() to display total number of records left
        System.out.println("\nTotal number of books: " + bookAuthorRecords.size());

    }
}
