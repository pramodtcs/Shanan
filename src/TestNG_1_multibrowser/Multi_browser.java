package TestNG_1_multibrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Multi_browser {
	
	@Parameters("browsername")
	@Test
	public void TC(String browsername ) {
		WebDriver driver = null;
		
		if (browsername.equals("chrome")) {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		}
		
		else if (browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\AD\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		
			 driver = new FirefoxDriver();
			
		}
		driver.get("https://www.google.com");
		
	
	}
}
                //this program is right and run 


