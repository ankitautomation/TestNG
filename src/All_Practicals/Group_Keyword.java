package All_Practicals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(groups="ClassLevelGroup")
public class Group_Keyword {
	
	 @BeforeMethod
	  public void beforeMethod() {
		  
		  System.out.println("Before Method Run");
	  }
	
	 @Test(groups="MethodLevelGroup")
	  public void VerifyStep_1() {
		  
		  System.out.println("Verify Step 1 Test");
		  
	  }
	  
	  @Test(priority=1)
	  public void VerifyStep_2() {
		  
		  System.out.println("Verify Step 2 Test");
		  
	  }
	  
	  @Test(groups="MethodLevelGroup")
	  public void VerifyStep_3() {
		  
		  System.out.println("Verify Step 2 Test");
		  
	  }
	  
	  @AfterMethod
	  public void afterMethod() {
		  
		  System.out.println("After Method Run");
	  }

}
