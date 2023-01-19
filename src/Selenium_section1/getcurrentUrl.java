package Selenium_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrentUrl {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//get current url method 
		
		
		// link is reference variable 
		
		String link = driver.getCurrentUrl();
		System.out.println(link);
		
		
	}

}
