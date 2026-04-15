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

      // display the name of one specific employee using ID
        System.out.println("\nEmployee with ID 1003: " + employeeRecords.get(1003));

      //  check if an employee ID exists
        System.out.println("\nis ID(1001) exist in the map? " + employeeRecords.containsKey(1001));

       //  check an ID that does not exist
        System.out.println("\nis ID(1006) exist in the map? " + employeeRecords.containsKey(1006));



    }
}
