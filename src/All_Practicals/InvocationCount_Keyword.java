package All_Practicals;
	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
	
	public class InvocationCount_Keyword {
		
		    @Test(invocationCount = 10, threadPoolSize = 5)
		    public void testThreadPools() {
			  
			System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://www.google.com");
			//System.out.printf("%n[START] Thread Id : %s is started !",  Thread.currentThread().getId());
			//System.out.println("This is ");
			//System.out.printf("%n[END] Thread Id : %s ", Thread.currentThread().getId());

			driver.quit();
				
		  }
	
	}

	
	