[Documentation](https://www.tutorialspoint.com/java/)

# Design Patterns
## Variables Naming:
* case-sensitive;
* can include Unicode letters, digits, and two special characters ($, _);
* cannot start with a digit;
* must not be a keyword (class, static, int are illegal names);
* if a variable name is a single word it should be in lowercase;
* if a variable name includes multiple words it should be in lowerCamelCase;
* variable names should not start with _ and $ characters, although they are allowed.

# Variables
1. Local Variables: seen only inside the method. They should be declared and initiated before the first use.
2. Instance Variables (Non-static Variables): depend on instace of object to be seen. It is recommended to make these variables private. Default values: for numbers the default value is 0, for Booleans it is false and for object references it is null.
3. Classes Variables (Static Variables): accessed by class. If a static attribute receives new value, this value will be reflected to all instances of the class.

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

# Classes/ Methods Modifiers

## Access Modifiers
1. Default: accessible by classes in the same package. If none access level is specified, it will be the default. Inherited by sub-classes from the same package only.
2. Public: accessible by any other class in any package. Inherited by subClasses and behaves as public in SubClasses.
3. Protected: accessible only by the subClasses regardless the package. Inherited by subclasses and behave as private in subclasses.
4. Private: accessible within the declared class. Never inherited by subClasses.
    
## Non-access Modifiers
1. final (class): prevents the class from being subclassed.
2. final (method): the content of the method should not be changed by any outsider.
3. abstract: can be accessed using the class name followed by a dot and the name of the variable or method.

## Abstract Class
1. May or may not contain abstract methods.
2. If a class has at least one abstract method, then the class must be declared abstract.
3. It cannot be instantiated.
4. To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it.
5. If you inherit an abstract class, you have to provide implementations to all the abstract methods in it.

## Abstract Method
Implementation by subclasses.
* Abstract keyword before the method name in the method's signature.
* It doesn't contain a method body.
* Instead of curly braces, an abstract method will have a semoi colon (;) at the end.
* The class containing it must be declared as abstract.
* Any class inheriting the current class must either override the abstract method or declare itself as abstract.
* A method marked abstract cannot be private.

Example:
```java
 public abstract double computePay();
 ```
# Constructor

* It has the same name as the class.
* One class can have N constructors.
* Java automatically provides a default constructor.
* Constructors cannot be overridden.
* Contructors can have all types of access modifiers.

###### Notes
* Classes will always have DEFAULT or PUBLIC access modifiers (unless we talk about inner classes).
* Interfaces will always have PUBLIC access modifier (also methods/artifacts).

![](https://miro.medium.com/max/1500/1*GKGirEJ5-PaSz2bzGlRTjw.png)

# Data Types

1. Primitive Type: bite, int, char, boolean, short, long, float and double.
2. Object Type: class objects and various types of array variables come under reference datatype.

# Operators

## Arithmetic 
* Addition: +
* Subtraction: -
* Multiplication: *
* Division: /
* Modulus: % (returns remainder)
* Increment: ++
* Decrement: --

## Relational 
* Equal to: ==
* Not equal to: !=
* Greater than: >
* Less than: <
* Greater than or equal: >=
* Less than or equal: <=

## Logical 
* AND: &&
* OR: ||
* NOT: !

![](/images/assignmentOperators.jpg)

Pre-Increment: First the value is incremented by one and then the value is assigned to the variable.

Post-Increment: First the value is assigned to the variable and then incremented by one.

[Code Example - Increments](/Codes/Increment_Decrement.java)

## Other Operators

* Conditional Operator (Ternary)

Syntax: variable x = (expression) ? value if true : value if false

Example: b = (a == 1) ? 20: 30;

![](/images/operatorsPrecedence.jpg)


# Loops

## While: tests the condition before executing the loop body.

```java
while(Boolean_expression) {
   // Statements
}
```

![](/images/while.jpg)

## For: useful when you know how many times a task is to be repeated

```java
for(initialization; Boolean_expression; update) {
   // Statements
}
```

![](/images/for_loop.jpg)


## Do-While: guaranteed to execute at least one time.

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

* Enhanced for loop 

This is mainly used to traverse collection of elements including arrays.

Syntax: 
```java
for(declaration : expression) {
   // Statements
}
```

* Declaration is the type compatible with the elements of the array you are accessing.
* Expression can be an array variable or method call that returns an array.
```java
Live Demo
public class Test {
   public static void main(String args[]) {
   
      int [] numbers = {10, 20, 30, 40, 50};

      for(int x : numbers ) {
         System.out.print( x );
         System.out.print(",");
      }
      System.out.print("\n");
      String [] names = {"James", "Larry", "Tom", "Lacy"};

      for( String name : names ) {
         System.out.print( name );
         System.out.print(",");
      }
   }
}
/*
Output:
10,20,30,40,50

James, Larry, Tom, Lacy
*/
```
# Decision Making
## If
If the Boolean expression evaluates to true then the block of code inside the if statement will be executed. 
```java
int x = 10;

      if( x < 20 ) {
         System.out.print("This is if statement");
      }
//prints out: This is if statement
```
## If Else
If statement can be followed by an optional else statement, which executes when the Boolean expression is false.
```java
int x = 30;

      if( x < 20 ) {
         System.out.print("This is if statement");
      }else {
         System.out.print("This is else statement");
      }
   }
prints out: This is else statement
```
## If...else if...else
Very useful to test various conditions. Keep in mind:
* An if can have zero or one else's and it must come after any else if's.
* An if can have zero to many else if's and they must come before the else.
* Once an else if succeeds, none of the remaining else if's or else's will be tested.
```java
int x = 30;

      if( x == 10 ) {
         System.out.print("Value of X is 10");
      }else if( x == 20 ) {
         System.out.print("Value of X is 20");
      }else if( x == 30 ) {
         System.out.print("Value of X is 30");
      }else {
         System.out.print("This is else statement");
      }
   }
prints out: Value of X is 30
```
## Nested If
You can use one if or else if statement inside another if or else if statement.
```java
int x = 30;
int y = 10;

      if( x == 30 ) {
         if( y == 10 ) {
            System.out.print("X = 30 and Y = 10");
         }
      }
prints out: X = 30 and Y = 10
```
## Switch
Allows a variable to be tested for equality against a list of values (cases).

* The variable used can only be integers, convertable integers (byte, short, char), strings and enums.
* You can have any number of case statements.
* The value for a case must be the same data type as the variable and it must be a constant or a literal.
* When the variable being switched on is equal to a case, the statements following that case will execute until a break statement is reached.
* When a break statement is reached the flow jumps to the next line following the switch statement.
* If no break appears, the flow will fall through to subsequent cases until a break is reached.
* Optional default case must appear at the end of the switch. Used for when none of the cases is true. No break is needed in the default case.
```java
char grade = 'C';

      switch(grade) {
         case 'A' :
            System.out.println("Excellent!"); 
            break;
         case 'B' :
         case 'C' :
            System.out.println("Well done");
            break;
         case 'D' :
            System.out.println("You passed");
         case 'F' :
            System.out.println("Better try again");
            break;
         default :
            System.out.println("Invalid grade");
      }
      System.out.println("Your grade is " + grade);
   }

prints out: 
Well done
Your grade is " + grade
```
# Wrappers
## Boxing
Converting primitive data types into object.
```java
Integer x = 5; 
```
## Unboxing
Wrapper object being converted back to a primitive data type.
```java
x =  x + 10;
```
# Strings - Escapes
* \t : Inserts a tab
* \b : Inserts a backspace
* \n : Inserts a new line
* \r : Inserts a carriage return
* \f : Inserts a form feed
* \' : Inserts a single quote
* \" : Inserts a double quote
* \\ : Inserts a backslash
# Arrays
## Declaration
```java
//Example 1
dataType[] arrayRefVar = new dataType[arraySize];

//Example 2
dataType[] arrayRefVar = {value1, value2, value3};
```
## Iteration
For loop or foreach loop is used because all of the elements in an array have the same type and the size of the array is known.
```java
double[] myList = {1.9, 2.9, 3.4, 3.5};

      // Print all elements using for
      for (int i = 0; i < myList.length; i++) {
         System.out.println(myList[i] + " ");
      }
      // Print all elements using enhanced for
      for (double element: myList) {
         System.out.println(element);
```
# Methods
Syntax:
```java
modifier returnType nameOfMethod (Parameters List) {
   // method body
}
```
## Overloading
When a class has two or more methods by the same name but different parameters, it is known as method overloading.

## Overriding
When a subclass modifies a method from it's superclass.

##### Rules for overriding
* The parameters cannot be changed.
* The return type cannot be changed.
* The access level cannot be more restrictive than superclass'.
* Instance methods can be overridden only if they are inherited by the subclass.
* A method declared final cannot be overridden.
* A method declared static cannot be overridden but can be re-declared.
* A subclass within the same package as the instance's superclass can override any superclass method that is not declared private or final.
* A subclass in a different package can only override the non-final methods declared public or protected.
* An overriding method can throw any uncheck exceptions, regardless of whether the overridden method throws exceptions or not. However, the overriding method should not throw checked exceptions that are new or broader than the ones declared by the overridden method. The overriding method can throw narrower or fewer exceptions than the overridden method.
* Constructors cannot be overridden.

## This keyword
Used as a reference to the object of the current class. Used to:
* Differentiate the instance variables from local variables if they have same names.
```java
class Student {
   int age;   
   Student(int age) {
      this.age = age;	
   }
}
```
* Call one type of constructor (parametrized constructor or default) from other in a class. 
```java
class Student {
   int age
   Student() {
      this(20);
   }
   
   Student(int age) {
      this.age = age;	
   }
}
```
# Exceptions
1. Checked exceptions: also known as compile time exceptions. The code will not be execute if these exceptions are not taken care.
2. Unchecked exceptions: also known as runtime exceptions. Programming bugs (logical and improper use of API). 

## Catching exceptions
A try/catch block is placed around the protected code that might generate an exception.

A try block can be followed by multiple catch blocks.

Single Catch Example:
```java
public class ExcepTest {

   public static void main(String args[]) {
      try {
         int a[] = new int[2];
         System.out.println("Access element three :" + a[3]);
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception thrown  :" + e);
      }
      System.out.println("Out of the block");
   }
}
```
Result:

Exception thrown  :java.lang.ArrayIndexOutOfBoundsException: 3

Out of the block

Multiple Catches Example:
```java
catch (IOException|FileNotFoundException ex) {
   logger.log(ex);
   throw ex;
```
# The Throws/ Throw Keywords
If a method does not handle a checked exception, the method must declare it using the throws keyword.

Keep the following points in mind when writing your own exception classes:

* All exceptions must be a child of Throwable.
* If you want to write a checked exception that is automatically enforced by the Handle or Declare Rule, you need to extend the Exception class.
* If you want to write a runtime exception, you need to extend the RuntimeException class.

Example:
```java
public void deposit(double amount) throws RemoteException {
      // Method implementation
      throw new RemoteException();
   }
   // Remainder of class definition
}
```

## Example of Throw + Catch
```java
public void nameBuilder(String name) throws Exception {
        if (name == null) {
            throw new Exception("Name cannot be null.");
        }
    }

public void callNameBuilder() {
        try {
            nameBuilder("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
```
# Inheritance
The class which inherits the properties of other is known as subclass (derived class, child class) and the class whose properties are inherited is known as superclass (base class, parent class).

If classA extends classB and if members of both classes have the names, to differentiate these variables we use super keyword.

If classA implements classB means that classB is an interface and classB is type of classA. A class can only extend one superclass but a class can implement multiple interfaces.

![](https://www.tutorialspoint.com/java/images/types_of_inheritance.jpg)

# Polimorphism
Ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.

Example:
```java
public interface Vegetarian{}
public class Animal{}
public class Deer extends Animal implements Vegetarian{}
```
Deer class is considered to be polymorphic since this has multiple inheritance.

* A Deer IS-A Animal
* A Deer IS-A Vegetarian
* A Deer IS-A Deer
* A Deer IS-A Object

# Interfaces
0. Contains behaviors that a class implements.
1. It is a collection of abstract methods. 
2. It may contain constants, default methods, static methods, and nested types. 
3. Method bodies exist only for default methods and static methods.
4. It cannot be instantiated.
5. It doesn't contain constructors.
6. The only fields that can appear in an interface must be declared both static and final.
7. It can be implemented by many classes
8. An interface can extend another interface

Example:
```java
interface Animal {
   public void eat();
   public void travel();
}

## Implementation
```java
public class MammalInt implements Animal {

   public void eat() {
      System.out.println("Mammal eats");
   }

   public void travel() {
      System.out.println("Mammal travels");
   } 

   public int noOfLegs() {
      return 0;
   }
}
```
# Collections
![](/images/comparison.jpg)

## ArrayList
[Official Doc](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)

[Code Example](/Codes/ArrayList.java)

## LinkedList
[Official Doc](https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html)

[Code Example](/Codes/LinkedList.java)

## HashSet
It doesn't have any order.

[Official Doc](https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html)

[Code Example](/Codes/HashSet.java)

## LinkedHashSet
It has order of insertion.

[Official Doc](https://docs.oracle.com/javase/7/docs/api/java/util/LinkedHashSet.html)

[Code Example](/Codes/LinkedHashSet.java)

## TreeSet
[Official Doc](https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html)

[Code Example](/Codes/TreeSet.java)

## HashMap
* It doesn't have any order. 
* It doesn't accept duplicates.

[Official Doc](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)

[Code Example](/Codes/HashMap.java)


## LinkedHashMap 
* It has order of insertion.
* It doesn't accept duplicates.

[Official Doc](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html)

[Code Example](/Codes/LinkedHashMap.java)

## TreeMap
* It has natural order.
* It doesn't accept duplicates.

[Official Doc](https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html)

[Code Example](/Codes/TreeMap.java)

# Reading data from a file
Scanner (java.util.Scanner) class allows a program to read data from an input.

## One line input 
There are two ways to read strings with a Scanner class. 
* If input has integer or a single word, the data can be read using next() method.
* If input has integer or a more than one word, the data can be read using nextLine() method.

[Code Example - Reading from one line](/Codes/Scanner_ReadOneLine.java)

## Multiline input
The position of a cursor and the reading methods behavior should be taken into consideration.

[Code Example - Reading from a file 1](/Codes/ScannerFile.java)

[Code Example - Reading from a user input](/Codes/ScannerUser.java)

## Using a file
[Code Example - Reading from a file 2 ](/Codes/ReadFromFile.java)

# Casting

[Code Example - String to int](/Codes/StringToInt.java)

# Strinbuilder
More performatic than concatenating strings.

[Code Example - Stringbuilder](/Codes/StringTask.java)

# Database

## Creating a connection with the database requires
* Host (computer/server): a host is a computer which has different applications (ex.: database application). It can be referred by its IP or its name.
* Port for the database: a host can have n ports which will be dedicated to different kinds of applications (ex.: port 1521 is dedicated for Oracle database app, port 5432 is dedicated to Postgree database app)
* User (schema): one database (FenergoDb) can have n schemas containing a set of tables.
* Password for each schema.

Format: jdbc:oracle:thin:<user>/<password>@hostname or ip:port:database
    
Example: jdbc:oracle:thin:mariana/senha123@localhost:5221:librarydb
    
[Code Example - Connection to the database](/Codes/DatabaseConnection.java)

## Creating tables in the database

[Code Example - Table Creation](/Codes/DatabaseTableCreation.java)

## Executing an insertion query in the database requires:

* Connection object 
* Method (prepareStatement) from Connection object which will use a SQL query as argument and will return an object of type = PreparedStatement
* Method (executeUpdate) from PreparedStatement object which will return an integer number which represents the number of rows affected in the db

[Code Example - Insert query in the database](/Codes/DatabaseQueryInsert.java)

## Executing a simple query in the database requires:

* Connection object 
* Method (prepareStatement) from Connection object which will use a SQL query as argument and will return an object of type = PreparedStatement
* Method (executeQuery) from PreparedStatement object which will return an object of type = ResultSet
* While condition containing next method from result set which verifies if result set has a next row to be read.

[Code Example - Simple query in the database](/Codes/DatabaseSimpleQuery.java)
