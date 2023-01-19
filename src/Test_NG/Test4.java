package Test_NG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 {
	@Test
	
	public void TC1() {
		
		Reporter.log("hii i am pramod ",true );
		
	}
	
	@Test
	public void TC2() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		driver.get("https://www.flipkart.com/");
		Reporter.log("flipkart only",true);
	}

	@Test
	public void TC3() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.indiapost.gov.in/");
		
	Reporter.log("indian post office",true);
		
	}
	@Test
	public void TC4() {
		
		Reporter.log("this is my 4th test case ",true);
		
	}
	
	@Test
	public void TC5() {
		
		Reporter.log("its my 5th test case ",true );
	}
		
	@Test
	public void TC6() {
		
		Reporter.log("its my 6th test case ",true );
	}
		
	
	
	
	
	
	
	
	
	
}
