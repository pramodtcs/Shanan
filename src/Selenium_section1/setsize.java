package Selenium_section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.flipkart.com/");
		
		//create object of dimenssion class
		
		Dimension d = new Dimension(200, 100);
		
		//use set size method 
		
		driver.manage().window().setSize(d);
		
		
		
	}
	
}
