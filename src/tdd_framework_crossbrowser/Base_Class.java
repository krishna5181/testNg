package tdd_framework_crossbrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_Class {
	WebDriver driver;
	public Data_Utility du=new Data_Utility();
	@Parameters("browser")
	@BeforeClass
	public void launchingBrowser(String browser) throws Exception
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.get(du.getdataFromproperties("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod
	public void loginApplication() throws Exception
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(du.getdataFromproperties("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(du.getdataFromproperties("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
	}
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
