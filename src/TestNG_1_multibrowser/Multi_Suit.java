package TestNG_1_multibrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Multi_Suit {
	@Parameters("brosername")
	@Test
	public void TC(String browsername) {
    	WebDriver driver = null;
    	
    	if (browsername.equals("Chrome")){
    		
    	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();
		
    	}
    	
    	else if (browsername.equals("Firfox")) {
    		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AD\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
    		 driver= new FirefoxDriver();
    	}
		driver.get("https://www.google.com");
	}
}
