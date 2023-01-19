package Robot_class;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pramod {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	//create object of robot class
	Robot r = new Robot();
	//keypress
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	//key relese
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(4000);
	
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	//key relese
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(4000);
	
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	//key relese
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(4000);
	
	
}
}
