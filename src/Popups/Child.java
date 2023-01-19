package Popups;



import java.lang.reflect.Array;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child {
	public static void main(String[] args) {
		
		System.setProperty("webdrivr.chrome.driver", "C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("");
		
		
		
		driver.findElement(By.xpath(" ")).sendKeys("  ");
		
		driver.findElement(By.xpath("1st mobile ")).click();
		
		 String allwindow = driver.getWindowHandle();
		 
		 ArrayList<String> al = new ArrayList ();
		 
		String main = al.get(0);
		System.out.println(main);
		
		driver.switchTo().window(al.get(1));
		
		String child = al.get(1);
		System.out.println(child);
		 
		
		
		
		
	
		
		
	}

}
