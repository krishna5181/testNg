package crossBrowserSearchChecking;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass 
{
	WebDriver driver;
	public DataUtility du = new DataUtility();
	
	@BeforeClass(alwaysRun = true)
	@Parameters("browser")
	public void launchBrowser(String browser) throws IOException 
	{
		if(browser.equals("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "D:\\Selenium Folder\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		if(browser.equals("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver", "D:\\Selenium Folder\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get(du.getDataProperties("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@BeforeMethod(alwaysRun = true)
	public void login() throws IOException 
	{
		driver.findElement(By.id("username")).sendKeys(du.getDataProperties("username"));
		driver.findElement(By.name("pwd")).sendKeys(du.getDataProperties("password"));
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

