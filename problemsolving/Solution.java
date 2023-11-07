import java.util.HashMap;
import java.util.Map;
import java.lang.Thread;
import java.lang.Runnable;

public class Solution{
    public static void main(String[] args){
        
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Aryav");
        hm.put(2, "Rahul");

        for(Map.Entry<Integer, String> el : hm.entrySet()){
            System.out.println("key: " + el.getKey());
            System.out.println("value: " + el.getValue());
        }

        hm.forEach((k, v) -> {
            System.out.println("key: " + k);
            System.out.println("value: " + v);
        });

        for(Map.Entry<Integer, String> cl : hm.entrySet()){
            System.out.println("Key: " + cl.getKey());
            System.out.println("value: " + cl.getValue());
        }

        Parent p = new Parent();
        Parent p2 = new Child();
        Child c = new Child();

        Parent.method2();
        Child.method2();
        p.method2();
        p2.method2();
        c.method2();

        A a = new A();
        B b = new B();
        C c1 = new C();
        Thread d  = new Thread(new D());

        a.start();
        b.start();
        c1.start();
        d.start();
       p.method1();
       p2.method1();

        
       // Integer check;
       // int intCheck;
       // 
       // System.out.println("value of intcheck: " + intCheck);
       // System.out.println("value of check: " + check);

       // while(True){
       //     System.out.println("This is infinite loop");
       // }
       // for(;;){
       //     System.out.println("This is infinite loop");
       // }

       // do{

       // }while(True);

    }
}

class Parent{
    private String name;

    public void method1(){
       System.out.println("private method"); 
    }

    public static void method2(){
        System.out.println("Parent Static method");
    }
}

class Child extends Parent{
    private String name;

    public int method1(){
       System.out.println("private method"); 
    }

    public static void method2(){
        System.out.println("Child Static method");
    }
}

public class A extends Thread{
    public void run(){
        System.out.println("Thread A");
    }
}

public class B extends Thread{
    public void run(){
        System.out.println("Thread B");
    }
}

public class C extends Thread{
    public void run(){
        System.out.println("Thread C");
    }
}

public class D implements Runnable{
    public void run(){
        System.out.println("Thread D");
    }
}