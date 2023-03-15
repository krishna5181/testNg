package tdd_framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base_class 
{
	WebDriver driver; //Declare the WebDriver Globally to access entire project
	public Data_Utility du = new Data_Utility(); 
	
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(du.getDatafromProperties("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@BeforeMethod(alwaysRun = true)
	public void login() throws Exception 
	{
		driver.findElement(By.id("username")).sendKeys(du.getDatafromProperties("username"));
		driver.findElement(By.name("pwd")).sendKeys(du.getDatafromProperties("password"));
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}
	@AfterMethod(alwaysRun = true)
	public void logout() 
	{
		driver.findElement(By.xpath("//td[@class='logoutCell preventPanelsHiding']")).click();
	}
	@AfterClass(alwaysRun = true)
	public void closeBrowser() 
	{
		driver.close();
	}
}
