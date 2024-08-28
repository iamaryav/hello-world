
public class Employee{
    
    Integer id;
    String name;
    Double salary;

    public Employee(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public Double getSalary(){
        return salary;
    }
}