package Selenium_section1;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setposition {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		
		WebDriver driver = new ChromeDriver();
		driver.get( "https://www.flipkart.com/");
		
		//  create object of poin class 
		
		Point p = new Point(300, 400);
		
		//use setposition  methoid 
		
		driver.manage().window().setPosition(p);
		
	}
}
