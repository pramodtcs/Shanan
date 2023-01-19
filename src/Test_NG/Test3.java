package Test_NG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Test3 {
	@Test
	public void TC1() throws Throwable {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 
		 //take the xpath of that element 
		 WebElement p = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		 
		 // use getscreenshot method 
		 File src = p.getScreenshotAs(OutputType.FILE);
		 
		 
		 
		 //create object of file class
		 File desk = new File("C:\\Users\\AD\\Desktop\\17Sep screenshot\\particular.jpg");
		
		 //use copy method 
		 Files.copy(src, desk);
		 Reporter.log("its screenshot ",true);
	}
	
	@Test
	public void TC2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 
		 Reporter.log("its google",true);
		
	}

}
