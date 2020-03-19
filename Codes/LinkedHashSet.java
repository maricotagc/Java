
package org.mariana.collectionsExamples.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        //Declaration
        LinkedHashSet<String> linkedHashSetName = new LinkedHashSet<>();
        System.out.println("After declaration");
        for (String h : linkedHashSetName) {
            System.out.println(h);
        }

        //Addition
        linkedHashSetName.add("1");
        linkedHashSetName.add("0");
        linkedHashSetName.add("5");
        linkedHashSetName.add("3");
        linkedHashSetName.add("2");

        System.out.println();
        System.out.println("After addition");
        for (String h : linkedHashSetName) {
            System.out.println(h);
        }

        //Deletion
        linkedHashSetName.remove("2");
        System.out.println();
        System.out.println("After deletion of string '2'");
        for (String h : linkedHashSetName) {
            System.out.println(h);
        }

        //Duplication
        linkedHashSetName.add("1");
        linkedHashSetName.add("1");
        System.out.println();
        System.out.println("After duplication of string '1'");
        for (String h : linkedHashSetName) {
            System.out.println(h);
        }

        //Null
        linkedHashSetName.add(null);
        System.out.println();
        System.out.println("After addition of null");
        for (String h : linkedHashSetName) {
            System.out.println(h);
        }
    }
}
