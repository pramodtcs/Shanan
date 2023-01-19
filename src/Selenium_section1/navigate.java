package Selenium_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
	public static void main(String[] args)throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(4000);
		
		driver.navigate().to("https://www.flipkart.com/");
		
		// backword
		driver.navigate().back();
		
		//forword
		driver.navigate().forward();
		
		//refresh
		driver.navigate().refresh();
		
	}

}
