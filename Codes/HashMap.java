package org.mariana.collectionsExamples.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        //Map's Declaration
        Map<Integer, String> hashMapName = new HashMap<>();

        //Addition
        hashMapName.put(0, "Zero");
        hashMapName.put(5, "Cinco");
        hashMapName.put(1, "Um");
        hashMapName.put(4, "Quatro");
        hashMapName.put(2, "Dois");
        hashMapName.put(3, "Tres");

        System.out.println("\nAfter Addition:" + hashMapName);
        System.out.println("\nPrinting only the values:" + hashMapName.values());

        //Retrieval
        System.out.println("\nResult of .get(5): " + hashMapName.get(5));

        //Deletion
        hashMapName.remove(4);
        System.out.println("\nAfter Deletion of key = 4: " + hashMapName);

		//Iteration
		for (Map.Entry<Integer, String> entry : hashMapName.entrySet()) {
			System.out.println("\nEntry: " + entry);
		}
    }
}
