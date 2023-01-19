package POM_DESIGINING;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
			//implicit wait 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		//class 1 object create 
		LoginPage p = new LoginPage(driver);
		p.enterun();
	    p.enterpwd();
		p.clickLoginbtn();
		
		// class 2 object create 
		
		HomePage h= new HomePage(driver);
		h.verifyText();
		
		
	}
}
		
	
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


