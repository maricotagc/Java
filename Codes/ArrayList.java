package org.mariana.collectionsExamples.List;
import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        //Declaration
        ArrayList<String> arrayListName = new ArrayList<>();

        System.out.println("After declaration");
        for (int i = 0; i <= arrayListName.size() - 1; i++) {
            System.out.println(arrayListName.get(i));
        }

        //Addition
        arrayListName.add("Number 2");
        arrayListName.add("Number 1");
        arrayListName.add("Number 0");
        arrayListName.add("Number 3");

        System.out.println("After addition");
        for (int i = 0; i <= arrayListName.size() - 1; i++) {
            System.out.println(arrayListName.get(i));
        }

        //Retrieval
        System.out.println();
        System.out.println("Retrieval --> .get(0) = " + arrayListName.get(0));

        //Deletion
        arrayListName.remove(0);
        System.out.println("After deletion of i=0");
        for (int i = 0; i <= arrayListName.size() - 1; i++) {
            System.out.println(arrayListName.get(i));
        }

        //Duplication
        arrayListName.add(2, "Duplicated Index");
        System.out.println("After duplication of i=2");
        for (int i = 0; i <= arrayListName.size() - 1; i++) {
            System.out.println(arrayListName.get(i));
        }

        //Null
        arrayListName.add(0,null);
        System.out.println("After .add(0, null)");
        for (int i = 0; i <= arrayListName.size() - 1; i++) {
            System.out.println(arrayListName.get(i));
        }
    }
}
