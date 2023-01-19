package Test_NG;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test5 {
	
	@Test
	public void TC1() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\AD\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		//open app using keys class
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		
		
	}
	@Test
	public void TC2() throws Throwable {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//using javascript executor interface
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		
		//scroll down 
		jse.executeScript("window.scrollBy(0,800);");
		
		
		Thread.sleep(4000);
		//scroll up
		jse.executeScript("window.scrollBy(0,-100);" );
		
	}
	@Test
	public void TC3() {
		Reporter.log("tc pass",true);
	Assert.fail();
	}
	
	

}
