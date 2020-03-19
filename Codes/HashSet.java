package org.mariana.collectionsExamples.Set;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        //Declaration
        HashSet<String> hashSetName = new HashSet<>();
        System.out.println("After declaration");
        for (String h : hashSetName) {
            System.out.println(h);
        }

        //Addition
        hashSetName.add("1");
        hashSetName.add("0");
        hashSetName.add("5");
        hashSetName.add("3");
        hashSetName.add("2");

        System.out.println();
        System.out.println("After addition");
        for (String h : hashSetName) {
            System.out.println(h);
        }

        //Deletion
        hashSetName.remove("2");
        System.out.println();
        System.out.println("After deletion of string '2'");
        for (String h : hashSetName) {
            System.out.println(h);
        }
        System.out.println();

        //Duplication
        hashSetName.add("1");
        hashSetName.add("1");
        System.out.println();
        System.out.println("After duplication of string '1'");
        for (String h : hashSetName) {
            System.out.println(h);
        }
        System.out.println();

        //Null
        hashSetName.add(null);
        System.out.println();
        System.out.println("After null");
        for (String h : hashSetName) {
            System.out.println(h);
        }
    }
}
