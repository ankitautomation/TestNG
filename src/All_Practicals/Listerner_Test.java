package All_Practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(All_Practicals.Listerner_ITestListener.class)	

public class Listerner_Test {
	
	
	public static WebDriver driver;
	
	@Test		
	public void Login()				
	{		
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://www.phptravels.net/admin");					
	    driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");							
	    driver.findElement(By.name("password")).sendKeys("demoadmin");							
	    driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();					
	}		

	//Forcefully failed this test as verify listener.		
	@Test		
	public void TestToFail()				
	{		
	    System.out.println("This method to test fail");					
	    Assert.assertTrue(false);			
	}	

}
