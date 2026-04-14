import java.util.*;
public class EmployeeRemoveDemo {
    public static void main(String[] args){

        HashMap<Integer, String> employeeRecords  = new HashMap<>();
        //Add employee records in HashMap
        employeeRecords .put(1, "Ali");
        employeeRecords .put(2, "Sara");
        employeeRecords .put(3, "Mohammed ");
        employeeRecords .put(4, "Fatima ");
        employeeRecords .put(5, "Omar ");

        System.out.println(employeeRecords ); //  Display all elements in the HashMap
        employeeRecords.remove(1);
        System.out.println(employeeRecords ); //  Display all elements in the HashMap after removing
        employeeRecords.remove(4);
        System.out.println(employeeRecords ); //  Display all elements in the HashMap after removing again
        employeeRecords.remove(6);
        System.out.println(employeeRecords ); //  Display all elements in the HashMap after removing again

    }
}
