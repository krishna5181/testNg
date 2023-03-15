package general_programs_TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_Soft_Assert 
{
	@Test
	public void comparison() 
	{
		SoftAssert sa = new SoftAssert();
		
		String actual = "Mehfil";
		String expedcted = "mehfil";
		sa.assertEquals(actual, expedcted);
		System.out.println("Biryani is good");
		sa.assertAll();
	}
	@Test(priority = -1)
	public void containComparison() 
	{
		SoftAssert sa = new SoftAssert();
		String actual = "beautiful";
		String expected = "ful";
		sa.assertTrue(actual.contains(expected));
		System.out.println("paris is beautiful city");
		sa.assertAll();
	}
}
