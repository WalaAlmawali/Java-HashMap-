import java.util.*;
public class EmployeeCheckDemo {
    public static void main(String[] args){

        HashMap<Integer, String> employeeRecords  = new HashMap<>();
        //Add employee records in HashMap
        employeeRecords .put(1, "Ali");
        employeeRecords .put(2, "Sara");
        employeeRecords .put(3, "Mohammed ");
        employeeRecords .put(4, "Fatima ");
        employeeRecords .put(5, "Omar ");

        System.out.println(employeeRecords ); //  Display all elements in the HashMap
        System.out.println(employeeRecords.containsKey(4)); // check whether a specific employee ID exists
        System.out.println(employeeRecords.containsKey(6)); // check whether a specific employee ID exists
        System.out.println(employeeRecords.containsValue("Sara")); //check whether a specific employee name exists
        System.out.println(employeeRecords.containsValue("Wala")); //check whether a specific employee name exists


    }
}
