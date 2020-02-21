package All_Practicals;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotation_Explaination {
	
  @Test(priority=2,groups="Regrassion Test") 
  public void VerifyStep_1() {
	  
	  System.out.println("Verify Step 1 Test");
	  
  }
  
  @Test(priority=3,groups="Smoke Test") 
  public void VerifyStep_2() {
	  
	  System.out.println("Verify Step 2 Test");
	  
  }
  
  @Test(priority=1,groups="Regrassion Test")
  public void VerifyStep_3() {
	  
	  System.out.println("Verify Step 3 Test");
	  
  }
  
  @Test(priority=4,groups="Smoke Test")
  public void VerifyStep_4() {
	  
	  System.out.println("Verify Step 4 Test");
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Before Method Run");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("After Method Run");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("Before Class Run");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("After Class Run");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Before Test Run");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("After Test Run");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("Before Suite Run");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("After Suite Run");
  }

}
