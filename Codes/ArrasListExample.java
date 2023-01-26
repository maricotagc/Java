package mari.moita.com.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrasListExample {

    // Collection is an Interface with methods like add(), remove(), size(), contains()...
    // A List is an interface which extends from the Collection interface. It is numerically ordered.
    // Examples of Lists: ArrayList, LinkedList, Vector.

    private List<String> countries = new ArrayList<>();

    public void addCountry(String countryName) {
        countries.add(countryName);
    }

    public static void main(String[] args) {
        ArrasListExample practice = new ArrasListExample();

        // Adding values to the ArrayList
        practice.countries.add("Poland");
        practice.countries.add("Brazil");
        practice.countries.add("Switzerland");
        practice.countries.add("USA");

        // Showing all values in the ArrayList
        for (String country : practice.countries) {
            System.out.println(country);
        }

        // Showing only one part of the ArrayList (from index (included) to index (excluded))
        System.out.println("The countries contained from index 0 to 2 are: " + practice.countries.subList(0,2));

        // Getting the value from a specific index
        System.out.println("The country at index 1 is " + practice.countries.get(1));

        //Getting the index of a specific value
        System.out.println("The index of Brazil is " + practice.countries.indexOf("Brazil"));

        // Sorting an ArrayList
        Collections.sort(practice.countries);
        System.out.println("The countries' names in alphabetical order are: ");
        for (String country : practice.countries) {
            System.out.println(country);
        }

        // Removing an object through its value
        practice.countries.remove("Brazil");

        // Removing an object through its index
        practice.countries.remove(0);

        // Showing the updated ArrayList
        System.out.println("The new list of countries contains the following values:");
        for (String country : practice.countries) {
            System.out.println(country);
        }
    }
}
