# Java

https://www.tutorialspoint.com/java/java_basic_syntax.htm

1. Variables
* Local Variables: seen only inside the method. Tehy should be declared and and initiated before the first use.
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

![](https://miro.medium.com/max/1500/1*GKGirEJ5-PaSz2bzGlRTjw.png)

4. Data Types

* Primitive Type: bite, int, char, boolean, short, long, float and double.
* Object Type: class objects and various types of array variables come under reference datatype.

