package general_programs_TestNG;

import org.testng.annotations.Test;

public class Program6_InvocationCount_TestAnno 
{
	@Test(invocationCount = 3)
	public void userCreated()
	{
		System.out.println("user created successfully");
	}
	@Test
	public void userModified() {
		System.out.println("user modified successfully");
	}
	@Test(invocationCount = 4)
	public void userDeleted() {
		System.out.println("user deleted successfully");
	}

}
