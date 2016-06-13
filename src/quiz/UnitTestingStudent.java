package quiz;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestingStudent {
	
	String authName;

	@Test
	public void test() {
		//fail("Not yet implemented");
		Student stu = new Student("San",3.7);
		assertEquals("San", stu.getName());
		
		assertTrue("name must be equal", stu.getName().equals("San"));
		//assert
	}

}
