package org.mariana.collectionsExamples.Map;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

    public static void main(String[] args) {
        //Declaration
        LinkedHashMap<Integer, String> linkedHashMapName = new LinkedHashMap<>();
        System.out.println("After Declaration:");
        for (Map.Entry<Integer, String> entry: linkedHashMapName.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + " ; Value: " + value);
        }

        //Addition
        linkedHashMapName.put(0, "Zero");
        linkedHashMapName.put(5, "Cinco");
        linkedHashMapName.put(1, "Um");
        linkedHashMapName.put(4,"Quatro");
        linkedHashMapName.put(2, "Dois");
        linkedHashMapName.put(3, "Tres");
        System.out.println();
        System.out.println("After Addition:");
        for (Map.Entry<Integer, String> entry: linkedHashMapName.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + " ; Value: " + value);
        }

        //Retrieval
        System.out.println();
        System.out.println("Return of .get(5):" + linkedHashMapName.get(5));
        System.out.println();
        System.out.println("Return of .entrySet():" + linkedHashMapName.entrySet());

        //Deletion
        linkedHashMapName.remove(4);
        System.out.println();
        System.out.println("After Deletion of key = 4:");
        for (Map.Entry<Integer, String> entry: linkedHashMapName.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + " ; Value: " + value);
        }

        //Duplication
        System.out.println();
        System.out.println("Before addition of duplicated (3, 'Second Try'), list's size is: " + linkedHashMapName.size());
        linkedHashMapName.put(3, "Second Try");
        System.out.println();
        System.out.println("After addition of duplicated (3, 'Second Try'), list's size is: " + linkedHashMapName.size());

        //Nulls
        linkedHashMapName.put(0,null);
        System.out.println();
        System.out.println("After adding NULL");
        for (Map.Entry<Integer, String> entry: linkedHashMapName.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + " ; Value: " + value);
        }
    }
}
