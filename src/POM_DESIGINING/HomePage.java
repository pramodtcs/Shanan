package POM_DESIGINING;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//td[text()='Enter Time-Track']")private WebElement text;
	
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver,this );
	}
public void verifyText () {
	String expT="Enter Time-Track";
	String actT=text.getText();
	
	if (actT.equals(actT)) {
		System.out.println("Tc is pass");
		
	}
		else{
			System.out.println("Tc ic fail ");
		}
	}
	

	
}
	
	

