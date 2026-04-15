import java.util.*;
public class EmployeeKeysValuesDemo {
    public static void main(String[] args){

        HashMap<Integer, String> employeeRecords  = new HashMap<>();
        //Add employee records in HashMap
        employeeRecords .put(1, "Ali");
        employeeRecords .put(2, "Sara");
        employeeRecords .put(3, "Mohammed ");
        employeeRecords .put(4, "Fatima ");
        employeeRecords .put(5, "Omar ");

        System.out.println(employeeRecords ); //  Display all elements in the HashMap
        System.out.println(employeeRecords.keySet()); //Display all employee IDs
        System.out.println(employeeRecords.values()); //Display all employee names
        employeeRecords .put(6, "Wala "); //Add one more employee record
        System.out.println(employeeRecords.keySet()); //Display all employee IDs
        System.out.println(employeeRecords.values()); //Display all employee names

    }
}
