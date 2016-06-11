package lesson9.labs.prob8;

import java.util.*;
import java.util.stream.Collectors;

import lesson9.labs.prob7a.Employee;
import lesson9.labs.prob7a.LyamdaLibrary;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		//print the number of Employees in list whose salary > 100000 and whose last name begins
		//with a letter that comes after the letter 'E'
		
		//print a list of sorted full names - all upper case -- of Employees with
		//salary > 85000 and whose first name begins with a letter that comes before  the letter 'R'

		//LyamdaLibrary 


		LyamdaLibrary<List<Employee>, Double, Character, String> trifunction1 = (lst, sal, chr) -> lst.stream()
				.filter(emp -> emp.getSalary() > sal).filter(emp -> emp.getLastName().charAt(0) > chr)
				.map(emp -> emp.getFullName()).sorted().collect(Collectors.joining(","));
		
		System.out.println("Result of first query :");
		System.out.println(trifunction1.apply(list, 100000.0, 'E'));
		
		System.out.println();
		
		LyamdaLibrary<List<Employee>, Double, Character, String> trifunction2 = (lst, sal, chr) -> lst.stream()
				.filter(emp -> emp.getSalary() > sal).filter(emp -> emp.getFirstName().charAt(0) > chr)
				.map(emp -> emp.getFullName().toUpperCase()).sorted().collect(Collectors.joining(","));
		System.out.println("Result of second query : ");
		System.out.println(trifunction2.apply(list, 85000.0, 'R'));
	}

}
