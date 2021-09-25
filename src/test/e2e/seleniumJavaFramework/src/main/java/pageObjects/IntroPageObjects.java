package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonComponents.CommonUtities;


public class IntroPageObjects {
	
	@FindBy(id = "btnRenderChallenge")
	WebElement  bChallenge;
//	WebDriver wDriver;
	
	
	//Initialize all page objects for given driver instance
	public IntroPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
//		wDriver = driver;
	}
	
	public void clickme() {
		

		 bChallenge.click();
	
	}

	public WebElement getbChallenge() {
		return bChallenge;
	}


	
	

}
