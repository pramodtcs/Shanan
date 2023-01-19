package Screenshots;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class A {



public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.in/");
	
	//maximize
	Thread.sleep(4000);
	driver.manage().window().maximize();
	
	//Typecast Takescreenshot Interface
	TakesScreenshot ts = (TakesScreenshot)driver;
	
	//take screenshot using get screenshot method 
	File src = ts.getScreenshotAs(OutputType.FILE);
	
	
	//Create object of FILE class 
	File desk = new File("C:\\Users\\AD\\Desktop\\17Sep screenshot\\amazon.jpg");
	
	//we need convert screenshot from src to destination 
	Files.copy(src, desk);
	System.out.println("this is handled by team lead minakshi");
	
}

}
