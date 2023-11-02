package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//img[@alt='Apple iPhone 13 (128GB) - Starlight']")
	private WebElement select;
	public void click() {
		select.click();
	}
	
	@FindBy(name="submit.buy-now")
	private WebElement buy;
	public void click1() {
		buy.click();
	}
}
