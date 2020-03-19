package org.mariana.collectionsExamples.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        //Declaration
        HashMap<Integer, String> hashMapName = new HashMap<>();
        System.out.println("After declaration:");
        for (Map.Entry<Integer, String> entry : hashMapName.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + " ; Value: " + value);
        }

        //Addition
        hashMapName.put(0, "Zero");
        hashMapName.put(5, "Cinco");
        hashMapName.put(1, "Um");
        hashMapName.put(4, "Quatro");
        hashMapName.put(2, "Dois");
        hashMapName.put(3, "Tres");
        System.out.println();
        System.out.println("After Addition:");
        for (Map.Entry<Integer, String> entry : hashMapName.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + " ; Value: " + value);
        }

        //Retrieval
        System.out.println();
        System.out.println("Result of .get(5):\n" + hashMapName.get(5));
        System.out.println();
        System.out.println("Result of .entrySet():\n" + hashMapName.entrySet());

        //Deletion
        hashMapName.remove(4);
        System.out.println();
        System.out.println("After Deletion of key = 4:");
        for (Map.Entry<Integer, String> entry : hashMapName.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + " ; Value: " + value);
        }
    }
}
