//An ArrayList is a resizable array that can grow as needed.
//
//It allows you to store elements and access them by index.

// Import the ArrayList class
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;

class basic {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);


        HashSet<String> cars1 = new HashSet<String>();
        cars1.add("Volvo");
        cars1.add("BMW");
        cars1.add("Ford");
        cars1.add("BMW");  // Duplicate
        cars1.add("Mazda");
        System.out.println(cars1);

        HashSet<String> Fruits = new HashSet<String>();
        Fruits.add("Banana");
        Fruits.add("BANANA");
        Fruits.add("Cherry");
        Fruits.add("Guava");
        Fruits.add("Strawberry");
        System.out.println(Fruits);

        HashMap<String, String> CapitalCities = new HashMap<String, String>();
        CapitalCities.put("India", "New Delhi");
        CapitalCities.put("Singapore", "Singapore");
        CapitalCities.put("Japan", "Tokyo");
        System.out.println(CapitalCities);
        System.out.println(CapitalCities.get("India"));
        System.out.println("\n");
        Iterator<String> it = cars.iterator();

        while (it.hasNext()){
            System.out.println(it.next()+" hihihiHA");
        }
    }
}