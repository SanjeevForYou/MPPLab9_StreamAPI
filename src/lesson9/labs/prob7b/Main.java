package lesson9.labs.prob7b;

import java.util.*;
<<<<<<< HEAD

=======
import java.util.stream.Collectors;
>>>>>>> e0b37d2c4714f90d6cec5aa105c3871992bb5317

public class Main {

	public static void main(String[] args) {
<<<<<<< HEAD
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		
	}

=======
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));

	}

//	TriFunction<List<Employee>, Double, Character, String> trifunction = (lst, sal, chr) -> lst.stream()
//			.filter(emp -> emp.getSalary() > sal)
//			.filter(emp -> emp.getLastName().charAt(0) > chr)
//			.map(emp -> emp.getFullName())
//			.sorted()
//			.collect(Collectors.joining(","));
//
//	System.out.println("Result after lyamda library is :");
//	System.out.println(trifunction.apply(list,100000.0,'M'));

>>>>>>> e0b37d2c4714f90d6cec5aa105c3871992bb5317
}
