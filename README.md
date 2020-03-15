# Java

https://www.tutorialspoint.com/java/java_basic_syntax.htm

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
1. Default: accessible by classes in the same package. If none access level is specified, it will be the default.
2. Public: accessible by any other class in any package.
3. Protected: accessible in the same package and subclasses.
4. Private: accessible within the declared class.
    
## Non-access Modifiers
1. final (class): prevents the class from being subclassed.
2. final (method): the content of the method should not be changed by any outsider.
3. abstract: can be accessed using the class name followed by a dot and the name of the variable or method.

# Constructor

* It has the same name as the class.
* One class can have N constructors.
* Java automatically provides a default constructor.
* Constructors cannot be overridden.
* Contructors can have all types of access modifiers.

###### Notes
* Classes will always have DEFAULT or PUBLIC access modifiers.
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

## Other Operators

* Conditional Operator (Ternary)

Syntax: variable x = (expression) ? value if true : value if false

Example: b = (a == 1) ? 20: 30;

![](/images/operatorsPrecedence.jpg)

Pre-Increment: First the value is incremented by one and then the value is assigned to the variable.

Post-Increment: First the value is assigned to the variable and then incremented by one.

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
