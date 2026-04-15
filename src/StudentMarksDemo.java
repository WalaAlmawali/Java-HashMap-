import java.util.*;
public class StudentMarksDemo {
    public static void main(String[] args) {
        HashMap<Integer, Integer>  studentRecords = new HashMap<>();

        //Add employee records in HashMap
         studentRecords.put(1, 90);
         studentRecords.put(2, 85);
         studentRecords.put(3, 77);
         studentRecords.put(4, 65);
         studentRecords.put(5, 80);

        System.out.println( studentRecords); //  Display all elements in the HashMap
        System.out.println( "mark of studenr with id 4 is: "+ studentRecords.get(4)); //display the mark of one specific student who has id 4

        System.out.println("is student who has ID 4 exist? "+studentRecords.containsKey(4)); // check whether one student ID exists
        studentRecords.put(3, 88); // Update the mark of  student with ID 3

        System.out.println(" updated HashMap:");
        System.out.println( studentRecords); //  Display updated HashMap
        studentRecords.remove(5);
        System.out.println(" updated HashMap after removal :");
        System.out.println( studentRecords); //  Display updated HashMap after removal
        System.out.println(" number of student in HashMap "+ studentRecords.size()); // display the size of HashMap



    }
}
