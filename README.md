# Java

https://www.tutorialspoint.com/java/java_basic_syntax.htm

1. Variables
* Local Variables: seen only inside the method.
* Instance Variables (Non-static Variables): depend on instace of object to be seen. 
* Classes Variables (Static Variables): accessed by class

'''java
public class HelloApp
{
    public static void main(String[] args)
    {
        String helloMessage;
        helloMessage = "Hello, World!";
        System.out.println(helloMessage);
    }
} 
'''

2. Classes/Methods Modifiers

Access Modifiers
* default: accessible by classes in the same package.
* public: accessible by any other class.
* protected: accessible in the same package and subclasses.
* private: accessible within the declared class.
    
Non-access Modifiers
* final (class): prevents the class from being subclassed.
* final (method): the content of the method should not be changed by any outsider
* abstract: can be accessed using the class name followed by a dot and the name of the variable or method.
