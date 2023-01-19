package With_DDF;



import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) throws Throwable {
	
	  FileInputStream fis = new FileInputStream("D:\\Pramod patil  17sep\\Book1.xlsx");
	
	 Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
	
  System.setProperty("webdriver.chrome.driver","C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
  
  WebDriver driver = new ChromeDriver();
 
    driver.get("https://demo.actitime.com/login.do");
    
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
    
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
  
          //ENTER USERNAME 
    
    String un = sh.getRow(0).getCell(0).getStringCellValue();
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
    
        //  ENTER PASSWORD
     String pwd = sh.getRow(0).getCell(1).getStringCellValue();
     driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
     
     //CLICK ON BUTTON
     driver.findElement(By.xpath("//div[text()='Login ']")).click();
  
	
}
	

}
