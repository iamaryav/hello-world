import java.util.*;

public class Temp{
    public static void main(String[] args){
        List<Integer> numb = List.of(1, 2, 3 , 4, 4, 5, 6, 18, 8, 12, 13, 12);
        List<Integer> arInt = List.of(0, 1, 0, 1, 0);
        List<Person> persons = List.of(new Person("Bob", 21), new Person("Tom", 20), new Person("Alice", 26), new Person("Alice", 23));
        List<String> names = List.of("Hi", "Hello", "Alice","Zebra", "Bob");


        // List<Integer> filteredNumber = 
        // numb.stream()
        // .filter(n -> n % 2 == 0)
        // .distinct()
        // .sorted()
        // .toList();

        List<Integer> filteredNumber = 
        numb.stream()
        .filter(n -> n % 2 == 0)
        .distinct()
        .sorted((a, b) -> b.compareTo(a))
        .toList();

        List<String> sNames =
        names.stream()
        // .sorted() 
        .sorted(Comparator.reverseOrder())
        .toList();
        
       // Object manipulation 
       // Creating custom comparator
        Comparator<Person> nameSort = new Comparator<Person>(){
            @Override
            public int compare(Person p1, Person p2){
                return p1.getName().compareTo(p2.getName());
            }
        };

        Comparator<Person> ageSort = new Comparator<Person>(){
            @Override
            public int compare(Person p1, Person p2){
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        };

        // Sorting with comparator
        List<Person> sPerson = 
        persons.stream()
        .sorted(nameSort)
        .toList();

        // Sorting with multiple comparator for an object
        // List<Person> sPerson = 
        // persons.stream()
        // .sorted(nameSort.thenComparing(ageSort))
        // .toList();

        sPerson.stream().forEach(p -> {
           System.out.println("Name: " + p.getName());
           System.out.println("Age: " + p.getAge());

        });
        filteredNumber.stream().forEach(System.out::println);
        sNames.stream().forEach(System.out::println);
    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}