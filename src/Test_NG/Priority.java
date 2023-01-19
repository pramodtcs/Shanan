package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority =3)
	public void Pramod() {
		Reporter.log("tc one",true);
	}
	
	@Test(priority =2)
	public void Poonam() {
		Reporter.log("tc number 2",true);
		
	}
	
	@Test (priority =1)
	public void Prashant() {
		Reporter.log("tc number 3",true);
		
		
	}

}
