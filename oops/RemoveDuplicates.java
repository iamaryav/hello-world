import java.util.*;
import java.util.stream.*;


public class RemoveDuplicates{
    public static void main(String[] args){
        List<Integer> numbers = List.of(5, 4, 5, 3, 9, 8, 2, 7, 6, 1, 8);
       List<Employee> employees = List.of(
        new Employee(1, "Ram", 100.00),
        new Employee(1, "Ram", 100.00),
        new Employee(1, "Ram", 100.00),
		new Employee(4, "Shyam", 100.00),
		new Employee(5, "Hari", 100.00),
		new Employee(2, "Mahesh", 100.00),
		new Employee(2, "Mahesh", 100.00),
		new Employee(2, "Mahesh", 100.00),
		new Employee(3, "Monu", 100.00));

        // Remove duplicate
        // remove odd number
        // sort 

        List<Integer> filteredNumbers = 
        numbers.stream()
        .distinct()
        .filter(x -> x % 2 == 0)
        .sorted()
        .toList();

        filteredNumbers.stream().forEach(System.out::println);

        long count=
        numbers.stream()
        .distinct()
        .filter(x -> x % 2 == 0)
        .count();

        long sum =
        numbers.stream()
        .distinct()
        .filter(x -> x % 2 == 0)
        .mapToInt(Integer::intValue)
        .sum();

        int min=
        numbers.stream()
        .distinct()
        .filter(x -> x % 2 == 0)
        .mapToInt(Integer::intValue)
        .min().getAsInt();

        int max=
        numbers.stream()
        .distinct()
        .filter(x -> x % 2 == 0)
        .mapToInt(Integer::intValue)
        .max().getAsInt();

       double avg=
        numbers.stream()
        .distinct()
        .filter(x -> x % 2 == 0)
        .mapToInt(Integer::intValue)
        .average().getAsDouble();


        // // Sequential approach (slower for large datasets)
        // long startSequential = System.currentTimeMillis();
        // long sumSequential = IntStream.rangeClosed(1, 10000)
        //         .map(x -> x * 2)
        //         .sum();
        // long endSequential = System.currentTimeMillis();
        // System.out.println("Sequential sum of squares: " + sumSequential);
        // System.out.println("Sequential time taken (ms): " + (endSequential - startSequential));

        // // Parallel approach (faster for large datasets)
        // long startParallel = System.currentTimeMillis();
        // long sumParallel = LongStream.rangeClosed(1, 10000)
        //         .parallel()  // Apply parallel processing
        //         .map(x -> x * 2)
        //         .sum();
        // long endParallel = System.currentTimeMillis();
        // System.out.println("Parallel sum of squares: " + sumParallel);
        // System.out.println("Parallel time taken (ms): " + (endParallel - startParallel));



       System.out.println("Count: " + count + " sum: " + sum + " min: " + min + " max: " + max + " avg: " + avg);

       Comparator<Employee> sortById = new Comparator<>(){
        @Override
        public int compare(Employee e1, Employee e2){
            return Integer.compare(e1.getId(), e2.getId());
        }
       };


       employees.stream()
    //    .sorted((e1, e2) -> Integer.compare(e1.getId(), e2.getId()))
        .sorted(sortById)
       .forEach(employee -> {
        System.out.println(employee.getId());
       });


       System.out.println("Duplicate Removed: ");
       

       List<Employee> uniqueEmployee = new ArrayList<>();

       for(Employee employee : employees){
        int id = employee.getId();
        boolean isExist = false;

        for(Employee uemployee : uniqueEmployee){
            if(uemployee.getId() == employee.getId()){
                isExist = true;
            }
        }

        if(!isExist){
            uniqueEmployee.add(employee);
        }
        
       }

       uniqueEmployee.stream()
       .forEach(e -> {
        System.out.println(e.getId());
       });

       // Removing duplicate by HashSet
       System.out.println("removing duplicate using hashset: ");

       HashSet<Integer> empIds = new HashSet<>();


       employees.stream()
       .filter(emp -> empIds.add(emp.getId()))
       .forEach(e -> {
        System.out.println("ids: " + e.getId());
       });

       


    }
}