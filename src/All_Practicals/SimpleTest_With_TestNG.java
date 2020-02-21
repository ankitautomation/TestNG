package All_Practicals;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SimpleTest_With_TestNG {
	public static WebDriver driver;
	public static String base_url = "https://www.google.com/";
	
  @BeforeMethod
  public void beforeMethod() {
	   
	    System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get(base_url);
	  
	  }
	
  @Test
  public void verifyGoogleTitle() {
	  
	    String expected_title = "Google";
		String actual_title = driver.getTitle();
		
		try {
		Assert.assertEquals(actual_title, expected_title);
		System.out.println("Test Passed");
		}catch(Throwable e) {
			System.out.println("Test Failed");
		}
	  
  }
  
  @Test
  public void GoogleSearch() {
	  
	    driver.findElement(By.name("q")).sendKeys("Selenium Learning");
  }
  
  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
