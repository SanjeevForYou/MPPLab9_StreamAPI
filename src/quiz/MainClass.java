package quiz;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> emps = new ArrayList<>();
		LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
		emps.add(new Employee("Joe", 100000,LocalDate.of(2014, Month.DECEMBER, 12)));
		emps.add(new Employee("Tim", 50000,LocalDate.of(2017, Month.DECEMBER, 12)));
		emps.add(new Employee("Andy", 60000,LocalDate.of(2004, Month.DECEMBER, 12)));
		
		List<Employee> filteredlist = emps.stream().filter(s -> s.getExperience() >= 10).collect(Collectors.toList());
		
		 Map<Integer, Employee> record = new HashMap<Integer, Employee>();
		 
		 for(Employee e : filteredlist)
		 {
			 record.put(e.hashCode(), e);
			 System.out.println("Name :" + e.getName() +"\n"+"Experience"+ e.getExperience() +"\n");
		 }
		 
     Consumer<List<Employee>> emp =  (List<Employee> lst) -> {Iterator<Employee> iter = lst.iterator();
     while(iter.hasNext())
    	 System.out.println(iter.next());};
     emp.accept(filteredlist);
		 }
	}
