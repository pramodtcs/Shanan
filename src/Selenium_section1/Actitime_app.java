package Selenium_section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_app {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	
	//enter user name
	driver.findElement(By.name("username")).sendKeys("admin");
	
	//enter password
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	//click on login button 
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	//expected title
	
	String expT="actiTIME - Login";
	String actT = driver.getTitle();
	
	System.out.println(actT);
	
	if (expT.equals(actT)) {
		System.out.println("tc is pass");
	}
		
		else {
			
		 
			System.out.println("tc is failll");
		}
}
}
		
	
	
	
	
	
	
	
	
	
