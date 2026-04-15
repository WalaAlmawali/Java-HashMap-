import java.util.*;

public class EmployeeKeyLoopDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> employeeRecords = new HashMap<>();

        //Add employee records in HashMap
        employeeRecords.put(1, "Ali");
        employeeRecords.put(2, "Sara");
        employeeRecords.put(3, "Mohammed ");
        employeeRecords.put(4, "Fatima ");
        employeeRecords.put(5, "Omar ");

        System.out.println(employeeRecords); //  Display all elements in the HashMap

           //  Use keySet() to get all employee IDs
            for (Integer key : employeeRecords.keySet()) {

            // Use get() to retrieve the value for each key
            String name = employeeRecords.get(key);

            // Print each record
            System.out.println("ID: " + key + ", Name: " + name);
        }
        employeeRecords.put(6, "Wala "); // add one more records

        System.out.println("print the updated HashMap");

        //  Use keySet() to get all employee IDs
        for (Integer key : employeeRecords.keySet()) {

            // Use get() to retrieve the value for each key
            String name = employeeRecords.get(key);

            // Print each record
            System.out.println("ID: " + key + ", Name: " + name);
        }


}
}
