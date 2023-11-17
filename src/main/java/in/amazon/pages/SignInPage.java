package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	public SignInPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(name="email")
	private WebElement userNameTextBox;
	public void enterEmail(String email) {
		userNameTextBox.sendKeys(email);
		
		
	}
	@FindBy(id="continue")
	private WebElement continueButton;
	public void clickConButton() {
		continueButton.click();
		
	}
	@FindBy(xpath="//span[@class='a-list-item']")
	private WebElement  errorMassage;
	public String getMessage() {
		return errorMassage.getText();
	
	}
	

}
