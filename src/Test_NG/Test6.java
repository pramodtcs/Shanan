package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test6 {
	@Test
	public void TC1() {
		
		Reporter.log("tc 1st ",false);
	}
	
	@Test 
	public void TC2() {
		Reporter.log("tc 2nd",true);
	}

}
