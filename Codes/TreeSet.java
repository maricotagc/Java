package org.mariana.collectionsExamples.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        //Declaration
        TreeSet<String> treeSetName = new TreeSet<>();
        System.out.println("After declaration");
        for (String h : treeSetName) {
            System.out.println(h);
        }

        //Addition
        treeSetName.add("1");
        treeSetName.add("0");
        treeSetName.add("5");
        treeSetName.add("3");
        treeSetName.add("2");

        System.out.println();
        System.out.println("After addition");
        for (String h : treeSetName) {
            System.out.println(h);
        }

        //Deletion
        treeSetName.remove("2");
        System.out.println();
        System.out.println("After deletion of  string '2'");
        for (String h : treeSetName) {
            System.out.println(h);
        }

        //Duplication
        treeSetName.add("1");
        treeSetName.add("1");
        System.out.println();
        System.out.println("After duplication of string '1'");
        for (String h : treeSetName) {
            System.out.println(h);
        }
    }
}
