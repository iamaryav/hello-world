import java.util.*;
import java.util.stream.*;

public class MapManipulation{

	private Map<String, Integer> sort(Map<String, Integer> input, List<Employee> employees, Map<Integer, Employee> employeeMap){

		System.out.println("Sorting through java Tree map: ");

		// Q:
		// create a counter using stream api using stream API
		// print non first repeating character using stream API
		// shift all zeroes to the end

		// groupy by with age and average salary
		// find highest salary in every dept
		// find the number of employee in each dept
		// group by with name and count
		// dept wise employee;
		// sum of all salaries;
		// max and min salary in list
		// find the distinct employee


		// sum of salary
		Double sumOfSalary = employees.stream()
		.mapToDouble(Employee::getSalary)
		.sum();
		
		System.out.println("sum of Salary: " + sumOfSalary);

		Optional<Employee> maxSalary = employees.stream()
			.max(Comparator.comparingDouble(Employee::getSalary));

		System.out.println("max Salary: " + maxSalary.get().getSalary());

		Optional<Employee> minSalary = employees.stream()
			.min(Comparator.comparingDouble(Employee::getSalary));

		System.out.println("min Salary: " + minSalary.get().getSalary());

		Double avgSalary = employees.stream()
			.collect(Collectors.averagingDouble(Employee::getSalary));

		System.out.println("avg Salary: " + avgSalary);


		// avg salary for same name

		Map<String, Double> avgPersonSalary = employees.stream()
			.collect(Collectors.groupingBy(
				Employee::getName,
				Collectors.averagingDouble(Employee::getSalary)	
			));

		System.out.println(avgPersonSalary);




		TreeMap<String, Integer> sortedInput = new TreeMap<String, Integer>();
		sortedInput.putAll(input);

		sortedInput.entrySet().stream().forEach(v -> {
			System.out.println("key: " + v.getKey());
			System.out.println("value: " + v.getValue());
		});

		System.out.println("Sorting through java Stream API using Key: ");

		input.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.forEach(System.out::println);


		System.out.println("Sorting through java Stream API using value: ");

		Map<String, Integer> sortedOutput = 
		input.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.collect(Collectors.toMap(
			Map.Entry::getKey, 
			Map.Entry::getValue,
			(oldValue, newValue) -> oldValue, 
			LinkedHashMap::new
			));

		sortedOutput.entrySet().stream()
		.forEach(System.out::println);


		System.out.println("Sorting through java Stream API using value and printing through normal for loop: ");

		for(Map.Entry<String, Integer> value : input.entrySet()){
			System.out.println("key: " + value.getKey());
			System.out.println("value: " + value.getValue());

		}

		System.out.println("Grouping Employee based on the Id and then Printing: ");

		Map<Integer, List<Employee>> uniqueEmployee = 
			employees.stream()
			.collect(Collectors.groupingBy(Employee::getId));

		uniqueEmployee.entrySet().stream()
		.forEach(System.out::println);

		System.out.println("Sorting map based on the property of object");
		Map<Integer, Employee> sortedEmployeeMap = 
		employeeMap.entrySet().stream()
		// .sorted(Map.Entry.comparingByKey())
		.sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getId)))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

		sortedEmployeeMap.entrySet().stream()
		.forEach(System.out::println);

		System.out.println("Sorting map based on the property of object in reverse order");
		Map<Integer, Employee> revsortedEmployeeMap = 
		employeeMap.entrySet().stream()
		// .sorted(Map.Entry.comparingByKey())
		.sorted((e1, e2) -> Integer.compare(e2.getValue().getId(), e1.getValue().getId()))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

		revsortedEmployeeMap.entrySet().stream()
		.forEach(System.out::println);



		return sortedInput;
	}

	public static void main(String[] arsg){
		Map<String, Integer> input = new HashMap<>();
		input.put("Green", 3);
		input.put("Red", 8);
		input.put("Blue", 5);

		List<Employee> employees = List.of(
			new Employee(1, "Ram", 100.00),
			new Employee(4, "Radha", 400.00),
			new Employee(1, "Ram", 200.00),
			new Employee(5, "Shyam", 500.00),
			new Employee(3, "Sonu", 300.00),
			new Employee(2, "Monu", 100.00),
			new Employee(2, "Monu", 200.00)
		);

		Map<Integer, Employee> employeeMap = new HashMap<>();
		employeeMap.put(1, new Employee(1, "Ram", 100.00));
		employeeMap.put(4, new Employee(4, "Shyam", 100.00));
		employeeMap.put(5, new Employee(5, "Hari", 100.00));
		employeeMap.put(2, new Employee(2, "Mahesh", 100.00));
		employeeMap.put(3, new Employee(3, "Monu", 100.00));

		


		Map<String, Integer> output = new MapManipulation().sort(input, employees, employeeMap);


	}
}