/*
A private Singleton non parameterized constructor.
A public String instance variable named str.
Write a static method named getSingleInstance that returns the single instance of the Singleton class.
https://www.baeldung.com/java-singleton
https://www.youtube.com/watch?v=KUTqnWswPV4
*/

package mari.moita.com.Exercise8.Utils;

public class Singleton {

    private static Singleton INSTANCE;
    public String str = "Initial info class";

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
