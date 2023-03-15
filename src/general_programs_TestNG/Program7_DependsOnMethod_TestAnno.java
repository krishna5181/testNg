package general_programs_TestNG;

import org.testng.annotations.Test;

public class Program7_DependsOnMethod_TestAnno 
{
	@Test(priority = 1)
	public void CreateUser() 
	{
		System.out.println("User created successfully");
	}
	@Test(enabled = false)
	public void SearchUser() 
	{
		System.out.println("User searched");
	}
	@Test(dependsOnMethods = "SearchUser")   //SearchUser method not included in @Test annotation so thats why we get TestNGException
	public void DeleteUser() 
	{
		System.out.println("User deleted successfully");
		
	}
}
