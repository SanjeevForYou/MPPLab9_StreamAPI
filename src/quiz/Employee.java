package quiz;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {

	String name;
	int salary;
	double workExperience;
	LocalDate DOJ;
	public Employee(String n, int s, LocalDate doj) {
		this.name = n;
		this.salary = s;
		DOJ = doj;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("name: ");
		sb.append(name);
		sb.append(" salary: ");
		sb.append("" + salary+">");
		return sb.toString();
		
	}
	
	public double getExperience() {
		return LocalDate.now().compareTo(this.DOJ);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj==null) return false;
		if(!(obj instanceof Employee)) return false;
		Employee e1 = (Employee) obj;
		if(this.getName().equals(e1.getName()) && this.getExperience() == e1.workExperience) return true;
		else return false;
	}
	
//	@Override
//	public int hashCode()
//	{
//		return this.hashCode();
//	}
}
