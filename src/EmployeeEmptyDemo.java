import java.util.*;
public class EmployeeEmptyDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> employeeRecords = new HashMap<>();

        //Add employee records in HashMap
        employeeRecords.put(1, "Ali");
        employeeRecords.put(2, "Sara");
        employeeRecords.put(3, "Mohammed ");
        employeeRecords.put(4, "Fatima ");
        employeeRecords.put(5, "Omar ");

        System.out.println(employeeRecords); //  Display all elements in the HashMap
        System.out.println(employeeRecords.isEmpty()); //check if HashMap empty or not
        employeeRecords.clear(); // remove all records from HashMap
        System.out.println(employeeRecords); //  Display all elements in the HashMap after clearing
        System.out.println(employeeRecords.isEmpty()); //check if HashMap empty or not
    }
}
