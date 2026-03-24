package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Basetest;
import pages.Loginpage;
import utils.ExtentReportManager;

public class LoginTest extends Basetest{

	@Test
	public void testValideLogin() {
		
		test = ExtentReportManager.createTest("Login Test");
		Loginpage loginPage = new Loginpage(driver);
		
		test.info("Adding credentials");
		loginPage.enterUsername("admin@yourstore.com");
		loginPage.enterPassword("admin");
		test.info("Clicking on Login button");
		loginPage.clickLogin();
		//loginPage.clickVerifyyouarehuman();
		
		test.info("Verifying Page Title");
		System.out.println("Title of the page is : "+ driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(), "Just a moment...");
		test.pass("Login Successful");
	}
}
