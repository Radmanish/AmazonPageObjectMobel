package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BuyAppleMobile {

	
	Actions action;
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action = new Actions (driver);
		
}
}
