package Assert_class_method;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assert_not_equal {
	
	@Test
	public void m2() {
		Reporter.log("running m2");
		String expT = "hiii";
		String actT = "hello";
		
		//ussing assert not equals method 
	Assert.assertNotEquals(expT, actT);
		
	}

}
