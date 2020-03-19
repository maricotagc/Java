package org.mariana.collectionsExamples.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {
        //Declaration
        TreeMap<Integer, String> hashMapName = new TreeMap<>();
        System.out.println("After Declaration:");
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
        System.out.println("Return of .get(5): " + hashMapName.get(5));
        System.out.println();
        System.out.println("Return of .entrySet():" + hashMapName.entrySet());

        //Deletion
        hashMapName.remove(4);
        System.out.println();
        System.out.println("After Deletion of key = 4:");
        for (Map.Entry<Integer, String> entry : hashMapName.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + " ; Value: " + value);
        }

        //Duplication
        System.out.println();
        System.out.println("Before addition of duplicated (3, 'Second Try'), list's size is: " + hashMapName.size());
        hashMapName.put(3, "Second Try");
        System.out.println();
        System.out.println("After addition of duplicated (3, 'Second Try'), list's size is: " + hashMapName.size());

        //Nulls
        hashMapName.put(0, null);
        System.out.println();
        System.out.println("After adding NULL");
        for (Map.Entry<Integer, String> entry : hashMapName.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + " ; Value: " + value);
        }
    }
}
