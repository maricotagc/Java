package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        //Create Scanner object to read command line input
        Scanner scanner7 = new Scanner(System.in);
        System.out.println("Enter 4 Numbers");

        //Capture the entire line entered
        String inputs = scanner7.nextLine();

        //Split the line into tokens using Stream() and mapping to integer array
        int[] intArray = Stream.of(inputs.split("\\s+")).mapToInt(Integer::parseInt).toArray();

        //Print out each array element
        for (int i : intArray) {
            System.out.println("Num: " + i);
        }
    }
}
