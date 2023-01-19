package Test_NG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	 public void TC1() {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		Reporter.log("it's my first test case",true);

	}

@Test
public void TC2() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com");
	
	Reporter.log("its my second text case",true);

	}
		
		
		
	}
	


