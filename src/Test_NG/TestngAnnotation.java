package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngAnnotation {
	
	@BeforeClass
	public void TC1() {
	Reporter.log("i am befrore class",true);
	}

	@BeforeMethod
	public void TC(){
		Reporter.log("i am before method ",true);
	}
	
	@Test
	public void TC3() {
		Reporter.log("i am test class",true);
	}
	
	@AfterMethod
	public void TC4() {
		Reporter.log("i am arter method ",true);
	}
	
	@AfterClass
	public void TC5() {
		Reporter.log("i am after class method ",true);
	}
}
