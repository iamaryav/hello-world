import java.lang.Thread;
import java.util.stream.IntStream;

public class TestThread{
    public static void main(String[] args){

        Thread t1 = new Thread(new Thread1()); // New State
        Thread t2 = new Thread(new Thread2());
        Thread3 t3 = new Thread3();
        Thread t4 = new Thread(() -> {
            IntStream.range(1, 5).
            forEach(i -> {
                System.out.println("Thread 4: " + i);
            });
        });

        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start(); - Runnable state
        t2.start();
        t3.start();
        t4.start();

        // Wait for the threads to complete
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the modified map
        System.out.println("All threads completed successfully: ");
    }
}

class Thread1 implements Runnable{

    public void run(){
        IntStream.range(1, 10).
        forEach(i -> {
            System.out.println("Thread 1: " + i);
        });
    }
}

class Thread2 implements Runnable{

    public void run(){
        IntStream.range(1, 10).
        forEach(i -> {
            System.out.println("Thread 2: " + i);
        });
    }
}

class Thread3 extends Thread{

    public void run(){
        IntStream.range(1, 10).
        forEach(i -> {
            System.out.println("Thread 3: " + i);
        });
    }
}