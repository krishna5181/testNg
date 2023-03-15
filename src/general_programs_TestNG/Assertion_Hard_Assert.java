package general_programs_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Hard_Assert 
{
	//Hard Assert strict level comparison
	@Test
	public void Comparison()
	{
		String actual = "Raja";
		String expected = "raja";
		Assert.assertEquals(actual, expected);
		System.out.println("Happy new year");
	}
	
	//Hard Assert Contains(partial)-Level comparison
	@Test
	public void ContainsComparison()
	{
		String actal = "maharaja";
		String expected = "raja";
		Assert.assertTrue(actal.contains(expected));
		System.out.println("Happy ending");
	}
}
