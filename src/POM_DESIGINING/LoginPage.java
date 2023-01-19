package POM_DESIGINING;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//input[@id='username']")private WebElement un;
	
	@FindBy(xpath = "//input[@name='pwd']")private WebElement pwd;
	
	@FindBy(xpath = "//div[text()='Login ']")private  WebElement loginbtn;

	//USE CONSTRUCTOR
	  public LoginPage(WebDriver driver) {
		  PageFactory.initElements(driver,this);
		  
	  }
	  //USING GETTERS AND SETTERS 
	  public void enterun() {
		  un.sendKeys("admin");
	  }
	  public void enterpwd() {
		  pwd.sendKeys("manager");
	  }
	  public void clickLoginbtn() {
		  loginbtn.click();
	  }
	
	
	
	}
	
	

