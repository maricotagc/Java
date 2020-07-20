package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        System.out.println(((Integer.parseInt(n) + 1) * Integer.parseInt(n) + 2) * Integer.parseInt(n) + 3);
    }
}
