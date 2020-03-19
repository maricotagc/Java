package org.mariana.collectionsExamples.List;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        //Declaration
        LinkedList<String> linkedListName = new LinkedList<>();

        System.out.println("After declaration");
        for (int i = 0; i <= linkedListName.size() - 1; i++) {
            System.out.println(linkedListName.get(i));
        }

        //Addition
        linkedListName.add("Number 2");
        linkedListName.add("Number 1");
        linkedListName.add("Number 0");
        linkedListName.add("Number 3");
        System.out.println();
        System.out.println("After addition");
        for (int i = 0; i <= linkedListName.size() - 1; i++) {
            System.out.println(linkedListName.get(i));
        }

        //Retrieval
        System.out.println();
        System.out.println("After .get(0)");
        for (int i = 0; i <= linkedListName.size() - 1; i++) {
            System.out.println(linkedListName.get(i));
        }

        //Deletion
        linkedListName.remove(0);
        System.out.println();
        System.out.println("After .remove(0)");
        for (int i = 0; i <= linkedListName.size() - 1; i++) {
            System.out.println(linkedListName.get(i));
        }

        //Duplication
        linkedListName.add(2, "Duplicated Index");
        System.out.println();
        System.out.println("After duplication of i=2");
        for (int i = 0; i <= linkedListName.size() - 1; i++) {
            System.out.println(linkedListName.get(i));
        }

        //Null
        linkedListName.add(null);
        System.out.println();
        System.out.println("After null");
        for (int i = 0; i <= linkedListName.size() - 1; i++) {
            System.out.println(linkedListName.get(i));
        }

    }
}
