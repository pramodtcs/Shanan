package Selenium_section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;

public class First {
public static void main(String[] args) {
	
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title =  driver.getTitle();
		System.out.println(title);
		
	      String expT="Google" ;
	      String actT= driver.getTitle();
	      
	      if (expT.equals(actT)) {
	    	  System.out.println("tc is pass");
	      }
	              
	      else {
	    	  System.out.println("tc is fail ");
	      }
		
	}
}

