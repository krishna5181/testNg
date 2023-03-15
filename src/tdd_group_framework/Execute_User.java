package tdd_group_framework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Execute_User extends Base_Class
{
	@Test(groups = "smoke")
	public void User() {
		driver.findElement(By.id("container_users")).click();
		
	}

}
