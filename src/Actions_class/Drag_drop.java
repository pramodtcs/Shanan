package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		 
		 //x path of element 1
		WebElement ele1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		//x path of element 2
		WebElement ele2 = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
		
		//crete objrct of Actions class 
		Actions act = new Actions(driver);
		
		//use method drag and drop method 
		act.dragAndDrop(ele1, ele2).perform();

		
		
		
		
		
		
	}

}
