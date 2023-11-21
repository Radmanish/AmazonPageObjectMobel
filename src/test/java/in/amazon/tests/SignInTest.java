package in.amazon.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import in.amazon.pages.LandingPage;
import in.amazon.pages.SignInPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInTest extends BaseTest{
	
//	WebDriver driver;
//	Open the browser
//	2) Maximize it
//	3) Navigate to application
//	4) Hover pointer over 'Hello Sign-in' menu
//	5) Click on
//	'Sign-in' button in the sub-menu
//	6) Enter an invalid username in the email textbox
//	7) Click on Continue button
//	8) Verify the error message - We cannot find an account with that email address' is displayed.
//	9) Close the browser
	
	@Test
	public void singIn () {
		
		
		LandingPage landing=new LandingPage(driver);
		landing.mousHoverHelloSignIn();
		landing.clickSingInButton();
		SignInPage signIn=new SignInPage(driver);	
		signIn.enterEmail("asdfjalsdhw4545454545@gmail.com");
		signIn.clickConButton();
		signIn.getMessage();
		
		String expectedText= "We cannot find an account with that email address";
		String actualText=signIn.getMessage();
		Assert.assertEquals(expectedText, actualText);

}
}
