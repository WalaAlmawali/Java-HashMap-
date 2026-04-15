import java.util.*;
public class MovieDirectorDemo {
    public static void main (String[] args){

        HashMap<String, String>   movieDirectorRecords  = new HashMap<>();

        //Add  movie-director records  in HashMap
        movieDirectorRecords.put("Inception", "Christopher Nolan");
        movieDirectorRecords.put("Titanic", "James Cameron");
        movieDirectorRecords.put("The Matrix", "Lana Wachowski & Lilly Wachowski");
        movieDirectorRecords.put("Avatar", "James Cameron");
        movieDirectorRecords.put("Jurassic Park", "Steven Spielberg");

        //  Display all elements in the HashMap
        System.out.println(  movieDirectorRecords );

       //  display the director of one specific movie
        System.out.println("\n Director of 'Inception': " + movieDirectorRecords.get("Inception"));

        // check if a movie exists
        System.out.println("\n is Titanic exist in the map? " + movieDirectorRecords.containsKey("Titanic"));

        // Check a movie that does NOT exist
        System.out.println("\n is Interstellar exist in the map? " + movieDirectorRecords.containsKey("Interstellar"));

        // Update the director of one movie using with same key
        movieDirectorRecords.put("Avatar", "James Cameron (Updated)");

      // Display the updated HashMap
        System.out.println("\nAfter updating director of 'Avatar':");
        System.out.println(movieDirectorRecords);

        // Remove one movie record using remove()
        movieDirectorRecords.remove("Jurassic Park");

        // Display the HashMap after removal
        System.out.println("\nAfter removing 'Jurassic Park':");
        System.out.println(movieDirectorRecords);

        //  display total number of records
        System.out.println("\nTotal number of movies: " + movieDirectorRecords.size());

    }
}
