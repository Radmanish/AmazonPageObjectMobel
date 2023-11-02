package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplePhones {
	
	
	public ApplePhones(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//img[@class='s-image'])[1]")
	private WebElement firstItem ;
	
	public void clickOnfirstItem() {
		
		firstItem.click();
	}

	
	
	
	
}
