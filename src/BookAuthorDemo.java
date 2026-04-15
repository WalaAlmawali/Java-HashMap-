import java.util.*;
public class BookAuthorDemo {
    public static void main (String[] args){

        HashMap<String, String>   bookAuthorRecords = new HashMap<>();

        //Add  book-author records  in HashMap
        bookAuthorRecords.put("The Alchemist", "Paulo Coelho");
        bookAuthorRecords.put("1984", "George Orwell");
        bookAuthorRecords.put("To Kill a Mockingbird", "Harper Lee");
        bookAuthorRecords.put("The Great Gatsby", "F. Scott Fitzgerald");
        bookAuthorRecords.put("Moby Dick", "Herman Melville");


        System.out.println(  bookAuthorRecords); //  Display all elements in the HashMap

        //display the author of one specific book
        System.out.println("the author of Moby Dick is :" +bookAuthorRecords.get("Moby Dick") );

        // check if key (To Kill a Mockingbird) exist in HashMap or not
         System.out.println("is To Kill a Mockingbird exist in HashMap ?" + bookAuthorRecords.containsKey("To Kill a Mockingbird"));

         //  Update the author of specific book
         bookAuthorRecords.put("Moby Dick", "Herman Melville (Updated)");

         // Display the updated HashMap
        System.out.println( "\n updated HashMap: " +"\n"+ bookAuthorRecords);

        //delete one book record
        bookAuthorRecords.remove("1984");

        // Display the updated HashMap after removal
        System.out.println( "\n updated HashMap after removal:" +"\n"+bookAuthorRecords);

        // display the total number of records
        System.out.println("\nTotal number of books: " + bookAuthorRecords.size());

    }
}
