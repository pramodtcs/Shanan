package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class X_path_by_attribute_text {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		//user name 
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
				
	 // pass
	   driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	   
	   //login
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		//verify user navigate to home page 
		
		String expectedT="actiTIME - Login";
		String actualT= driver.getTitle();
		System.out.println(actualT);
		
		if (expectedT.equals(actualT)) {
			System.out.println("tc is pass");
		}
		
		else {
			System.out.println("tc is fail" );
		}
	}

}
