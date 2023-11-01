package in.amazon.tests;

import org.testng.annotations.Test;

import in.amazon.pages.LandingPage;

public class BuyMobileTest extends BaseTest {


	@Test
	public void BuyMobileTest() {
		LandingPage landing = new LandingPage(driver);
		landing.clickOnMobiles();
		landing.mouseHoverMobileAccesories();
		landing.clickOnAppleLink();
	}
	
}
