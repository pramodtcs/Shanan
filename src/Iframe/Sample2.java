package Iframe;
		

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//bydefault selenium  focus is on main web page so we need to switch it 
		
		//switch to 1st i frame 
		driver.switchTo().frame("packageListFrame");
		
		//for confirmation print 1 element 
		  String t1 = driver.findElement(By.xpath("//h2[text()='Packages']")).getText();
		  System.out.println(t1);
		  
		  //switch from 1st frame to main web page 
		  driver.switchTo().defaultContent();
		  
		  //now jump from main web page to 2 nd frame 
		  driver.switchTo().frame("packageFrame");
		  
		  //take any element 
		String t2 = driver.findElement(By.xpath("//a[text()='By']")).getText();
		System.out.println(t2);
		
		//switch from 2 frame to main web page 
		driver.switchTo().defaultContent();
		
		//now jump to main web page to 3rd i frame 
		driver.switchTo().frame("classFrame");
		
		//for comfirmation print 1 element 
		String t3 = driver.findElement(By.xpath("//a[text()='Credentials']")).getText();
		System.out.println(t3);
		  
	}
	
	
	

}
