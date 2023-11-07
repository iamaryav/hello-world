interface A{
    default void doSomething(){
        System.out.println("Interface A");
    }
}

interface B{
    default void doSomething(){
        System.out.println("Interface B");
    }
}

public class Oops implements A,B{
    
    public static void main(String args[]){
        Oops ops = new Oops();
        ops.doSomething();
    }
}