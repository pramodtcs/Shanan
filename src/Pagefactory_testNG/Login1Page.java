package Pagefactory_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1Page {
	@FindBy(xpath = "//input[@id='username']")private WebElement UN;
	
	@FindBy(xpath = "//input[@name='pwd']")private WebElement PWD;
	
	@FindBy(xpath ="//div[text()='Login ']")private WebElement loginBTN;
	
	//initilizaton
	public  Login1Page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterUN(String username) {
		UN.sendKeys(username);
	}
	public void enterPWD(String password) {
		PWD.sendKeys(password);
		
	}
	public void clickLoginBTN() {
		loginBTN.click();
	}
	
		
	}
	
	
	


