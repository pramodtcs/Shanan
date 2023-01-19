package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Selenium_section1.Actitime_app;

public class A {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		//choose the target element 
		WebElement target = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		//create object of Actions class
		Actions act = new Actions(driver);
		
		/*//use movetoelement 
		 act.moveToElement(target).perform();
		
		//right click on target element 
		act.contextClick(target).perform();
		
		//left click
        act.click(target).perform(); */
        
        //duuble click 
       act.moveToElement(target).doubleClick().perform();
		
		
		
		
	}

}
