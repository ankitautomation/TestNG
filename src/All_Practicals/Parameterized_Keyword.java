package All_Practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Keyword {
	
	public static WebDriver driver;
	
	@Parameters({"username", "password"})
	@Test
	public void loginTest(String username, String password) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.phptravels.net/admin");		
		
	    driver.findElement(By.name("email")).sendKeys(username);							
	    driver.findElement(By.name("password")).sendKeys(password);	
	    
	    driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
	}

}
