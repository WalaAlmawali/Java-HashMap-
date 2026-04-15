import java.util.*;
public class EmployeeCompareUpdateDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> employeeRecords = new HashMap<>();
        //Add employee records in HashMap
        employeeRecords.put(1, "Ali");
        employeeRecords.put(2, "Sara");
        employeeRecords.put(3, "Mohammed ");
        employeeRecords.put(4, "Fatima ");
        employeeRecords.put(5, "Omar ");

        System.out.println(employeeRecords); //  Display all elements in the HashMap
        System.out.println("current name for ID 5: "+employeeRecords.get(5)); // display the current value of a specific key
        employeeRecords.put(5, "Salah "); //Update employee name using put() with the same key
        System.out.println("updated name for ID 5: "+employeeRecords.get(5));// display the current value of a specific key

        System.out.println("current name for ID 1: "+employeeRecords.get(1)); // display the current value of a specific key
        employeeRecords.put(1, "Salem "); //Update employee name using put() with the same key
        System.out.println("current name for ID 1: "+employeeRecords.get(1)); // display the current value of a specific key

        System.out.println(employeeRecords); //  Display all elements in the HashMap after update

    }
}
