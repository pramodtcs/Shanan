package Assert_class_method;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_fail {

	@Test
	public void m1() {
		Reporter.log("running m1 ",true);
		
		Assert.fail(); //intentionally m1 is failed 
		
		System.out.println("i am after failing m1");
		
	}
	
	@Test
	public void m2() {
		Reporter.log("running m2 test case ",true);
		
	}
}
// hare we execute any statement after the assert.fail method that will be not execute .