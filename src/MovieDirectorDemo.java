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

    }
}
