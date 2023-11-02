package in.amazon.tests;

import java.util.ArrayList;

import org.junit.Assert;
import org.testng.annotations.Test;

import in.amazon.pages.ApplePhones;
import in.amazon.pages.BuyAppleMobile;
import in.amazon.pages.LandingPage;

public class BuyMobileTest extends BaseTest {

	@Test
	public void BuyMobileTest() {
		LandingPage landing = new LandingPage(driver);
		landing.clickOnMobiles();
		landing.mouseHoverMobileAccesories();
		landing.clickOnAppleLink();

		ApplePhones applePhones = new ApplePhones(driver);
		applePhones.clickOnfirstItem();

		BuyAppleMobile buyMobile = new BuyAppleMobile(driver);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		buyMobile.clickOnBuyBTN();
		
		String actualtTitle = driver.getTitle();
		System.out.println(actualtTitle);
		
		String expectedTitle = "Amazon Sign In";
		System.out.println(expectedTitle);
		Assert.assertTrue(actualtTitle.contains(expectedTitle));

	}

}
