import java.util.*;
public class EmployeeUpdateDemo {
    public static void main(String[] args){

        HashMap<Integer, String> employeeRecords  = new HashMap<>();
        //Add employee records in HashMap
        employeeRecords .put(1, "Ali");
        employeeRecords .put(2, "Sara");
        employeeRecords .put(3, "Mohammed ");
        employeeRecords .put(4, "Fatima ");
        employeeRecords .put(5, "Omar ");

        System.out.println(employeeRecords ); //  Display all elements in the HashMap
        employeeRecords.put(4, "Asma"); //updated value for  key 4
        System.out.println(employeeRecords ); //  Display updating HashMap
        System.out.println("Updated name for ID 4: " + employeeRecords.get(4));
        employeeRecords.put(1, "Salim"); // updated value for  key 1
        System.out.println(employeeRecords ); //  Display updating HashMap

    }
}
