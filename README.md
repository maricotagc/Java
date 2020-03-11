# Java

https://www.tutorialspoint.com/java/java_basic_syntax.htm

1. Variables
* Local Variables: seen only inside the method. They should be declared and initiated before the first use.
* Instance Variables (Non-static Variables): depend on instace of object to be seen. It is recommended to make these variables private. Default values: for numbers the default value is 0, for Booleans it is false and for object references it is null.
* Classes Variables (Static Variables): accessed by class. If a static attribute receives new value, this value will be reflected to all instances of the class.

```java
public class VariablesExample
{

public String instanceVariable = variable0;
public static String classVariable = variable1;

    public void LocalVariable()
    {
        String localVariable = variable2;
    }
} 

///Another class
public class Example2
{
    public static void main( String[] args ) {
       VariablesExample.classVariable; //how to access static variable from another class 
    }
}
```

2. Classes/Methods Modifiers

Access Modifiers
* Default: accessible by classes in the same package. If none access level is specified, it will be the default.
* Public: accessible by any other class in any package.
* Protected: accessible in the same package and subclasses.
* Private: accessible within the declared class.
    
Non-access Modifiers
* final (class): prevents the class from being subclassed.
* final (method): the content of the method should not be changed by any outsider.
* abstract: can be accessed using the class name followed by a dot and the name of the variable or method.

3. Constructor

* It has the same name as the class.
* One class can have N constructors.
* Java automatically provides a default constructor.
* Contructor can have different access modifiers:
- Default: allows classes from the entire package to instantiate the class.
- Public: allows classes also from other packages to instantiate the class.
- Protected: allows subclasses and classes from same package to instantiate the class.
- Private: doesn't allow any class to instantiate the class.

Notes:
-------------
* Classes will always have DEFAULT or PUBLIC access modifiers.
* Interfaces will always have PUBLIC access modifier (also methods/artifacts).

![](https://miro.medium.com/max/1500/1*GKGirEJ5-PaSz2bzGlRTjw.png)

4. Data Types

* Primitive Type: bite, int, char, boolean, short, long, float and double.
* Object Type: class objects and various types of array variables come under reference datatype.

5. Operators

--> Arithmetic 
* Addition: +
* Subtraction: -
* Multiplication: *
* Division: /
* Modulus: % (returns remainder)
* Increment: ++
* Decrement: --

--> Relational 
* Equal to: ==
* Not equal to: !=
* Greater than: >
* Less than: <
* Greater than or equal: >=
* Less than or equal: <=

--> Logical 
* AND: &&
* OR: ||
* NOT: !

--> Assignment

![](/images/assignmentOperators.jpg)

--> Other Operators

* Conditional Operator (Ternary)

Syntax: variable x = (expression) ? value if true : value if false

Example: b = (a == 1) ? 20: 30;

![](/images/operatorsPrecedence.jpg)

Pre-Increment: First the value is incremented by one and then the value is assigned to the variable.

Post-Increment: First the value is assigned to the variable and then incremented by one.

6. Loops

* While: tests the condition before executing the loop body.

```java
while(Boolean_expression) {
   // Statements
}
```

![](/images/while.jpg)

* For: useful when you know how many times a task is to be repeated

```java
for(initialization; Boolean_expression; update) {
   // Statements
}
```

![](/images/for_loop.jpg)


* Do-While: guaranteed to execute at least one time.

```java
do {
   // Statements
}while(Boolean_expression);
```
![](/images/do-while.jpg)

* Continue 

In a for loop, the continue keyword causes control to immediately jump to the update statement.

In a while loop or do/while loop, control immediately jumps to the Boolean expression.

```java
Live Demo
public class Test {

   public static void main(String args[]) {
      int [] numbers = {10, 20, 30, 40, 50};

      for(int x : numbers ) {
         if( x == 30 ) {
            continue;
         }
         System.out.print( x );
         System.out.print("\n");
      }
   }
}
/*
Prints: 
10
20
40
50
/*
```
* Break

When the break statement is encountered inside a loop, the loop is immediately terminated and the program control resumes at the next statement following the loop.

```java
public class Test {

   public static void main(String args[]) {
      int [] numbers = {10, 20, 30, 40, 50};

      for(int x : numbers ) {
         if( x == 30 ) {
            break;
         }
         System.out.print( x );
         System.out.print("\n");
      }
   }
}
/*
Prints:
10
20
*/
```
