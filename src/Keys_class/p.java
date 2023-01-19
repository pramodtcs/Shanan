package Keys_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import okio.Timeout;

public class p {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\AD\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	
	//open app using keys class
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	
	
	
	
}
}
