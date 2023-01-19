package Assert_class_method;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_equals {
	@Test
	public void m1() {
		System.out.println("running m1");
		String expT = "hii";
		String actT = "hii";
		
		// using assert class method 
		Assert.assertEquals(expT, actT);
		
	}

}
