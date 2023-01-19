package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test
	public void TC1() {
		Reporter.log("its my first program in test ng",true);
	}
	
	@Test(enabled = false)
	public void TC2() {
		Reporter.log("its my second program on test ng ",true);
		
	}

}
