package general_programs_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment 
{
	@Test(priority = 1)
	public void Create() 
	{
		System.out.println("User created succesffuly");
		
	}
	@Test(invocationCount = 5,priority = 2)
	public void Modification() 
	{
		System.out.println("Modification done");
		
		Reporter.log("Modification method executed 5 times");
		
	}
	@Test(priority = 3)
	public void Search() 
	{
		System.out.println("User search successfully");
	}
	@Test(priority = 4)
	public void Rename() 
	{
		System.out.println("User name changed successfully");
	}
	@Test(dependsOnMethods = "Search", priority = 5)
	public void Delete() 
	{
		System.out.println("User deleted successfully");
		
		Reporter.log("Delete method depends on search method");
	}

}
