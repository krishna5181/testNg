package general_programs_TestNG;

import org.testng.annotations.Test;

public class Program4_Negative_PriorityAnno 
{
	@Test(priority = -2)
	public void userCreated() 
	{
		System.out.println("User created successfully");
	}
	@Test(priority = 2)
	public void userModifided() 
	{
		System.out.println("User modified successfully");
	}
	@Test(priority = -3)
	public void searcUser() 
	{
		System.out.println("User searched successfully");
	}
	@Test(priority = 1)
	public void userDeleted() 
	{
		System.out.println("User deleted successfully");
	}

}
