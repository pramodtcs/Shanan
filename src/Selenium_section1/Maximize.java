package Selenium_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
	public static void main(String[] args)throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//get method 
		driver.get("https://www.flipkart.com/");
		
		//maximize the browser
		
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		//close method 
		driver.close();
		
	}

}
