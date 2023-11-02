package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllMobileBrands {
	
	Actions action;
	public AllMobileBrands(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action = new Actions (driver);
		}
	
	@FindBy(xpath="//img[@class='s-image'][1]")
	private WebElement Brand;
	public void click() {
		
		Brand.click();
	}
	@FindBy(className="a-button-input")
	private WebElemnt Buy;
	public void cclick() {
		
		
		
	}
	





}

