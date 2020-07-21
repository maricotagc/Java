package org.example;

public class B_IncrementAndDecrement {

    public static void main(String[] args) {

        //Prefix
        System.out.println("Prefix");
        System.out.println("--------");

        int a = 4;
        System.out.println("int a = 4;");
        System.out.println("* A is currently " + a);

        System.out.println("");

        int b = ++a;
        System.out.println("int b = ++a;");
        System.out.println("* Firstly A is incremented. At this moment A is " + a);
        System.out.println("* Secondly A is assigned to B. At this moment B is " + b);

        System.out.println("");

        //Postfix
        System.out.println("Postfix");
        System.out.println("--------");

        int c = 4;
        System.out.println("int c = 4;");
        System.out.println("* C is currently " + c);
        System.out.println("");

        int d = c++;
        System.out.println(" int d = c++;");
        System.out.println("* Firstly D receives C. " + "At this moment D is " + d );
        System.out.println("* Secondly C is incremented and its current value is " + c);
    }
}
