import java.util.*;

public class EmployeeMapDemo {
    public static void main (String[] args) {

        HashMap<Integer, String> employeeRecords = new HashMap<>();

        //Add  employee record  in HashMap
        employeeRecords.put(1001, "Ali");
        employeeRecords.put(1002, "Sara");
        employeeRecords.put(1003, "Omar");
        employeeRecords.put(1004, "Fatima");
        employeeRecords.put(1005, "Hassan");

        //  Display all elements in the HashMap
        System.out.println(employeeRecords);
    }
}
