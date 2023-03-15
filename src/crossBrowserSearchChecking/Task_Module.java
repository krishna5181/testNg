package crossBrowserSearchChecking;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Task_Module extends BaseClass 
{
	@Test
	public void ExecuteTask() 
	{
		driver.findElement(By.xpath("//div[@id='container_reports']")).click();
	}

}
