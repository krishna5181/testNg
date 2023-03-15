package tdd_framework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Execute_Reports extends Base_class 
{
	@Test
	public void executeReport() 
	{
		driver.findElement(By.xpath("//div[@id='container_reports']")).click();
	}

}
