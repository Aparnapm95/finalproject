package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginTest extends BaseClass{
	@Test
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication("aparna1995", "Aparna@1995");

        // You can add assertions here to validate login was successful
        // Example (not real selector):
        // Assert.assertTrue(driver.getTitle().contains("Search Hotel"));

        System.out.println("Login test executed successfully.");
    }

}
