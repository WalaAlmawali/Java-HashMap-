import java.util.*;

public class CourseTrainerDemo {
    public static void main (String[] args){

        HashMap<String, String>   courseTrainerRecords = new HashMap<>();

        //Add  course-trainer records  in HashMap
        courseTrainerRecords.put("Java Programming", "Mr. Ahmed");
        courseTrainerRecords.put("Web Development", "Ms. Sara");
        courseTrainerRecords.put("Data Structures", "Dr. Ali");
        courseTrainerRecords.put("Database Systems", "Mr. Hassan");
        courseTrainerRecords.put("Cyber Security", "Ms. Fatima");

        //  Display all elements in the HashMap
        System.out.println(  courseTrainerRecords);

        //display the trainer of one specific course
        System.out.println("\nTrainer for 'Java Programming': " + courseTrainerRecords.get("Java Programming"));
        
        //  check if a course exists
        System.out.println("\n is Web Development exist in HashMap? " +courseTrainerRecords.containsKey("Web Development"));

        //  check if a course exists
        System.out.println("\n is Security exist in HashMap? " +courseTrainerRecords.containsKey("Security"));

    }
}
