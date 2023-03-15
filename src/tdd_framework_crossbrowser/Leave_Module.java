package tdd_framework_crossbrowser;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Leave_Module extends Base_Class{
	@Test
	public void click_leave()
	{
		driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]")).click();
	}

}
