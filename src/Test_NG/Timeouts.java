package Test_NG;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeouts {
	@Test(timeOut = 70000)
	public void TC1() {
		
		Reporter.log("it is my first program in test ng ",true);
	}
	
	@Test
	public void TC2() {
		Reporter.log("it my secind programe in test ng ",true );
		
		
		//it is use to fail test case intentionally 
        //Assert.fail();
	}

}
