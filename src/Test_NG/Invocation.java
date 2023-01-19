package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation {
	@Test(invocationCount = 10)
	
	
	public void TC1() {
		Reporter.log("invocation means repeat the code ",true);
	}

}
