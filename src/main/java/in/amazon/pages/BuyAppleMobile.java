package in.amazon.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BuyAppleMobile{
	
	WebDriver driver;
	public BuyAppleMobile(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(id="buy-now-button")
	private WebElement buyBTN;
	
	public void clickOnBuyBTN() {

		buyBTN.click();
		
	}

}

