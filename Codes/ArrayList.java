package org.mariana.collectionsExamples.List;
import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        	//ArrayList Declaration
		List<String> arrayListName = new ArrayList<>();

		System.out.println("Before addition");
		for (String item : arrayListName)
		{
			System.out.println(item);
		}

		//Addition
		arrayListName.add("Number 2");
		arrayListName.add("Number 1");
		arrayListName.add("Number 0");
		arrayListName.add("Number 3");

		System.out.println(" ");
		System.out.println("After addition");
		for (String item : arrayListName)
		{
			System.out.println(item);
		}

		//Get a value
		System.out.println();
		System.out.println(".get(0) = " + arrayListName.get(0));

		//Deletion
		arrayListName.remove(0);
		System.out.println(" ");
		System.out.println("After deletion of index 0");
		for (String item : arrayListName)
		{
			System.out.println(item);
		}

		//Duplication
		arrayListName.add(2, "Duplicated Index");
		System.out.println(" ");
		System.out.println("After duplication of i = 2");
		for (String item : arrayListName)
		{
			System.out.println(item);
		}

		//Null
		arrayListName.add(4,null);
		System.out.println(" ");
		System.out.println("After .add(4, null)");
		for (String item : arrayListName)
		{
			System.out.println(item);
		}

		//Using toArray()
		Object[] newArray = arrayListName.toArray();
		System.out.println(" ");
		System.out.println("Transforming ArrayList in Array");
		for (Object item : newArray)
		{
			System.out.println(item);
		}

		//Removing Null
		arrayListName.remove(4);
		System.out.println(" ");
		System.out.println("After removing null");
		for (String item : arrayListName)
		{
			System.out.println(item);
		}

		//Sorting a List
		System.out.println(" ");
		System.out.println("Unsorted arrayListName");
		for (String item : arrayListName)
		{
			System.out.println(item);
		}


		Collections.sort(arrayListName);
		System.out.println(" ");
		System.out.println("Sorted arrayListName");
		for (String item : arrayListName)
		{
			System.out.println(item);
		}

		//Using subList()
		List<String> subList = arrayListName.subList(1, 3);
		System.out.println(" ");
		System.out.println("Using subList()");
		for (String item : subList)
		{
			System.out.println(item);
		}
	}
}
