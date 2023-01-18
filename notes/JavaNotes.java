public class JavaNotes {

   /**
    * Java 8 features, HashMaps, lambda expression,
    * Array and arraylist, Arraylist and vector
    * 
    * 
    * 
    * 
    * Java
    * Stack(fixed size assigned to every program) and Heap memory(memory assigned
    * at runtimse)
    * Java as OOPS(Has primitive types and these doesn't belongs to any classes)
    * Java doesn't uses pointers, multiple Inheritance and not complete compiled
    * language
    * data members(properties), Instance variables + methods (behavior), function
    * JIT Compiler
    * compiler(Translator) = source code -----> machine executable code
    * Constructor Overloading
    * Copy constructor = Creating new object from old object of the same class
    * main method can be overloaded
    * Method overloading and method overriding
    * final keyword
    * final(to implement restrictions), finally(runs after exception handling),
    * finalize(prior to the garbage collection)
    * super (use to access overridden variables and methods and parent class
    * constructor)
    * static method can be overloaded
    * static method, variables(Belongs to the class not to the object) and
    * classes(Only inner class can be static) in java
    * classloader(program in JRE that loads the class in JVM when required)
    * shallow copy - diff ref pointing to the same objects (memory location)
    * Deep copy - create a new object and copy the old object data to new object
    * one by one
    * clone() method do the deep copy internally
    * Making string immutable(we can't change the object after created)
    * Reasons - Security, Memory efficiency, Multithreading, collections
    * key(HashMap)
    * 
    * Singleton class - classes whose object are created only once
    * 
    * size of variable - Integer - 2^32 that means(-2^31 to +2^31)
    * size 4 bytes that means 2^(8*4)
    * String, StringBuffer and StringBuilder(thread safe for single thread)
    * (Storage area, mutability, efficiency, Thread Safe)
    * 
    * diff between Interfaces and abstract classes
    * Availability of methods, variable type, Inheritance, Implementation
    * abstract and final are not allowed in java together
    * comparator in java - to sort the objects based on the values
    * Method Hiding
    * diff JDK, JRE and JVM
    * JDK = JRE + Development Tools
    * JRE = JVM + Library to execute the application
    * JVM = Runtime environment to java byte code
    * Reflection in java
    * Threading in java
    * Program and process
    * Diff b/w throw and throws
    * IS-A relationship is an another name of inheritance.
    * transient keyword will prevent the serializtion of an attribute.
    * NoSuchMethodError when static keyword is not present for main method.
    * Inheritance vs composition
    * parent and child class, by creating objects
    * >> Bitwise Right shift Operator
    * >>> Bitwise Right Shift Operator with trainling zero
    * Compostion and Aggregation
    * Holds the objects and holds the reference of the obhjects
    * String literal vs new String();
    * excceding the heap memory in java
    * Java Synchronization a method
    * if a method is synchronized it can only be used by only one resource
    * varargs in java
    * ex- String... variables
    * Order of execution in java program
    * Static variable > static block > static method > instance variable > Instance
    * block > instance method > constructor
    * 
    * Define System.out.println() - Used to print the message on the console
    * System - System is the class present in the java lang package
    * out - is the static variable of type PrintStream Present in the system class
    * println - method present in the class PrintStream
    * Java thread life cycle
    * New when instance is created > Runnable once the start method invoked and
    * before run method > Running when the run method is called >
    * > Non Runnable (Blocked/waiting) > Terminated once the run method execution
    * in completed
    * marker Interface - helps the complier and JVM to get run time related
    * information regarding objects
    * a-97
    * A-
    * Best way to inject the dependency is the constructor injection
    * Optional way is the setter injection
    * Spring bean scope five types of scope
    * 
    * 
    * 
    * 
    * 
    * 
    * 
    * 
    * 
    */

   public static void main(String[] args) {
      /**
       * 
       * 
       * 
       * 
       */
      Integer value = 1;
      System.out.println("Value: " + value);

   }

}
