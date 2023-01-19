package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class x_patha_by_contains_using_attribute {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		//user name 
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("admin");
		
		//password
		driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
		
		//login
		driver.findElement(By.xpath("//div[contains(text(),'Login' )]")).click();
		
		String expT="actiTIME - Login";
		String actT=driver.getTitle();
				
		
		if (expT.equals(actT)) {
			System.out.println("tc is pass");
	
		}
		
		else {
			System.out.println("tc is fail");
		}
	}

}
