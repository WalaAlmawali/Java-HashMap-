import java.util.*;
public class CountryCapitalDemo {
     public static void main (String[] args){

        HashMap<String, String>  countryCapitalRecords = new HashMap<>();

        //Add country-capital records in HashMap
        countryCapitalRecords.put("Oman", "Muscat");
        countryCapitalRecords.put("UAE", "Abu Dhabi");
        countryCapitalRecords.put("Saudi Arabia", "Riyadh");
        countryCapitalRecords.put("Egypt", "Cairo");
        countryCapitalRecords.put("Jordan", "Amman");


        System.out.println( countryCapitalRecords); //  Display all elements in the HashMap

         System.out.println("Capital of Oman: " + countryCapitalRecords.get("Oman")); // display the capital of one specific country (Oman)
         System.out.println("is Egypt exist in HashMap? " + countryCapitalRecords.containsKey("Egypt")); // check  country name if exists or not
         countryCapitalRecords.put("UAE",  "Abu Dhabi (Updated)"); // update capital of UAE

         System.out.println( countryCapitalRecords); //  Display all elements in the HashMap after update
         System.out.println("Total number of countries: " + countryCapitalRecords.size()); // display total number of country records



    }
}
