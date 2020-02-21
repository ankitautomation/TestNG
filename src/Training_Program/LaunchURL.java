package Training_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchURL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();
        
        System.out.println("Expected Title : == " + expectedTitle);
        System.out.println("Actual Title : == " + actualTitle);
        
        driver.close();

	}

}
