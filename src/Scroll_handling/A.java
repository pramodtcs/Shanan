package Scroll_handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//using javascript executor interface
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		
		//scroll down 
		jse.executeScript("window.scrollBy(0,800);");
		
		
		Thread.sleep(4000);
		//scroll up
		jse.executeScript("window.scrollBy(0,-100);" );
		
		
		
	}
	

}
