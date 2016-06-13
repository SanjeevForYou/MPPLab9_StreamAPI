package quiz;

import java.time.LocalDate;
import java.time.Period;

public class Person {

	String name;
	LocalDate dob;

	Person(String name, LocalDate dob) {
		this.name = name;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return name;
	}
	
	public int getAge()
	{
		return Period.between(this.dob,LocalDate.now()).getYears();	
	}
}
