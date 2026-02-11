package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Basetest;
import pages.Loginpage;

public class LoginTest extends Basetest{

	@Test
	public void testValideLogin() {
		
		Loginpage loginPage = new Loginpage(driver);
		
		loginPage.enterUsername("admin@yourstore.com");
		loginPage.enterPassword("admin");
		loginPage.clickLogin();
		
		System.out.println("Title of the page is : "+ driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Just a moment...");
	}
}
