package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {


public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	
	//implicit wait 
    Thread.sleep(4000);
	
	//maximize the browser
    driver.manage().window().maximize();

	
	//by default selenium focus is on main web page so we need too switch it 
	//switch 1st i frame 
	driver.switchTo().frame("PackagesListFrame");
	
	
//for confirmation take any element on 1st frame and print it 
	String t1 = driver.findElement(By.xpath("//h2[text()='Packages']")).getText();
	System.out.println(t1);
	
	
	//switch 1st i frame to main web page 
	driver.switchTo().defaultContent();

	
	
	//now jump from main  web page to 2nd frame 
	driver.switchTo().frame("packageFrame");

	
	
	//take any element and print it 
	String t2 = driver.findElement(By.xpath("//a[text()='Actions']")).getText();
	System.out.println(t2);
	
	//again control goes to main web page 
	driver.switchTo().defaultContent();
	
	//now cntol goes 3 i frame 
	 driver.switchTo().frame("rightIframe");
	 
	 //take one element on 3 i frame 
     String t3 = driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
     System.out.println(t3);
	
	
	 
	
	
	
	
	
	
	
}
}
