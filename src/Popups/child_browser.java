package Popups;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	//click on cancle button 
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	
	
	//search any mobile 
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobile under 20000 samsung ",Keys.ENTER);
	
	//implicit wait 
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
	
	//click on 1st phone 
	driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
	
	//switch the control 
	Set<String> allwindos = driver.getWindowHandles();
	
	//create object of array list 
	ArrayList<String> al = new ArrayList<>(allwindos);
	
	//print main window id 
	String mainid = al.get(0);
	System.out.println(mainid);
	
	//switch to child window 
	driver.switchTo().window(al.get(1));
	
	//print session 
	String cwindow = al.get(1);
	System.out.println(cwindow);
	
	String title = driver.getTitle();
	System.out.println(title );
	
	
	
}
}
