package tdd_group_framework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Execute_Report extends Base_Class 
{
	@Test(groups = {"smoke","sanity"})
	public void Report() 
	{
		driver.findElement(By.id("container_reports")).click();
	}

}
