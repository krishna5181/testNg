package practice_ChaitraMam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BookFlightTicket 
{
	@Test
	public void book() throws InterruptedException
	{
//	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.makemytrip.com/");
	//To click on anywhere in page for avoding Unwanted Popups
	Actions act=new Actions(driver);
	act.moveByOffset(20, 40).click().perform();
	//To give From Input
	driver.findElement(By.xpath("//label[@for='fromCity']")).click();
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Mumbai");
	driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
	//To give TO Input
	Thread.sleep(3000);
	driver.findElement(By.id("toCity")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Chennai");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[text()='Chennai, India']")).click();
	//To Click on Particular Date
	driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
	driver.findElement(By.className("dateInnerCell")).click();
	}

}
