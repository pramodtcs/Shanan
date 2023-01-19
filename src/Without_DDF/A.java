package Without_DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		//enter un
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		String expT="actiTIME - Login";
		
		String actT=driver.getTitle();
		
		if(actT.equals(expT)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
		
	}
		

	}

