package All_Practicals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SimpleTest_WithoutTestNG {
	
	public static WebDriver driver;
	public static String base_url = "https://www.google.com/";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get(base_url);
		verifyGoogleTitle();
		driver.quit();

	}
	
	public static void verifyGoogleTitle()
	{
		String expected_title = "Google";
		String actual_title = driver.getTitle();
		
		try {
		Assert.assertEquals(actual_title, expected_title);
		System.out.println("Test Passed");
		}catch(Throwable e) {
			System.out.println("Test Failed");
		}
	}

}
