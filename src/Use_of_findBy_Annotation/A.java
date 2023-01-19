package Use_of_findBy_Annotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe") ;
				
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//opeen the application
		driver.get("https://demo.actitime.com/login.do");
		
		//enter UN 
		 WebElement UN = driver.findElement(By.xpath("//input[@id='username']"));
		 
		//we need refresh the page 
	    driver.navigate().refresh();
				
		//write propper username
		UN.sendKeys("admin");
	}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
