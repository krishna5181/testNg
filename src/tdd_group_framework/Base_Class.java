package tdd_group_framework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base_Class 
{
	WebDriver driver;
	public Data_Utility du = new Data_Utility();
	
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(du.getDataFromProperties("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	}
	
	@BeforeMethod(alwaysRun = true)
	public void login() throws IOException 
	{
		driver.findElement(By.id("username")).sendKeys(du.getDataFromProperties("username"));
		driver.findElement(By.name("pwd")).sendKeys(du.getDataFromProperties("password"));
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}
	@AfterMethod(alwaysRun = true)
	public void logout() 
	{
		driver.findElement(By.xpath("//a[text()='Logout']")).click();	
	}

	@AfterClass(alwaysRun = true)
	public void closeBrowser() 
	{
		driver.close();
	}
}
