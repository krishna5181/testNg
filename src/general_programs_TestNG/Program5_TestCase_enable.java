package general_programs_TestNG;

import org.testng.annotations.Test;

public class Program5_TestCase_enable 
{ 
	@Test
	public void moduleCreated() {
		System.out.println("Created");
	}
	@Test(enabled = false)
	public void moduleModified() {
		System.out.println("Modified");
	}
	@Test
	public void moduleSeared() {
		System.out.println("Searched");
	}
	@Test(enabled = true)
	public void moduleDeleted() {
		System.out.println("Deleted");
	}

}
