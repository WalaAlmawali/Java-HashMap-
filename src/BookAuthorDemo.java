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


    }
}
