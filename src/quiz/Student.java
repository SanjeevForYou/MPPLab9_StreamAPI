package quiz;

public class Student {

	private String name;
	private double gpa;
	
	public Student(String nam, double gpa)
	{
		this.name = nam;
		this.gpa = gpa;
	}
	
	public double getGpa()
	{
		return this.gpa;
	}
}
