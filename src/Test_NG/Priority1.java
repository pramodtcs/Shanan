package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority1 {
	@Test(priority = 3)
	public void Kedar() {
		Reporter.log("running kedar ",true );

		
	}
	@Test(priority = 2)
	public void Swara() {
		Reporter.log("running swara ",true );


}
	@Test(priority = 1)
	public void Ayush() {
		Reporter.log("running Ayush ",true );
	}
}

