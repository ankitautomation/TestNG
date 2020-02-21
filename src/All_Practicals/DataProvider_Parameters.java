package All_Practicals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvider_Parameters {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	
	@Test(dataProvider="SearchProvider") 
	public void searchText(String author, String searchKey) throws InterruptedException 
	{ 
		
		WebElement searchText = driver.findElement(By.name("q"));
		searchText.sendKeys(searchKey);
		
		System.out.println("Welcome --> " + author + " Your search key is --> " +searchKey);
		Thread.sleep(3000);
		
		System.out.println("Value in Google Search Box = " +searchText.getAttribute("value") + ": : :  Value given in input = " + searchKey);
		
		Assert.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));		
		
	}
	
	@DataProvider(name="SearchProvider")
	public Object[][] getDataFromDataProvider()
	{
		return new Object[][]
		{
			{"Sachin","India"},
			{"Krishna","UK"},
			{"Ankit","USA"}
		};
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}