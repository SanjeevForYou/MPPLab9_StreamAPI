package partI_problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeInfo {

static enum SortMethod {BYNAME, BYSALARY};
Map<SortMethod, Pair> sortDiscriminator = new HashMap<SortMethod, Pair>();
	
	public void sort(List<Employee> emps, final SortMethod method) {
		
		Collections.sort(emps, comparing(sortDiscriminator.get(method).first)
		
//		Collections.sort(emps, (e1,e2) ->
//		{
//			if(method == SortMethod.BYNAME) {
//				return e1.name.compareTo(e2.name);
//			} else {
//				if(e1.salary == e2.salary) return 0;
//				else if(e1.salary < e2.salary) return -1;
//				else return 1;
//			}
//		});
		
		
		//sometimes, the return keyword can be omitted, as in
		//the following
		//Collections.sort(emps, (e1, e2)  ->  e1.name.compareTo(e2.name));
				
	}
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfo ei = new EmployeeInfo();
		ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
		System.out.println(emps);
		//same instance
		ei.sort(emps, EmployeeInfo.SortMethod.BYSALARY);
		System.out.println(emps);
		
		Pair pair1 = new Pair("byName","bySalary");
		Pair pair2 = new Pair("bySalary","byName");
		EmployeeInfo ei1 = new EmployeeInfo();
		ei1.sortDiscriminator.put(SortMethod.BYNAME, pair1);
		ei1.sortDiscriminator.put(SortMethod.BYSALARY, pair2);
		
		
	}
}
