public class Polymorphism{

    public static void main(String[] args){

        // A a = new A();
        // a.execute(); // ? Error


        // only override work because compiler doesn't know child class methods because object gets created at the run time
        // so first will work and second and third will throw and error
        // B b = new C();
        // b.printSomething();
        // b.execute(); // ? Hello World! from class C // error
        // b.printline(); //? Test print line // error


        // C c = new B();
        // c.execute(); // ? // error


        // B newB = new A();
        // newB.execute(); // ? // error

        // D d = new D();
        // d.printSomething(); // ? // Hello World! from A

        Z ops = new Z();
        ops.doSomething(); // Error
 
    }

}


interface A{
    default void printSomething(){
        System.out.println("Interface A: ");
    }
}

class B implements A{
    public void printSomething(){
        System.out.println("class B: ");
    }
}

class C extends B{

    public void printSomething(){
        System.out.println("class C: ");
    }

    public void execute() {
    System.out.println("Hello World! from class C");
  }

  public void printline(){
    System.out.println("Test print line");
  }

}

class D implements A {
}

interface X{
    default void doSomething(){
        System.out.println("Interface A");
    }
}

interface Y{
    default void doSomething(){
        System.out.println("Interface B");
    }
}

class Z implements X, Y{

}