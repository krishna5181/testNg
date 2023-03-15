package tdd_framework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Excute_Task extends Base_class
{
	@Test
	public void executeTask()
	{
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
	}
}
