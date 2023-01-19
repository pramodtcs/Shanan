package Assert_class_method;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assert {
@Test
public void TC1() {
	String s1="hii";
	String s2="hello";
	
	SoftAssert s= new SoftAssert();
	s.assertEquals(s1, s2);
	System.out.println("Boss i am after failing the tc1");
	
	// we need to write manadatorilly 
	 s.assertAll();
	
}
}
