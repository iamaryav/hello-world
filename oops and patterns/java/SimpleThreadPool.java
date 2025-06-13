import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SimpleThreadPool {

  public static void main(String[] args) throws InterruptedException {

    // Create a thread pool with 2 worker threads
    ExecutorService executor = Executors.newFixedThreadPool(2);

    // Define tasks to be executed
    Runnable task1 = () -> {
      System.out.println("Task 1 started by Thread: " + Thread.currentThread().getName());
      try {
        Thread.sleep(2000); // Simulate some work
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("Task 1 completed by Thread: " + Thread.currentThread().getName());
    };

    Runnable task2 = () -> {
      System.out.println("Task 2 started by Thread: " + Thread.currentThread().getName());
      try {
        Thread.sleep(4000); // Simulate some work
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("Task 2 completed by Thread: " + Thread.currentThread().getName());
    };

    Runnable task3 = () -> {
      System.out.println("Task 3 started by Thread: " + Thread.currentThread().getName());
      try {
        Thread.sleep(1000); // Simulate some work
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("Task 3 completed by Thread: " + Thread.currentThread().getName());
    };

    // Submit tasks to the thread pool
    executor.submit(task1);
    executor.submit(task2);
    executor.submit(task3);

    // Wait for all tasks to finish
    executor.shutdown();
    executor.awaitTermination(10, TimeUnit.SECONDS); // Wait for 10 seconds for tasks to complete

    System.out.println("All tasks completed!");
  }
}