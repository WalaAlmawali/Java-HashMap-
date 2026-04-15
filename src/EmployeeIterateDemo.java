import java.util.*;
public class EmployeeIterateDemo {
    public static void main(String[] args){

        HashMap<Integer, String> employeeRecords  = new HashMap<>();
        //Add employee records in HashMap
        employeeRecords .put(1, "Ali");
        employeeRecords .put(2, "Sara");
        employeeRecords .put(3, "Mohammed ");
        employeeRecords .put(4, "Fatima ");
        employeeRecords .put(5, "Omar ");

        System.out.println(employeeRecords ); //  Display all elements in the HashMap

        // Use entrySet() with a loop to display each employee record separately
        for (Map.Entry<Integer, String> x : employeeRecords.entrySet()) {
            System.out.println("ID: " +x.getKey() + ", Name: " + x.getValue());
        }

        employeeRecords .put(6, "Wala"); // add one more employee records
        System.out.println("updated HashMap :");

       // Use entrySet() with a loop to display each employee record separately
        for (Map.Entry<Integer, String> x : employeeRecords.entrySet()) {
            System.out.println("ID: " +x.getKey() + ", Name: " + x.getValue());
        }

    }
}
