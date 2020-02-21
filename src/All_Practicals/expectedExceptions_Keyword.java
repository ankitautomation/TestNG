package All_Practicals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class expectedExceptions_Keyword {
	

	 @Test
	    public void testDivide_1() {
	        System.out.println("testDivide()");
	        Calculator calculator = new Calculator();
	        Assert.assertEquals(calculator.divide(16, 0), 16);
	    }
	 
	 
	 
	 @Test(expectedExceptions = {ArithmeticException.class})
	    public void testDivide() {
	        System.out.println("testDivide()");
	        Calculator calculator = new Calculator();
	        Assert.assertEquals(calculator.divide(16, 0), 16);
	    }
	 
	
}
