package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B_build_and_perform_meth {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//choose the tareget element 
		 WebElement target = driver.findElement(By.xpath("//a[text()='Images']"));
		 
		 //create object of Actions class
		Actions act = new Actions(driver);
		
		//all method in single step using bulid method and perform method 
		
		act.moveToElement(target).contextClick().doubleClick().perform();
		
		 
		 
		 
		 
	}

}
