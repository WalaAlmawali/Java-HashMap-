import java.util.*;
public class DepartmentManagerDemo {
    public static void main (String[] args){

        HashMap<String, String>  departmentManagerRecords = new HashMap<>();

        // Add  department-manager records

        departmentManagerRecords.put("Human Resources", "Aisha Al-Maamari");
        departmentManagerRecords.put("Finance", "Omar Al-Balushi");
        departmentManagerRecords.put("IT Department", "Sara Al-Harthy");
        departmentManagerRecords.put("Marketing", "Khalid Al-Riyami");
        departmentManagerRecords.put("Operations", "Fatima Al-Nabhani");

        // Display all elements in the HashMap
        System.out.println(departmentManagerRecords);

        // display the manager of one specific department
        System.out.println("\nManager of IT Department: " + departmentManagerRecords.get("IT Department"));

        // check if a department exists
        System.out.println("is Finance exist in the map?" +departmentManagerRecords.containsKey("Finance") );

        // check department that does NOT exist
        System.out.println("is Legal exist in the map?" +departmentManagerRecords.containsKey("Legal") );


    }
}
