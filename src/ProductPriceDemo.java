import java.util.*;
public class ProductPriceDemo {
    public static void main(String[] args) {
        HashMap<String, Double>  productRecords = new HashMap<>();

        //Add employee records in HashMap
        productRecords.put("Laptop", 750.50);
        productRecords.put("Phone", 350.75);
        productRecords.put("Tablet", 220.40);
        productRecords.put("Headphones", 45.99);
        productRecords.put("Smartwatch", 120.00);


        System.out.println( productRecords); //  Display all elements in the HashMap
        System.out.println("Price of Laptop: " + productRecords.get("Laptop")); //display the price of one specific product
        System.out.println("is Headphones exists in the HashMap? "+ productRecords.containsKey("Headphones"));
        productRecords.put("Smartwatch", 160.00); // update value(price ) of Smartwatch
        productRecords.remove("Phone"); // remove Phone from HashMap
        System.out.println( productRecords); //  Display all elements in the HashMap after update
        System.out.println("Total number of products: " + productRecords.size()); // display size of HashMap



    }

}
