import java.util.*;

public class EmployeeClearDemo {
    public static void main(String[] args){

        HashMap<Integer, String> employeeRecords  = new HashMap<>();
        //Add employee records in HashMap
        employeeRecords .put(1, "Ali");
        employeeRecords .put(2, "Sara");
        employeeRecords .put(3, "Mohammed ");
        employeeRecords .put(4, "Fatima ");
        employeeRecords .put(5, "Omar ");

        System.out.println(employeeRecords ); //  Display all elements in the HashMap
        System.out.println(" size of HashMap are: "+employeeRecords.size()); //display the total number of employee records
        employeeRecords.clear();
        System.out.println(employeeRecords ); //  Display all elements in the HashMap after clearing
        System.out.println(" size of HashMap after clearing: "+employeeRecords.size()); //display the total number of employee records to confirm that the map is empty
        System.out.println("all records have been removed from HashMap");

    }
}
