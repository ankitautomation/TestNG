package All_Practicals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser {

	@Test(invocationCount = 10)
    public void testThreadPools() {
	  
	System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://vensaiinc.com/");

	driver.quit();
		
	}
}
