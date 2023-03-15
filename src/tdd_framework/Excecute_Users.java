package tdd_framework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Excecute_Users extends Base_class
{
	@Test
	public void executeUser() 
	{
		driver.findElement(By.xpath("//div[@id='container_users']")).click();
	}
}
