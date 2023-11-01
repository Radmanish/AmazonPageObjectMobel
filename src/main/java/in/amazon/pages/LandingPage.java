package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	Actions action;
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action = new Actions (driver);
		
	}
	@FindBy(linkText ="Mobiles")
	private WebElement mobiles;
	public void clickOnMobiles() {
		mobiles.click();
	}
	
	@FindBy(xpath= "(//span[@class='nav-a-content'])[2]")
	private WebElement MobileAccesries;
	public void mouseHoverMobileAccesories() {
		
		action.moveToElement(MobileAccesries).build().perform();
	}
	@FindBy(linkText = "Apple")
	private WebElement appleLink;
	public void clickOnAppleLink() {
		
		appleLink.click();
	}
	
}
