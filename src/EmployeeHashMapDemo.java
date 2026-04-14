
import java.util.*;
public class EmployeeHashMapDemo {
    public static void main(String[] args){

        HashMap<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(100, "Ali");
        employeeMap.put(101, "Sara ");
        employeeMap.put(102, "Mohammed ");
        employeeMap.put(103, "Fatima ");
        employeeMap.put(104, "Omar ");

        System.out.println(employeeMap); //  Display all elements in the HashMap
        employeeMap.put(105, "Wala"); // add one more employee

        System.out.println(employeeMap);

    }
}
