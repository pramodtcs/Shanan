package Selenium_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize {
public static void main(String[] args) throws Throwable{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	//maximize
	driver.manage().window().maximize();
	
	//java wait 
	Thread.sleep(14000);
	
	//minimize not present in 3.141.59
	
	driver.manage().window().maximize();
	
	
	
	
}
}
