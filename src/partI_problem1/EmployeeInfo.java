package partI_problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import lesson9.lecture.comparators2.Employee;

public class EmployeeInfo {

static enum SortMethod {BYNAME, BYSALARY};
 static Map<SortMethod, Pair> sortDiscriminator = new HashMap<SortMethod, Pair>();

Function<Employee, String> byName = Employee::getName;
Function<Employee, Integer> bySalary = Employee::getSalary;

static{
	EmployeeInfo e = new EmployeeInfo();
	sortDiscriminator.put(SortMethod.BYNAME,new Pair<String,Integer>(e.byName,e.bySalary));
	sortDiscriminator.put(SortMethod.BYSALARY,new Pair<Integer,String>(e.bySalary,e.byName));
}

public void sort(List<Employee> emps, final SortMethod method) {	
		Collections.sort(emps, Comparator.comparing(sortDiscriminator.get(method).first).thenComparing(sortDiscriminator.get(method).second));				
	}
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfo ei = new EmployeeInfo();
		
		//by name
		ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
		System.out.println(emps);
		
		//By sallary
		ei.sort(emps, EmployeeInfo.SortMethod.BYSALARY);
		System.out.println(emps);
		
	}
}
