package Section2;

import java.time.DayOfWeek;
import java.time.MonthDay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_box_handling {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	//open the application
	driver.get("https://www.facebook.com/");
	
	//click on create new account button
	Thread.sleep(4000);
     driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

   //select day listbox
     Thread.sleep(4000);
     WebElement day =driver.findElement(By.xpath("//select[@id='day']"));
     
     //create object of select class
    Select s= new Select(day);
    Thread.sleep(4000);
    
    //use select method 
    s.selectByValue("15");
    
    //select by visible text
    s.selectByValue("15");
    
    
     
     

    


}
}
