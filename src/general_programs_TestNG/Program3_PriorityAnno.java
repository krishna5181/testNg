package general_programs_TestNG;

import org.testng.annotations.Test;

public class Program3_PriorityAnno 
{
	@Test(priority = 1)
	public void userCreated()
	{
		System.out.println("User created successfully");
	}
	@Test(priority = 3)
	public void userModified() 
	{
		System.out.println("User modified successfully");
	}
	@Test(priority = 2)
	public void searchUser() 
	{
		System.out.println("User searched successfully");
	}
	@Test(priority = 4)
	public void deleteUser() 
	{
		System.out.println("User deleted successfully");
		
	}

}
