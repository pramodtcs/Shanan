package Pagefactory_testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
	Sheet sh;
	Login1Page l;
	HomePage h;
	

	@BeforeClass
	public void openBrowser() throws Throwable  {
		FileInputStream fis =new FileInputStream("D:\\Pramod patil  17sep\\acti.xlsx");
		 sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		// all objects 
		
		l= new Login1Page(driver);
		h=new HomePage(driver);
		
	}
	@BeforeMethod
	public void openApp() {
		String username=sh.getRow(0).getCell(0).getStringCellValue();
		l.enterUN(username );
		
		String password=sh.getRow(0).getCell(1).getStringCellValue();
		l.enterPWD(password);
		l.clickLoginBTN();
	}
		
	@Test
	public void verifytext() {
		Reporter.log("running verify text",true);
		String expText=sh.getRow(0).getCell(2).getStringCellValue();
		String actText=h.verifyText();
		Assert.assertEquals(expText, actText);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("loguot from app",true);
	}
	
	@AfterClass
	public void 
	closeBrowser() {
		Reporter.log("close the browser",true);
	}
	
	
	
	
	
	
	
}
