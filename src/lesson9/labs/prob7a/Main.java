package lesson9.labs.prob7a;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.swing.text.html.FormSubmitEvent.MethodType;


public class Main {
	
	static enum SortMethod {BYNAME, BYSALARY};
	Function<Employee, String> byName = e -> e.getFullName();
	Function<Employee, Integer> bySalary = e -> -e.getSalary();
	
	public void sort(List<Employee> emps, final SortMethod method) {
		if(method == SortMethod.BYNAME) {
			Collections.sort(emps, Comparator.comparing(byName).thenComparing(bySalary));
		} else {
			Collections.sort(emps, Comparator.comparing(bySalary).thenComparing(byName));
		}			
	}
	
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
		
		//your stream pipeline here
		
		//sorting the list by name
//		Main m = new Main();
//		m.sort(list, SortMethod.BYNAME);
		
		String result = list.stream()
				.filter(emp -> emp.salary >100000)
				.filter(emp -> emp.getLastName().charAt(0) > 'M')
				.map(emp -> emp.getFullName())
				.sorted()
				.collect(Collectors.joining(","));
		
		System.out.println("Result is :");
		System.out.println(result);
		
		LyamdaLibrary<List<Employee>, Double, Character, String> trifunction = (lst, sal, chr) -> 
		lst.stream()
		.filter(emp -> emp.salary >sal)
		.filter(emp -> emp.getLastName().charAt(0) > chr)
		.map(emp -> emp.getFullName())
		.sorted()
		.collect(Collectors.joining(","));
		
		System.out.println(trifunction.apply(list, 100000.0, 'M'));
		
		
		//using lymda library
//		Main m = new Main();
//		
//		System.out.println("Using lymda library result is :");
//		System.out.println(m.applyFilterOp(list,100000,'M'));
	}

//	@Override
//	public String applyFilterOp(List<Employee> list, double comValue, char startChar) {
//		String result = list.stream()
//				.filter(emp -> emp.salary >comValue)
//				.filter(emp -> emp.getLastName().charAt(0) > startChar)
//				.map(emp -> emp.getFullName())
//				.sorted()
//				.collect(Collectors.joining(","));
//		
//		return result;
//	}
	

}
