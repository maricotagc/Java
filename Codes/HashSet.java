package org.mariana.collectionsExamples.Set;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        		//Set is composed of unique, unordered elements. It is part of Collections interface.

		//Declaration
		Set<String> hashset1 = new HashSet<>();
		Set<String> hashset2 = new HashSet<>();

		//Addition
		hashset1.add("Zambia");
		hashset1.add("Brasil");
		hashset1.add("Alemanha");
		hashset1.add("Equador");
		hashset1.add("Dinamarca");

		System.out.println();
		System.out.println("hashset1 after addition");
		System.out.println(hashset1);

		hashset2.add("Malasia");
		hashset2.add("Lituania");
		hashset2.add("Equador");
		hashset2.add("Alemanha");
		hashset2.add("Oma");

		System.out.println();
		System.out.println("hashset2 after addition");
		System.out.println(hashset2);

		//Duplication
		hashset1.add("Alemanha");
		System.out.println();
		System.out.println("hashset1 after duplication of string 'Alemanha'");
		System.out.println(hashset1);
		//Duplication
		hashset2.add("Malasia");
		System.out.println();
		System.out.println("hashset2 after duplication of string 'Malasia'");
		System.out.println(hashset2);

		//Intersection
		Set<String> intersection = new HashSet<>(hashset1);
		intersection.retainAll(hashset2);
		System.out.println(" ");
		System.out.println("Intersection: " + intersection);

		//Union
		Set<String> union = new HashSet<>(hashset1);
		union.addAll(hashset2);
		System.out.println(" ");
		System.out.println("Union: " + union);

		//Null addition
		union.add(null);
		System.out.println();
		System.out.println("Union after null addition: " + union);

		//Deletion
		union.remove(null);
		System.out.println();
		System.out.println("Union after deletion of null: " + union);

		//Sorting has to be through TreeSet
		Set<String> unionTreeSet = new TreeSet<>(union);
		System.out.println(" ");
		System.out.println("After transforming to TreeSet the elements are automatically sorted: " + unionTreeSet);
	}
    }
}
