package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_box_handling_year {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		
		//create new account 
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(4000);
		
		
		//select year text box 
		WebElement year =driver.findElement(By.xpath("//select[@id='year']"));
		
		//create onjet select class
		Select s=new Select(year);
		
		//use select method 
		s.selectByValue("15");
	
		
		
		
		
		
	}

}
